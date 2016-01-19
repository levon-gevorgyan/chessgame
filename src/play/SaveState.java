package play;

import chessitems.ChessItem;
import chesstable.Table;
import chesstable.cells.BlackCell;
import chesstable.cells.Cell;
import chesstable.cells.WhiteCell;


import java.util.HashMap;
import java.util.Map;

//Created by Levon on 17.01.2016.


public class SaveState {
    private Map<String, ChessItem> whitePlayerItems;
    private Map<String, ChessItem> blackPlayerItems;
    private Cell cellFrom;
    private Cell cellTo;
    private Table table;


    public Table getTable() {
        return table;
    }

    public SaveState(String string, Map<String, ChessItem> whitePlayerItems,Map<String, ChessItem> blackPlayerItems, Table table)
    {

        String from=Character.toString(string.toCharArray()[0])+Character.toString(string.toCharArray()[1]);
        String to=Character.toString(string.toCharArray()[2])+Character.toString(string.toCharArray()[3]);
        Cell cellFrom=table.getCellByString(from);
        Cell cellTo=table.getCellByString(to);

        if (cellFrom instanceof WhiteCell)
        {
            cellFrom=new WhiteCell(from.toCharArray()[0],Character.getNumericValue(from.toCharArray()[1]),
                    table.getCellByString(from).getChessItem());
        }
        if (cellFrom instanceof BlackCell)
        {
            cellFrom=new BlackCell(from.toCharArray()[0],Character.getNumericValue(from.toCharArray()[1]),
                    table.getCellByString(from).getChessItem());
        }
        if (cellTo instanceof WhiteCell)
        {
            cellTo=new WhiteCell(to.toCharArray()[0],Character.getNumericValue(to.toCharArray()[1]),
                    table.getCellByString(to).getChessItem());
        }
        if (cellTo instanceof BlackCell)
        {
            cellTo=new BlackCell(to.toCharArray()[0],Character.getNumericValue(to.toCharArray()[1]),
                    table.getCellByString(to).getChessItem());
        }

        Map<String, ChessItem> whitePlayerItemsSave = new HashMap<>();
        Map<String, ChessItem> blackPlayerItemsSave = new HashMap<>();

        whitePlayerItemsSave.putAll(whitePlayerItems);

        blackPlayerItemsSave.putAll(blackPlayerItems);

        this.whitePlayerItems=whitePlayerItemsSave;
        this.blackPlayerItems=blackPlayerItemsSave;
        this.cellFrom=cellFrom;
        this.cellTo=cellTo;
        this.table=table;


    }

    public Map<String, ChessItem> getWhitePlayerItems() {
        return this.whitePlayerItems;
    }

    public Map<String, ChessItem> getBlackPlayerItems() {
        return this.blackPlayerItems;
    }

    public Cell getCellFrom() {
        return cellFrom;
    }

    public Cell getCellTo() {
        return cellTo;
    }
}
