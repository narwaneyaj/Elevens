1. The size of the board is one of the differences between Elevens and Thirteens. Why is size not an abstract method?
	The size is the board is not determined by a method because it is an attribute.

2. Why are there no abstract methods dealing with the selection of the cards to be removed or replaced in the array cards?
	Depending on the game, the cards that can be removed or replaced varies. 

3. Another way to create “IS-A” relationships is by implementing interfaces. Suppose that instead of creating an abstract Board class, we created the following Board interface, and had ElevensBoard implement it. Would this new scheme allow the Elevens GUI to call isLegal and anotherPlayIsPossible polymorphically? Would this alternate design work as well as the abstract Board class design? Why or why not?
        public interface Board
	{
	boolean isLegal(List<Integer> selectedCards);
           boolean anotherPlayIsPossible();
        }