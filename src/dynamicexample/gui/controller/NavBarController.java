/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicexample.gui.controller;

import dynamicexample.gui.model.PostItBoardModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author pgn
 */
public class NavBarController implements Initializable
{

    PostItBoardModel boardModel;

    public NavBarController()
    {
        boardModel = PostItBoardModel.getInstance();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }

    @FXML
    private void addNewPostIt(ActionEvent event)
    {
        boardModel.CreateNewPostIt();
    }

    @FXML
    private void removeSelectedPostIt(ActionEvent event)
    {
        boardModel.removePostIt(0);
    }

}
