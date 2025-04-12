package org.example.piece;

import java.util.HashSet;
import java.util.Set;

public interface IRook {
    default Set<CoodinatesShift> getRookMoves() {
        Set<CoodinatesShift> result = new HashSet<>();

        // left to right
        for (int i = -7; i <= 7; i++) {
            if (i == 0) continue;
            result.add(new CoodinatesShift(i, 0));
        }

        // bottom to top
        for (int i = -7; i <= 7; i++) {
            if (i == 0) continue;
            result.add(new CoodinatesShift(0, i));
        }

        return result;
    }
}
