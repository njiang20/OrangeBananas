# OrangeBananas
**Team Orange Bananas:**
**Roster:** Nina Jiang, Zhengxi He, Russell Goychayev
## Song of the Week: Kapustin Etudes Op. 40

## Project Description
**What is this code for?**
* The following code in this repository simulates the playing of Texas Hold-em against an "AI" using a 52-card deck of playing cards.
* Woo is the driver file that starts each round of the game between the player and an AI. 
* The player has the option to set or increase their bet each round. 
* The AI can do the same, although it's bet will be randomized. 
* Additionally, the player can choose whether to "burn" out, ending the game. 
* The game lasts 3 rounds. 
* Once the 3 rounds are over, there will be a total of 3 center cards (which are increased by 1 each round), 3 face-up cards per player and AI (which are also incremented by 1), and 2 hole cards per player and AI (which stays the same from the beginning of the game). 
* Both the player and the AI's hand will be printed. 
* The last three cards of each hand will be identical since they are the center cards, which is shared between the player and the AI.

## Instructions
```
git clone git@github.com:njiang20/OrangeBananas.git
cd ~/OrangeBananas/
javac Woo.java
java Woo
```
Compile and run Woo. The introduction message will print: "Welcome to Texas Hold'em!" in addition to the player's current hand (2 hole cards and 1 face-up card) and one card, the center card, which is shared between the AI and the player.
