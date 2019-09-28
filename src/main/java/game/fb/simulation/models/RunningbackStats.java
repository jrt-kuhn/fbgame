package main.java.game.fb.simulation.models;

/**
 * Runningback statistics for a player.
 * Statistic "number" corresponds to the following:
 *  0. Agility
 *  1. Strength
 *  2. Speed
 *  3. Vision
 *
 * @author abhi
 */
public class RunningbackStats implements PositionStats {

    private Position pos = Position.RUNNINGBACK;

    @Override
    public Position getPosition() {
        return pos;
    }
}
