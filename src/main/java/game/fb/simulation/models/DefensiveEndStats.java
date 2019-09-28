package main.java.game.fb.simulation.models;

/**
 * Defensive end statistics for a player.
 * Statistic "number" corresponds to the following:
 *  0. Speed
 *  1. Coverage
 *  2. Field vision
 *  3. Tackling
 *
 * @author abhi
 */
public class DefensiveEndStats implements PositionStats {

    private Position pos = Position.DEFENSIVE_END;

    @Override
    public Position getPosition() {
        return pos;
    }
}
