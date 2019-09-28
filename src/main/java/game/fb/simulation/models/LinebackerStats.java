package main.java.game.fb.simulation.models;

/**
 * Linebacker statistics for a player.
 * Statistic "number" corresponds to the following:
 *  0. Tackling
 *  1. Strength
 *  2. Coverage
 *  3. Vision
 *
 * @author jrt
 */
public class LinebackerStats implements PositionStats {

    private Position pos = Position.LINEBACKER;

    @Override
    public Position getPosition() {
        return pos;
    }
}
