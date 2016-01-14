package moves.available.moves;

import chesstable.cells.Cell;
import exceptions.cell.NoCell;
import exceptions.cell.NotEmptyCell;
import exceptions.table.OutOfTable;
import moves.Move;

import java.util.ArrayList;

/**
 * Created by levon.gevorgyan on 12/01/16.
 */
public abstract class RookMoves extends AvailableMoves {
    public ArrayList<Cell> rookMovesLeft(Cell cell) {
        ArrayList<Cell> rookMovesLeft = new ArrayList<>();
        try {

            rookMovesLeft.addAll(Move.moveLeftUntilNotEmpty(cell));


        } catch (NoCell noCell) {

        } catch (NotEmptyCell notEmptyCell) {

        } catch (OutOfTable outOfTable) {

        }
        return rookMovesLeft;

    }

    public ArrayList<Cell> rookMovesRight(Cell cell) {
        ArrayList<Cell> rookMovesRight = new ArrayList<>();
        try {


            rookMovesRight.addAll(Move.moveRightUntilNotEmpty(cell));


        } catch (NoCell noCell) {

        } catch (NotEmptyCell notEmptyCell) {

        } catch (OutOfTable outOfTable) {

        }
        return rookMovesRight;

    }

    public ArrayList<Cell> rookMovesUp(Cell cell) {
        ArrayList<Cell> rookMovesUp = new ArrayList<>();
        try {


            rookMovesUp.addAll(Move.moveUpUntilNotEmpty(cell));


        } catch (NoCell noCell) {

        } catch (NotEmptyCell notEmptyCell) {

        } catch (OutOfTable outOfTable) {

        }
        return rookMovesUp;

    }

    public ArrayList<Cell> rookMovesDown(Cell cell) {
        ArrayList<Cell> rookMovesDown = new ArrayList<>();
        try {


            rookMovesDown.addAll(Move.moveDownUntilNotEmpty(cell));

        } catch (NoCell noCell) {

        } catch (NotEmptyCell notEmptyCell) {

        } catch (OutOfTable outOfTable) {

        }
        return rookMovesDown;

    }



}
