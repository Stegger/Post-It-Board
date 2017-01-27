/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicexample.gui.model;

import dynamicexample.be.PostIt;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author pgn
 */
public class PostItModel
{
    
    private final StringProperty titel = new SimpleStringProperty();
    private final StringProperty text = new SimpleStringProperty();
    
    private final PostIt postIt;
    
    public PostItModel(PostIt postIt)
    {
        this.postIt = postIt;
        titel.set(postIt.getTitel());
        text.set(postIt.getText());
    }
    
    public PostIt getPostIt()
    {
        return postIt;
    }
    
    public String getText()
    {
        return text.get();
    }
    
    public void setText(String value)
    {
        text.set(value);
        postIt.setText(value);
    }
    
    public StringProperty textProperty()
    {
        return text;
    }
    
    public String getTitel()
    {
        return titel.get();
    }
    
    public void setTitel(String value)
    {
        titel.set(value);
        postIt.setTitel(value);
    }
    
    public StringProperty titelProperty()
    {
        return titel;
    }
    
}
