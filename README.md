# Marco Po LOL
#### *A game similar to Battleship*

## Basic Gameplay *Alpha Version*
1. Each player chooses a position for their ship within the 5 x 5 gameboard
2. Players take turns firing shots by entering grid coordinates
3. The first player to hit the opponents ship wins

## Assumptions (for project)
1. A players ship only takes up one space.
2. The gameboard is 5 x 5
3. Each player will be able to place a ship onto the gameboard 
4. Players take turns guessing the position of enemy ships to until the opposing players ship is hit
5


## Patterns used (for project)
1. **Game Loop Pattern** in the GameController_Singleton
    1. In this very basic implementation of a game loop the looping pattern is used to transition between each player
    and checking the win condition to see if that player succeeded in destroying the other players ship
    2. In graphical games a similar loop would also run after every frame that is displayed.
    3. While this is a very simple implementation it demonstrates the power that a loop like this can have.  For instance
    if instead of battleship the board game this was a graphical game where 2 battleships were firing at each other.
    Each frame the game loop would check if a projectile entered the collider of the opponents ship and if so it would
    display a hit animation and do a damage calcualtion.  After doing the damage calculation it would then check to see
    if that ship had any hit points remaining, change the display of the available hit points and start a sinking
    animation if there were no hitpoints remaining.
    4. Even that demonstration is still only a fraction of what the gameloop is checking every frame.  There are still
    audio systems that need to be maintained, user input that needs to be recognized and executed, and much more.



## Project Template

This is a Java Maven Project Template


## How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

## How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


## How to run


```bash
java -classpath target/Example-1-1.0-SNAPSHOT-jar-with-dependencies.jar edu.bu.met.cs665.Main
```

or


```bash
run.sh 
```

## Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```

## Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```
