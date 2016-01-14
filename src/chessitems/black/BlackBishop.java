package chessitems.black;

import chessitems.BlackItem;
import chessitems.ChessItem;
import colors.Black;

/**
 * Created by Levon on 1/9/2016.
 */
public class BlackBishop extends BlackItem {

    private static int count=0;


    public BlackBishop(){
        setCount(getCount()+1);
    }


    public static int getCount() {
        return count;
    }


    public void setCount(int count) {
        this.count=count;

    }

    @Override
    public String toString() {
        return Black.BISHOP;
    }
}
