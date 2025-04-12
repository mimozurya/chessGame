package org.example.piece;

import org.example.board.Board;
import org.example.Color;
import org.example.Coordinates;
import org.example.board.BoardUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pawn extends Piece {
    public Pawn(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoodinatesShift> getPieceMoves() {
        Set<CoodinatesShift> result = new HashSet<>();

        if (color == Color.WHITE) {
            result.add(new CoodinatesShift(0, 1));

            if (coordinates.rank == 2) {
                result.add(new CoodinatesShift(0, 2));
            }
            result.add(new CoodinatesShift(-1, 1));
            result.add(new CoodinatesShift(1, 1));

        } else {
            result.add(new CoodinatesShift(0, -1));
            if (coordinates.rank == 7) {
                result.add(new CoodinatesShift(0, -2));
            }

            result.add(new CoodinatesShift(-1, -1));
            result.add(new CoodinatesShift(1, -1));
        }

        return result;
    }

    @Override
    protected Set<CoodinatesShift> getPieceAttacks() {
        Set<CoodinatesShift> result = new HashSet<>();

        if (color == Color.WHITE) {
            result.add(new CoodinatesShift(-1, 1));
            result.add(new CoodinatesShift(1, 1));
        } else {
            result.add(new CoodinatesShift(-1, -1));
            result.add(new CoodinatesShift(1, -1));
        }

        return result;
    }

    @Override
    protected boolean isSquareAvailableForMove(Coordinates coordinates, Board board) {
        if (this.coordinates.file == coordinates.file) {
            int rankShift = Math.abs(this.coordinates.rank - coordinates.rank);

            if (rankShift == 2) {
                List<Coordinates> between = BoardUtils.getVerticalCoordinatesBetween(this.coordinates, coordinates);
                return (board.isSquareEmpty(between.get(0))) && board.isSquareEmpty(coordinates);
            } else {
                return board.isSquareEmpty(coordinates);
            }
        } else {
            if (board.isSquareEmpty(coordinates)) {
                return false;
            } else {
                return board.getPiece(coordinates).color != color;
            }
        }
    }
}
