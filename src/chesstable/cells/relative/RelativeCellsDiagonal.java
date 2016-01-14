package chesstable.cells.relative;

import chesstable.cells.Cell;

import java.util.ArrayList;

/**
 * Created by Levon on 1/10/2016.
 */
public class RelativeCellsDiagonal {
    private ArrayList<Cell> relativeCells=new ArrayList<Cell>();
    public RelativeCellsDiagonal(Cell cell1)
    {
        relativeCells.add(cell1);


    }
    public RelativeCellsDiagonal(Cell cell1, Cell cell2)
    {
        relativeCells.add(cell1);
        relativeCells.add(cell2);

    }
    public RelativeCellsDiagonal(Cell cell1, Cell cell2, Cell cell3)
    {
        relativeCells.add(cell1);
        relativeCells.add(cell2);
        relativeCells.add(cell3);

    }

    public RelativeCellsDiagonal(Cell cell1, Cell cell2, Cell cell3, Cell cell4)
    {
        relativeCells.add(cell1);
        relativeCells.add(cell2);
        relativeCells.add(cell3);
        relativeCells.add(cell4);

    }

    public ArrayList<Cell> getRelativeCells()
    {
        return relativeCells;
    }
}
