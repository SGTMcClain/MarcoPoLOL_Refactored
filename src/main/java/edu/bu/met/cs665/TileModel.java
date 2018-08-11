package edu.bu.met.cs665;

import edu.bu.met.cs665.States.IsHitTile;
import edu.bu.met.cs665.States.IsMissTile;
import edu.bu.met.cs665.States.IsShipTile;
import edu.bu.met.cs665.States.IsWaterTile;

public class TileModel {
    private char positionState;
    TileState isWaterTile;
    TileState isShipTile;
    TileState isMissTile;
    TileState isHitTile;

    TileState tileState;

    public TileModel(){
        isWaterTile = new IsWaterTile(this);
        isShipTile = new IsShipTile(this);
        isMissTile = new IsMissTile(this);
        isHitTile = new IsHitTile(this);

        //default tile state
        tileState = isWaterTile;
    }

    public void setTileState(TileState newTileState){
        tileState = newTileState;
    }

    public char displayTile(){
        positionState = tileState.getStateSymbol();

        return positionState;
    }

    public void waterTile(){
        tileState.waterTile();
    }

    public void shipTile(){
        tileState.shipTile();
    }

    public void missTile(){
        tileState.missTile();
    }

    public void hitTile(){
        tileState.hitTile();
    }

    public TileState getIsWaterTileState() {return isWaterTile;}
    public TileState getIsShipTileState() {return isShipTile;}
    public TileState getIsMissTileState() {return isMissTile;}
    public TileState getIsHitTileState() {return isHitTile;}
}
