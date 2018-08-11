package edu.bu.met.cs665.States;

import edu.bu.met.cs665.PositionStateEnum;
import edu.bu.met.cs665.TileModel;
import edu.bu.met.cs665.TileState;

/**
 * Once a tile is assumes the missed tile state it cannot be changed to any other state
 */
public class IsMissTile implements TileState{

    private char stateSymbol;

    TileModel tile;

    public IsMissTile(TileModel newTile){
        tile = newTile;
        stateSymbol = PositionStateEnum.MISS.getStateSymbol();
    }

    @Override
    public void waterTile() {
        //Can't transition back to a water tile
    }

    @Override
    public void shipTile() {
        //Cant't transition to a ship tile
    }

    @Override
    public void missTile() {
        //Already a missed tile
    }

    @Override
    public void hitTile() {
        //Can't transition to a hit tile
    }

    /**
     * Gets stateSymbol
     * Input parameter: None
     * Output: The stateSymbol of the IsMissTile
     *
     * @return value of stateSymbol
     */
    public char getStateSymbol() {
        return stateSymbol;
    }
}
