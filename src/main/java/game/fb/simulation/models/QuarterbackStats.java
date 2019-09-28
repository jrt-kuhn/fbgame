package main.java.game.fb.simulation.models;

/**
 * Quarterback statistics for a player.
 * Statistic "number" corresponds to the following:
 *  0. Arm strength
 *  1. Accuracy
 *  2. Agility
 *  3. Vision
 *
 * @author abhi
 */
public class QuarterbackStats implements PositionStats {

    private Position pos = Position.QUARTERBACK;

    @Override
    public Position getPosition() {
        return pos;
    }
}
