# Battleship-Game
 
* Made by Ze Sheng


## All Source Files:
### Controller File
* BattleShipGame.java

### Battleship Abstract Class File
* Ship.java

### Battleship Files
* Battleship.java
* Cruiser.java
* Destroyer.java
* Submarine.java
* EmptySea.java

### Map File
* Ocean.java

### Unit Test Files
* ShipTest.java
* OceanTest.java

## Progress
* ✓ - Finished
* O - In progess
* ? - Have problem
* blank - Not started

Section | State
:----: |:----:
Abstract class: Ship |   ✓
Construct Battleship| ✓
Construct Cruisers| ✓
Construct Destroyer | ✓
Construct Submarine | ✓
Construct Emptysea | ✓
Construcy Ocean(map)| ✓
Game logic unit test | ✓
Game map unit test | ✓
Corner cases check | ✓


## Overview of work accomplished
* This is a Battleship game which only has single mode. In every try, you need to sink all enemy ships to win the game. There are four types of ship: A battleship (4 cells), two cruisers (3 cells), three destroyers (2 cells) and four submarines (1 cell). The map (10x10 cells) will be like this:
* 
    ````
       0  1  2  3  4  5  6  7  8  9
  0  ·  ·  ·  ·  ·  ·  ·  ·  ·  ·
  1  ·  ·  ·  ·  ·  ·  ·  ·  ·  ·
  2  ·  ·  ·  ·  ·  ·  ·  ·  ·  ·
  3  ·  ·  ·  ·  ·  ·  ·  ·  ·  ·
  4  ·  ·  ·  ·  ·  ·  ·  ·  ·  ·
  5  ·  ·  ·  ·  ·  ·  ·  ·  ·  ·
  6  ·  ·  ·  ·  ·  ·  ·  ·  ·  ·
  7  ·  ·  ·  ·  ·  ·  ·  ·  ·  ·
  8  ·  ·  ·  ·  ·  ·  ·  ·  ·  ·
  9  ·  ·  ·  ·  ·  ·  ·  ·  ·  ·
  Hit counts: 0
  Shots fired: 0
  Ship sunk: 0
  Which position do you want to shoot? i.e. '2,1' or '0,6' 
    ````
* Since all positions of ships are random for every try, we can cheat to test it.
* ````
  CHEAT MODE (DEBUG ONLY):
  
      0  1  2  3  4  5  6  7  8  9
  0            s                 s
  1                              
  2   d  d        c  c  c        b
  3                              b
  4                              b
  5   d  d        c              b
  6               c     s         
  7   d  d        c               
  8                               
  9         s                     
    ````
* In each round, players can choose a cell to attack, if this area has a ship, then the cell changes to 'x' from '.'. If no ship in this area, it changes to '-'.
* If a ship is sunk, it will becomes all 's'. The game process can be shown in the following map:
* ````
     0  1  2  3  4  5  6  7  8  9
  0  ·  ·  ·  s  -  -  -  -  ·  ·
  1  ·  ·  -  ·  ·  ·  ·  ·  ·  ·
  2  x  ·  ·  ·  ·  ·  ·  ·  ·  s
  3  ·  ·  ·  ·  ·  ·  ·  ·  ·  s
  4  ·  ·  ·  ·  ·  ·  ·  ·  ·  s
  5  x  ·  ·  ·  ·  ·  ·  ·  ·  s
  6  ·  ·  ·  ·  ·  ·  ·  ·  ·  ·
  7  s  x  ·  ·  ·  ·  ·  ·  ·  ·
  8  ·  ·  ·  ·  ·  ·  ·  ·  ·  ·
  9  ·  ·  ·  ·  ·  ·  ·  ·  ·  ·     
    ````


## Challenges
* The way to construct 'empty sea' is a trick. I turned empty sea as a type of ship so that it can be controlled much more easily. If I put it into the Ocean class, it is hard to change the state like other ships.
* There are many corner cases in the input. I fixed all of them and it works well.
* I used unit test for all functions to verify the game logic. 



