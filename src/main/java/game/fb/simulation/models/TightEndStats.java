package main.java.game.fb.simulation.models;

/**
 * Tight end statistics for a player.
 * Statistic "number" corresponds to the following:
 *  0. Blocking
 *  1. Catching
 *  2. Speed
 *  3. Strength
 *
 * @author abhi
 */
public class TightEndStats implements PositionStats {

    private Position pos = Position.TIGHT_END;

    @Override
    public Position getPosition() {
        return pos;
    }
}
