package main.java.game.fb.simulation.models;

/**
 * Wide receiver statistics for a player.
 * Statistic "number" corresponds to the following:
 *  0. Blocking
 *  1. Catching
 *  2. Speed
 *  3. Route-running
 *
 * @author abhi
 */
public class WideReceiverStats implements PositionStats {

    private Position pos = Position.WIDE_RECEIVER;

    @Override
    public Position getPosition() {
        return pos;
    }
}
