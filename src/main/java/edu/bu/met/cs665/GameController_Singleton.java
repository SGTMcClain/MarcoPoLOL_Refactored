package edu.bu.met.cs665;

import java.util.*;
import java.util.HashMap;

public class GameController_Singleton {
    // Should be a singleton since it wouldn't make sense to have two GameControllers
    private static GameController_Singleton uniqueInstance;

    private Player player1;
    private Player player2;

    private Gameboard player1_Gameboard;
    private Gameboard player2_Gameboard;


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
        player1_Gameboard = player1.getGameboard();
        player1_Gameboard.displayGameboard();
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
        player2_Gameboard = player2.getGameboard();
        player2_Gameboard.displayGameboard();
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

    /**
     * http://gameprogrammingpatterns.com/game-loop.html
     * Basic Game Loop Pattern
     * Game will loop until a winner is decided
     *
     */
    public void gameLoop(){  //implement this for the project
        boolean winConditionMet = false;
        HashMap<String, Integer> coordinates;
        while(!winConditionMet){
            //display player2's hitboard to player1
            player2_Gameboard.displayHitboard();
            //process player1 fire coordinates
            System.out.println("\n Player 1 enter your coordinates:");
            coordinates = getCoordinates();

            //update the gameboard and winCondition
            winConditionMet = player2_Gameboard.updateGameboard(coordinates.get("x"), coordinates.get("y"));


            //render player2's hitboard
            player2_Gameboard.displayHitboard();

            // End Player 1's Turn
            System.out.println("\n|-------------------------|");
            System.out.println(  "|  END PLAYER 1 TURN      |");
            System.out.println(  "|-------------------------|");


            if(!winConditionMet){
                //display player2's hitboard to player1
                player1_Gameboard.displayHitboard();
                //process player1 fire coordinates
                System.out.println("\n Player 2 enter your coordinates:");
                coordinates = getCoordinates();

                //update the gameboard and winCondition
                winConditionMet = player1_Gameboard.updateGameboard(coordinates.get("x"), coordinates.get("y"));


                //render player1's hitboard
                player1_Gameboard.displayHitboard();

                // End Player 2's Turn
                System.out.println("\n|-------------------------|");
                System.out.println(  "|  END PLAYER 2 TURN      |");
                System.out.println(  "|-------------------------|");

                if (!winConditionMet) {
                    gameLoop();

                } else {
                    //player 2 wins
                    System.out.println("\n|-------------------------|");
                    System.out.println(  "|  PLAYER 2 WINS          |");
                    System.out.println(  "|-------------------------|");

                    //Start a new game
                    System.exit(0);
                }

            } else {
                //player 1 wins
                System.out.println("\n|-------------------------|");
                System.out.println(  "|  PLAYER 1 WINS          |");
                System.out.println(  "|-------------------------|");
            }
        }

        //Start a new game
        System.exit(0);

    }

    public HashMap<String, Integer> getCoordinates(){

        HashMap<String, Integer> coordinates = new HashMap<String, Integer>();

        Scanner userInt = new Scanner(System.in);
        System.out.println("Select x coordinate:");
        //Integer x = userInt.nextInt();
        coordinates.put("x", userInt.nextInt());

        System.out.println("Select y coordinate:");
        coordinates.put("y", userInt.nextInt());

        return coordinates;
    }






}
