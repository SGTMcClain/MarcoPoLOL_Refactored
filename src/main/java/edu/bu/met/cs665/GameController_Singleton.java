package edu.bu.met.cs665;

import java.util.*;
import java.util.HashMap;

public class GameController_Singleton {
    // Should be a singleton since it wouldn't make sense to have two GameControllers
    private static GameController_Singleton uniqueInstance;

    private Player player1;
    private Player player2;


    private GameController_Singleton() {
        this.player1 = Player.createNewPlayer();
        this.player2 = Player.createNewPlayer();
    }

    public static GameController_Singleton getInstance(){
        if (uniqueInstance == null) {uniqueInstance = new GameController_Singleton();}
        return uniqueInstance;
    }



    public void startGame(){
        //TODO: Have the user choose the gameboard size
        //TODO: Have the user choose the opponent (human vs AI)


        //TODO: put this logic into a method
        boolean playerSetupSuccess = false;
        HashMap<String, Integer> coordinates;
        while (!playerSetupSuccess) {
            try {
                //Show Player 1 the gameboard
                player1.getGameboard().displayGameboard();

                //Prompt Player One to place their ship
                System.out.println("\n Player 1 select where you would like to place your ship");
                coordinates = getCoordinates();
                player1.getGameboard().initializeGameboard(coordinates.get("x"), coordinates.get("y"));
                playerSetupSuccess = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Incorrect (x,y) locations please try again\n");

            }

        }

        //Show Player 1 the gameboard after their selection
        player1.getGameboard().displayGameboard();
        //Confirm location with Player 1???

        // End Player 1's Turn
        System.out.println("\n|-------------------------|");
        System.out.println("|  END PLAYER 1 SETUP     |");
        System.out.println("|-------------------------|");
        //Scroll Screen???

        //Reset playerSetupSuccess
        playerSetupSuccess = false;

        //TODO: use method created for player1
        //Show Player 2 their gameboard

        while (!playerSetupSuccess) {
            try {
                //Show Player 1 the gameboard
                player2.getGameboard().displayGameboard();

                //Prompt Player One to place their ship
                System.out.println("\n Player 2 select where you would like to place your ship");
                coordinates = getCoordinates();
                player2.getGameboard().initializeGameboard(coordinates.get("x"), coordinates.get("y"));
                playerSetupSuccess = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Incorrect (x,y) locations please try again\n");

            }

        }
        //Show Player 2 the gameboard after their selection
        player2.getGameboard().displayGameboard();
        //Confirm location with Player 2???

        // End Player 2's Turn
        System.out.println("\n|-------------------------|");
        System.out.println("|  END PLAYER 2 SETUP     |");
        System.out.println("|-------------------------|");

        //Game Successfully Started Go to Game Loop
    }

    //player1's turn

    //player2's turn

    //TODO: Project logic (GAME_LOOP Pattern) goes here
    public void gameLoop(){  //implement this for the project
        //Player 1 turn

        //Check player1 win condition

        //Player 2 turn

        //Check player2 win condition

        //repeat gameLoop if no win conditions have been reached
    }

    public HashMap<String, Integer> getCoordinates(){

        HashMap<String, Integer> coordinates = new HashMap<String, Integer>();

        Scanner userInt = new Scanner(System.in);
        System.out.println("Select x location:");
        //Integer x = userInt.nextInt();
        coordinates.put("x", userInt.nextInt());

        System.out.println("Select y location:");
        coordinates.put("y", userInt.nextInt());

        return coordinates;
    }

    public void displayHitboard(){

    }


    public void updateGameboards(Player currentPlayer, Player opposingPlayer, int x, int y){

    }

    public void setTileState(TileState tileState){

    }




}
