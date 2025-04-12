package org.example.piece;

import org.example.Color;
import org.example.Coordinates;

import java.util.Set;

public class Queen extends LongRangePiece implements IRook, IBishop {
    public Queen(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoodinatesShift> getPieceMoves() {
        Set<CoodinatesShift> moves = getBishopMoves();
        moves.addAll(getRookMoves());

        return moves;
    }
}
