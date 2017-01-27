/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicexample.gui.controller;

import dynamicexample.gui.model.PostItBoardModel;
import dynamicexample.gui.model.PostItModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;

/**
 *
 * @author pgn
 */
public class DynamicvViewController implements Initializable, ListChangeListener<PostItModel>
{

    private PostItBoardModel boardModel;

    @FXML
    private ScrollPane containerForPostItBoard;

    @FXML
    private TilePane postItBoard;

    public DynamicvViewController()
    {
        boardModel = PostItBoardModel.getInstance();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        //Bind the width of the flowpane to the width of the scrollpane: 
        //(I do not bind the height because the flowpane should resize to it's content)
        postItBoard.prefWidthProperty().bind(containerForPostItBoard.widthProperty());
        boardModel.getAllPostIts().addListener(this);
    }

    @Override
    public void onChanged(Change<? extends PostItModel> c)
    {
        while (c.next())
        {
            if (c.wasAdded())
            {
                addNewPostItView(c);
            } else if (c.wasRemoved())
            {
                removeRemovedPostIts(c);
            } else
            {
                //TODO other
            }

        }
    }

    private void addNewPostItView(Change<? extends PostItModel> c)
    {
        for (PostItModel model : c.getAddedSubList())
        {
            try
            {
                postItBoard.getChildren().add(getPostItView(model));
            } catch (IOException ex)
            {
                System.out.println("BAD PRACTICE, YOUR DROWNING AN EXCEPTION!!!");
            }
        }
    }

    private Node getPostItView(PostItModel model) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/dynamicexample/gui/view/SinglePostIt.fxml"));
        AnchorPane postIt = loader.load();
        SinglePostItController singlePostItController = loader.getController();
        singlePostItController.setModel(model);
        return postIt;
    }

    private void removeRemovedPostIts(Change<? extends PostItModel> c)
    {
        postItBoard.getChildren().remove(c.getFrom(), c.getTo());
    }

}
