package edu.bu.met.cs665.States;

import edu.bu.met.cs665.PositionStateEnum;
import edu.bu.met.cs665.TileModel;
import edu.bu.met.cs665.TileState;

public class IsShipTile implements TileState{
    char stateSymbol;

    TileModel tile;

    public IsShipTile(TileModel newTile){
        tile = newTile;
        stateSymbol = PositionStateEnum.SHIP.getStateSymbol();
    }

    @Override
    public void waterTile() {
        //can't transition back to water tile
    }

    @Override
    public void shipTile() {
        //This is a ship tile
    }

    @Override
    public void missTile() {
        //can't transition to missed tile
    }

    @Override
    public void hitTile() {
        //transitions to hit if fired on from this state
        tile.setTileState(tile.getIsHitTileState());
    }

    /**
     * Gets stateSymbol
     * Input parameter: None
     * Output: The stateSymbol of the IsWaterTile
     *
     * @return value of stateSymbol
     */
    public char getStateSymbol() {
        return stateSymbol;
    }
}
