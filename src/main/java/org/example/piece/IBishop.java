package org.example.piece;

import java.util.HashSet;
import java.util.Set;

public interface IBishop {
    default Set<CoodinatesShift> getBishopMoves() {
        Set<CoodinatesShift> result = new HashSet<>();

        // bottom-left to top-right
        for (int i = -7; i <= 7; i++) {
            if (i == 0) continue;
            result.add(new CoodinatesShift(i, i));
        }

        // top-left to bottom-right
        for (int i = -7; i <= 7; i++) {
            if (i == 0) continue;
            result.add(new CoodinatesShift(i, -i));
        }

        return result;
    }
}
