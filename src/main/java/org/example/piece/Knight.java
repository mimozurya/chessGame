package org.example.piece;

import org.example.Color;
import org.example.Coordinates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Knight extends Piece {
    public Knight(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoodinatesShift> getPieceMoves() {
        return new HashSet<>(Arrays.asList(
                new CoodinatesShift(1, 2),
                new CoodinatesShift(2, 1),

                new CoodinatesShift(2, -1),
                new CoodinatesShift(1, -2),

                new CoodinatesShift(-2, -1),
                new CoodinatesShift(-1, -2),

                new CoodinatesShift(-2, 1),
                new CoodinatesShift(-1, 2)
        ));
    }
}
