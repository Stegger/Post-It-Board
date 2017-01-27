/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicexample.dal;

import dynamicexample.be.PostIt;

/**
 *
 * @author pgn
 */
public class PostItDaoMOCK
{

    private static final String[] titles =
    {
        "Titel", "Header", "ATTENTION", "Mmmmh....", "Starting over", "Oh, the combo's"
    };

    private static final String[] texts =
    {
        "Hello world", "I'm a postIt", "Are you excited about the second semester?", "I love cake", "1 L0\\/3 j4\\/4"
    };

    private int titelCounter;
    private int textCounter;

    public PostItDaoMOCK()
    {
        titelCounter = 0;
        textCounter = 0;
    }

    public PostIt getPostIt()
    {
        PostIt reult = new PostIt(titles[titelCounter], texts[textCounter]);
        titelCounter = ++titelCounter % titles.length;
        textCounter = ++textCounter % texts.length;
        return reult;
    }

}
