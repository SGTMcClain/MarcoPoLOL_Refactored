package edu.bu.met.cs665;

/**
 * Player
 *
 * Technically a singleton except that it allows for only 2 instances of a player
 */
public class Player {
    private String playerName;
    private char[][] playerBoard;
    private char[][] opponentBoard;
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
            return player1;
        } else if (player1 != null && player2 == null){
            player2 = new Player();
        } return player2;
    }

    public void sendFireCommandToGameController(){

    }

    public void updateGameboard(){

    }

    public void updateHitboard(){

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
     * Gets playerBoard
     * Input parameter: None
     * Output: The playerBoard of the Player
     *
     * @return value of playerBoard
     */
    public char[][] getPlayerBoard() {
        return playerBoard;
    }

    /**
     * Sets playerBoard
     * Input Parameter: playerBoard
     * Output: None
     * Postcondition: The playerBoard of the Player was set to the given playerBoard
     */
    public void setPlayerBoard(char[][] playerBoard) {
        this.playerBoard = playerBoard;
    }

    /**
     * Gets opponentBoard
     * Input parameter: None
     * Output: The opponentBoard of the Player
     *
     * @return value of opponentBoard
     */
    public char[][] getOpponentBoard() {
        return opponentBoard;
    }

    /**
     * Sets opponentBoard
     * Input Parameter: opponentBoard
     * Output: None
     * Postcondition: The opponentBoard of the Player was set to the given opponentBoard
     */
    public void setOpponentBoard(char[][] opponentBoard) {
        this.opponentBoard = opponentBoard;
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

    /**
     * Sets gameboard
     * Input Parameter: gameboard
     * Output: None
     * Postcondition: The gameboard of the Player was set to the given gameboard
     */
    public void setGameboard(Gameboard gameboard) {
        this.gameboard = gameboard;
    }


    /**
     * Gets player1
     * Input parameter: None
     * Output: The player1 of the Player
     *
     * @return value of player1
     */
    public static Player getPlayer1() {
        return player1;
    }

    /**
     * Sets player1
     * Input Parameter: player1
     * Output: None
     * Postcondition: The player1 of the Player was set to the given player1
     */
    public static void setPlayer1(Player player1) {
        Player.player1 = player1;
    }

    /**
     * Gets player2
     * Input parameter: None
     * Output: The player2 of the Player
     *
     * @return value of player2
     */
    public static Player getPlayer2() {
        return player2;
    }

    /**
     * Sets player2
     * Input Parameter: player2
     * Output: None
     * Postcondition: The player2 of the Player was set to the given player2
     */
    public static void setPlayer2(Player player2) {
        Player.player2 = player2;
    }
}
