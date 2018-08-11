package edu.bu.met.cs665.States;

import edu.bu.met.cs665.PositionStateEnum;
import edu.bu.met.cs665.TileModel;
import edu.bu.met.cs665.TileState;

public class IsHitTile implements TileState {
    private char stateSymbol;

    TileModel tile;

    public IsHitTile(TileModel newTile){
        tile = newTile;
        stateSymbol = PositionStateEnum.HIT.getStateSymbol();
    }

    @Override
    public void waterTile() {
        // Can't transition back to a water tile
    }

    @Override
    public void shipTile() {
        // Can't transition to a ship tile
    }

    @Override
    public void missTile() {
        // Can't transition to a missed tile
    }

    @Override
    public void hitTile() {
        // Already a hit tile
    }

    /**
     * Gets stateSymbol
     * Input parameter: None
     * Output: The stateSymbol of the IsHitTile
     *
     * @return value of stateSymbol
     */
    public char getStateSymbol() {
        return stateSymbol;
    }
}
