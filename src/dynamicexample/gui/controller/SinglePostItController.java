/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicexample.gui.controller;

import dynamicexample.gui.model.PostItModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 * FXML Controller class
 *
 * @author pgn
 */
public class SinglePostItController implements Initializable
{

    @FXML
    private Label lblText;
    @FXML
    private Label lblTitel;

    private PostItModel model;
    

    public PostItModel getModel()
    {
        return model;
    }

    public void setModel(PostItModel model)
    {
        this.model = model;
        lblTitel.textProperty().bind(model.titelProperty());
        lblText.textProperty().bind(model.textProperty());
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}