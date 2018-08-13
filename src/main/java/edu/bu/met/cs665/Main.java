package edu.bu.met.cs665;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

  /**
   * A main method to run examples. 
   * @param args not used 
   */

  public static void main(String[] args) {
    GameController_Singleton gameController = GameController_Singleton.getInstance();
    boolean winConditionMet = false;


    gameController.startGame();

    gameController.gameLoop();

  }

}
