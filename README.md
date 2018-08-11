# Marco Po LOL
#### *A game similar to Battleship*

## Basic Gameplay *Alpha Version*
1. Each player chooses a position for their ship within the 5 x 5 gameboard
2. Players take turns firing shots by entering grid coordinates
3. The first player to hit the opponents ship wins

## Assumptions (for class)
1. A players ship only takes up one space.
2. The gameboard is 5 x 5
3. Each player will be able to place a ship onto the gameboard 
4. Only the starting sequence of the game will be implemented to demonstrate the required design patterns.  The rest of
the game will be implemented during a later project.
5. The only portion of the state pattern that is fully implemented is transitioning a water tile to a ship tile.  Missed
and hit states are implemented but not used since the full gameplay hasn't yet been implemented. 

## Patterns used (for class)
1. **Singleton Pattern** in the GameController_Singleton
    1. Only one GameController instance is allowed
2. **State Pattern** in TileState
    1. Tile States consist of:
        1. Water
            1. A water state can transition to either a ship or a miss state
            2. A water state cannot transition back to a water state
            3. A water state cannot directly transition to a hit state
        2. Ship
            1. A ship state can transition to a hit state
            2. Once in a ship State a tile cannot transition to any other state
        3. Miss
            1. Once in a miss state a tile cannot transition to any other state
        4. Hit
            1. Once in a hit state a tile cannot transition to any other stat
            2. The first player to transition all of their opponents ship tiles to a hit state wins


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
