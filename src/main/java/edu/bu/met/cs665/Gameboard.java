package edu.bu.met.cs665;


import edu.bu.met.cs665.States.IsWaterTile;

public class Gameboard {
    //TODO: Starting Board should be created by the user and not hard coded

    private TileModel[][] playerGameboard;


    public Gameboard(){
        playerGameboard = createTilesForGameboard(5, 5);
    }

    public Gameboard(int columns, int rows){

    }

    public TileModel[][] createTilesForGameboard(int columns, int rows){
        TileModel[][] gameboardTiles = new TileModel[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns ; j++) {
                TileModel tile = new TileModel();
                gameboardTiles[i][j]  = tile;
            }
        }
        return gameboardTiles;
    }

    /**
     * Initialize Gameboard
     *
     * Set the position of the player's ship
     * @param x
     * @param y
     * @return
     */
    public void initializeGameboard(int x, int y) throws ArrayIndexOutOfBoundsException{

        //this.playerGameboard[x][y] = PositionStateEnum.SHIP.getStateSymbol();
        playerGameboard[x][y].shipTile();
    }

    public void displayGameboard() {
        //print top labels
        System.out.print("  ");
        for (int i = 0; i < this.playerGameboard.length; i++) {
            System.out.print(i + " ");
        }
        System.out.print("x");

        //print each line
        for (int i = 0; i < this.playerGameboard.length; i++) {
            System.out.print("\n" + i + " ");
            for (int j = 0; j < this.playerGameboard[i].length; j++) {
                System.out.print(this.playerGameboard[i][j].displayTile());
                System.out.print(" ");
            }

        }
        System.out.println("\ny");
        System.out.println("\n " + PositionStateEnum.WATER.getStateSymbol() + " : Open water \n " +
                PositionStateEnum.SHIP.getStateSymbol() +" : your ship");
    }


}
