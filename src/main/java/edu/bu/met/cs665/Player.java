package edu.bu.met.cs665;

/**
 * Player
 *
 * Technically a singleton except that it allows for only 2 instances of a player
 */
public class Player {
    private String playerName;
    private Gameboard gameboard;

    private static Player player1;
    private static Player player2;

    private Player(){
        //this.playerName = playerName;
        this.gameboard = new Gameboard();

    }

    public static Player createNewPlayer(){
        if (player1 == null){ //if there is no player one create a player 1
            player1 = new Player();
            player1.setPlayerName("Player 1");
            return player1;
        } else if (player1 != null && player2 == null){
            player2 = new Player();
            player2.setPlayerName("Player 2");
        } return player2;
    }


    /**
     * Gets playerName
     * Input parameter: None
     * Output: The playerName of the Player
     *
     * @return value of playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Sets playerName
     * Input Parameter: playerName
     * Output: None
     * Postcondition: The playerName of the Player was set to the given playerName
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }



    /**
     * Gets gameboard
     * Input parameter: None
     * Output: The gameboard of the Player
     *
     * @return value of gameboard
     */
    public Gameboard getGameboard() {
        return gameboard;
    }

}
