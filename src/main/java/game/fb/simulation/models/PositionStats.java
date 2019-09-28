package main.java.game.fb.simulation.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author abhi
 */
public interface PositionStats {

    Map<Integer, Double> stats = new HashMap<>();

    Position getPosition();

    default double getStat(int num) {
        if ((num < 0) || (num > 3)) {
            return -1.0;
        }

        return stats.get(num);
    }

    default void setStat(int num, double val) {
        if ((num < 0) || (num > 3)) {
            return;
        }

        stats.put(num, val);
    }

    default List<Double> getStats() {
        if (stats.isEmpty()) {
            return new ArrayList<>();
        }

        List<Double> stats = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            stats.get(i);
        }

        return stats;
    }
}
