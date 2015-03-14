cs56-games-connectFour
======================

Project history
===============
```
YES | mastergberry | gkowligi, vwtan | A "Connect Four" game where the player tries to make four cicles in a row (horizontally, vertically, or diagonally)
```
```
 W14 | bkiefer13 4pm | gkowligi, vwtan | An "Connect Four" game where the player tries to make four circle in a row (horizontally, vertically, or diagonally)
```


 - __Navigation__: 
   - [Introduction](https://github.com/SharSoft/cs56-games-connectfour/blob/master/README.md#introduction)
   - [Interface](https://github.com/SharSoft/cs56-games-connectfour/blob/master/README.md#interface)
      - [Single Player](https://github.com/SharSoft/cs56-games-connectfour/blob/master/README.md#single-player)
      	 - [Easy](https://github.com/SharSoft/cs56-games-connectfour/blob/master/README.md#easy)
      	 - [Advanced](https://github.com/SharSoft/cs56-games-connectfour/blob/master/README.md#advanced)
      	 - [Insane](https://github.com/SharSoft/cs56-games-connectfour/blob/master/README.md#insane)
      - [Multiplayer](https://github.com/SharSoft/cs56-games-connectfour/blob/master/README.md#multiplayer)
      - [Rules](https://github.com/SharSoft/cs56-games-connectfour/blob/master/README.md#rules)
      - [Exit](https://github.com/SharSoft/cs56-games-connectfour/blob/master/README.md#exit)
   - [Documentation](https://github.com/SharSoft/cs56-games-connectfour/blob/master/README.md#documentation)
   - [How to run](https://github.com/SharSoft/cs56-games-connectfour/blob/master/README.md#how-to-run)


## Introduction

An implementation of Connect Four. Includes a Board and Circle class that create and populate a game grid according to which player's turn it is. The game detects whether a row of 4 circles of the same color has been detected whether horizontally, vertically, or diagonally. When a row of 4 circle has indeed been detected, the game is over and the screen display which player has won.
 - This game consists of either a 2 player or 1 player mode. The game is as follows:
   - Start game with either multiplayer or single mode.
   - If multiplayer mode, each person takes a turn entering a circle in one of the columns.
   - If single player mode, the person and the computer each take turn entering a circle in one of the columns.
   - The first person to get his or her four game pieces connected in either a diagonal, horizontal, or vertical line wins the game.

 - If mode that player is in is single, there are two levels for this game: Easy and Advanced.
   - Easy: The computer just generates a random move.
   - Advanced: The computer checks if the player has 3 consecutive circle. If it does, it tries to block the spot, else it just generates a random move.
   - Insane: The computer checks if the player has one potential win. If it does it blocks it.    





## Interface

* The game starts with a start screen which is the main menu that looks like this:

![](http://i.imgur.com/8fGuhWC.jpg)

### Single Player
* This navigates you to the Single Player Menu that looks like this: 

![](http://i.imgur.com/TzZqOUI.jpg)

#### Easy
* You can choose either Easy mode or Advanced mode.
* When you play easy mode, you almost always win at the first time:

![](http://i.imgur.com/R3uDkJm.jpg)

* On the right hand side there are three buttons with options. These options are the same, regardless of what game mode you are playing.
* These buttons are as follows:
  * "Main Menu": Navigates you back to the start menu.
  * "Restart": Creates a new game a tany time.
  * "Exit" : Exits the game.  


#### Advanced
* When you play advanced, its harder to win:

![](http://i.imgur.com/U1AkX6a.jpg)

#### Insane
* When you play insane, you must be an expert to be able to win!!!:

![](http://i.imgur.com/OfmTX6h.jpg)

### Multiplayer

*This navigates you to the game screen, where two people get to play:

![](http://i.imgur.com/jCjYTs4.jpg)


### Rules
* When you click on the "Rules" button, a message dialog box will appear with the rules:


![] (http://i.imgur.com/6pRunIO.jpg)

* The "OK" button exits the dialog box.

### Exit
* When the "Exit" button is clicked, the game is exited.

## Documentation:

* `Circle` class constructs a circl with a specific color and at a specific location on the connect four board.

* `Board` class constructs the Connect Four board and also repaints the board any time a new move is made.

* `startScreen2` class constructs the frame for all the JPanels and also constructs the JPanel for the game screen. It also constructs the mouse listener for when the mouse is clicked during the game.

* `StartScreenMenuPanel` class constructs  the main menu JPanel: Four buttons; "Single Player", "Multiplayer", "Rules" and "Exit" buttons along with their listeners.

* `singlePlayerMenuPanel` class constructs the single player menu JPanel: Two buttons; "Easy" and "Advanced" buttons along with their listeners.

* `SinglePlayerEasy` class generates a random move for the computer.

* `SinglePlayerAdvanced` class generates an algorithm that checks whether the player has 3 consecutive circles in a row. If it does, the computer blocks it, else the computer generates a random move.

* `SinglePlayerInsane` class generates an algorithm that check if player has a potential win, if it does, it blocks it, else the computer generates a rondom move.

* `inGameMenuPanel` class constructs the JPanel for the buttons in the game menu: Three buttons: "Main Menu", "Restart" and "Exit" buttons along with their listeners.





## How to run 
To start the game, use `ant run`. 




