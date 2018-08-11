package edu.bu.met.cs665.States;

import edu.bu.met.cs665.PositionStateEnum;
import edu.bu.met.cs665.TileModel;
import edu.bu.met.cs665.TileState;

public class IsWaterTile implements TileState{
    private char stateSymbol;

    TileModel tile;

    public IsWaterTile(TileModel newTile){
        tile = newTile;
        stateSymbol = PositionStateEnum.WATER.getStateSymbol();
    }


    @Override
    public void waterTile() {
        //this is a water tile so it can't transition to a water tile

    }

    @Override
    public void shipTile() {
        //transition to a ship time but only at the beginning of the game
        tile.setTileState(tile.getIsShipTileState());
    }

    @Override
    public void missTile() {
        //transition to a missed tile if fired at
        tile.setTileState(tile.getIsMissTileState());

    }

    @Override
    public void hitTile() {
        //can't be a hit tile because it is not a ship
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

