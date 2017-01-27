/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicexample.be;

/**
 *
 * @author pgn
 */
public class PostIt
{

    private String titel;

    private String text;

    public PostIt(String titel, String text)
    {
        this.titel = titel;
        this.text = text;
    }

    /**
     * Get the value of text
     *
     * @return the value of text
     */
    public String getText()
    {
        return text;
    }

    /**
     * Set the value of text
     *
     * @param text new value of text
     */
    public void setText(String text)
    {
        this.text = text;
    }

    /**
     * Get the value of titel
     *
     * @return the value of titel
     */
    public String getTitel()
    {
        return titel;
    }

    /**
     * Set the value of titel
     *
     * @param titel new value of titel
     */
    public void setTitel(String titel)
    {
        this.titel = titel;
    }

}
