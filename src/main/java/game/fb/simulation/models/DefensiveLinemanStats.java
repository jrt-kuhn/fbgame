package main.java.game.fb.simulation.models;

/**
 * Defensive lineman statistics for a player.
 * Statistic "number" corresponds to the following:
 *  0. Size
 *  1. Run def
 *  2. Pass rush
 *  3. Tackling
 *
 * @author abhi
 */
public class DefensiveLinemanStats implements PositionStats {

    private Position pos = Position.DEFENSIVE_LINEMAN;

    @Override
    public Position getPosition() {
        return pos;
    }
}
