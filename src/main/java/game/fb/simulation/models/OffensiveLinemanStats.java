package main.java.game.fb.simulation.models;

/**
 * Offensive Lineman statistics for a player.
 * Statistic "number" corresponds to the following:
 *  0. Run blocking
 *  1. Strength
 *  2. Speed
 *  3. Pass protection
 *
 * @author abhi
 */
public class OffensiveLinemanStats implements PositionStats {

    private Position pos = Position.OFFENSIVE_LINEMAN;

    @Override
    public Position getPosition() {
        return pos;
    }
}
