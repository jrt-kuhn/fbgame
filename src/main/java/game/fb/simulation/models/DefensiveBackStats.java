package main.java.game.fb.simulation.models;

/**
 * Defensive Back statistics for a player.
 * Statistic "number" corresponds to the following:
 *  0. Speed
 *  1. Coverage
 *  2. Field Vision
 *  3. Tackling
 *
 * @author jrt
 */
public class DefensiveBackStats implements PositionStats {

    private Position pos = Position.DEFENSIVE_BACK;

    @Override
    public Position getPosition() {
        return pos;
    }
}
