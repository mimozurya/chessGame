package org.example.piece;

import org.example.Color;
import org.example.Coordinates;

import java.util.Set;

public class Rook extends Piece {
    public Rook(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoodinatesShift> getPieceMoves() {
        return null;
    }
}
