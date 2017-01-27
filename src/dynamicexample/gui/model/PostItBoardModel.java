/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicexample.gui.model;

import dynamicexample.be.PostIt;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author pgn
 */
public class PostItBoardModel
{

    private static PostItBoardModel INSTANCE;

    private ObservableList<PostItModel> allPostIts;

    public static synchronized PostItBoardModel getInstance()
    {
        if (INSTANCE == null)
        {
            INSTANCE = new PostItBoardModel();
        }
        return INSTANCE;
    }

    private PostItBoardModel()
    {
        allPostIts = FXCollections.observableArrayList();
    }

    public void CreateNewPostIt()
    {
        allPostIts.add(new PostItModel(new PostIt("", "")));
    }

    public ObservableList<PostItModel> getAllPostIts()
    {
        return allPostIts;
    }

    public void removePostIt(int i)
    {
        //TODO Drag n drop!!! Gives you access to the MODEL!!!
    }

}
