package chessitems.white;

import chessitems.WhiteItem;
import colors.White;

/**
 * Created by Levon on 1/16/2016.
 */
public class WhiteRookA extends WhiteRook {
    private static int count=0;

    public WhiteRookA(){
        setCount(getCount()+1);
    }


    public static int getCount() {
        return count;
    }




    @Override
    public String toString() {
        return White.ROOK;
    }
}
