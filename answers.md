1. What items would be necessary if you were playing a game of Elevens at your desk (not on the computer)? List the private instance variables needed for the ElevensBoard class.
	Some of the private instance variables that might be needed are: a deck, cards, a random setting number to randomize the order in which the cards come, a reset button, and a replace button
	
2. Write an algorithm that describes the actions necessary to play the Elevens game.
	1. Create new game
	3. Draw 9 cards
	4. Look for a set of Jack, Queen, and King. If it exists, replace the three cards.
	5. Look for a set of two cards that adds to 11. If it exists, replace the two cards.
	6. If nothing was replaced in the last turn, then the game is lost. :(
	7. Repeat steps 2-6 until there are no cards left remaining in the deck or on the board.
	8. YOU WIN!
	
3. Now examine the partially implemented ElevensBoard.java file found in the Activity7 Starter Code directory. Does the ElevensBoard class contain all the state and behavior necessary to play the game?
Yes, it does

4. ElevensBoard.java contains three helper methods. These helper methods are private because they are only called from the ElevensBoard class.

a. Where is the dealMyCards method called in ElevensBoard?
dealMyCards is called in the newGame() method and in the constructor when a new ElevensBoard is created.

b. Which public methods should call the containsPairSum11 and containsJQK methods?
anotherPlayIsPossible() and isLegal() should both be called

c. It’s important to understand how the cardIndexes method works, and how the list that it returns is used. Suppose that cards contains the elements shown below. Trace the execution of the cardIndexes method to determine what list will be returned. Complete the diagram below by filling in the elements of the returned list, and by showing how those values index cards. Note that the returned list may have less than 9 elements.
cards ->
returned ->
list
012345678
012345678
  
J♥
 
 
6♣
 
null
 
2♠
 
null
null
 
 
A♠
4♥
 
 
null

 0, 1, 3, 6, 7
 
d. Complete the following printCards method to print all of the elements of cards that are indexed by cIndexes.
public static printCards(ElevensBoard board) { List<Integer> cIndexes = board.cardIndexes();
      for (Integer i : cIndexes) {
  System.out.println(board.cards[i].toString());
}
}
e. Which one of the methods that you identified in question 4b above needs to call the cardIndexes method before calling the containsPairSum11 and containsJQK methods? Why?
anotherPlayIsPossible()