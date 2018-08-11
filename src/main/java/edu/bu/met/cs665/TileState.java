package edu.bu.met.cs665;

public interface TileState {
    void waterTile();
    void shipTile();
    void missTile();
    void hitTile();
    char getStateSymbol();
}
