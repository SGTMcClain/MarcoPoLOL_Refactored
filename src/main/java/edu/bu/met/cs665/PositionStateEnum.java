package edu.bu.met.cs665;

public enum PositionStateEnum {
    SHIP('S'),
    WATER('-'),
    HIT('X'),
    MISS('*');

    private char stateSymbol;

    PositionStateEnum(char stateSymbol){
        this.stateSymbol = stateSymbol;
    }

    public char getStateSymbol(){
        return this.stateSymbol;
    }

}
