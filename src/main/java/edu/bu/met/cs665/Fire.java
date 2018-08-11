package edu.bu.met.cs665;

public class Fire implements FireCommand_I{
    Player currentPlayer;
    int x, y;
    GameController_Singleton gameController;

    public Fire (int x, int y, Player player, GameController_Singleton gameController){
        this.x = x;
        this.y = y;
        this.currentPlayer = player;
        this.gameController = gameController;
    }

    public void execute() {

    }
    public void undo() {

    }
}
