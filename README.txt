# ctrl-s-ctrl-z_memento-design-pattern
Practice your Implementation of the Memento Design Pattern!

In this exercise you will practice the memento design pattern

+-------------+-----------------------------------------------------------+---------------------------------------------------------------------------------+
|             |                                                           |                                                                                 |
| Classes     | description                                               | class description                                                               |
+-------------+-----------------------------------------------------------+---------------------------------------------------------------------------------+
|             |                                                           |                                                                                 |
| Originator  | - an object where changes takes place.                    | - class methods (constructor, getters/setters/class logic and etc)              |
|             | for example -> text editor                                |  - public Memento createMemento() // stores the last state of this object       |
|             |                                                           |  - public void restore(Memento m) // restores the last saved state              |
+-------------+-----------------------------------------------------------+---------------------------------------------------------------------------------+
|             |                                                           |                                                                                 |
| Memento     | - an object that stores the originator state              | - originator class methods                                                      |
|             |                                                           |  - getters for originator dms                                                   |
+-------------+-----------------------------------------------------------+---------------------------------------------------------------------------------+
|             |                                                           |                                                                                 |
| Caretaker   | - an object that stores a list of memento ->              | - dms: List<Memento> / Queue<Memento> / Stack<Memento> // depends on need       |
|             | aka saves history list - states of originator objects ->  |  - constructor that instantiate the data structure (for example new ArrayList)  |
|             | threrefore allows to go back in time and restore a state  |  - public void push(Memento state) // adds memento to the data structure        |
|             |                                                           |  - public Memento pop() // returns a memento and removes it from data structure |
|             |                                                           |                                                                                 |
+-------------+-----------------------------------------------------------+---------------------------------------------------------------------------------+
|                                                                                                                                                           |
| Logic                                                                                                                                                     |
+-----------------------------------------------------------------------------------------------------------------------------------------------------------+
|                                                                                                                                                           |
| Changes made in the originator that user wants to save - class provides the 'createMemento' method that functions as a SAVE                               |
+-----------------------------------------------------------------------------------------------------------------------------------------------------------+
|                                                                                                                                                           |
| createMemento creates a Memento object that is the current state of the Originator and is stored inside Caretaker list.                                   |
+-----------------------------------------------------------------------------------------------------------------------------------------------------------+
|                                                                                                                                                           |
| restore - pops back the last Memento object saved (UNDO)                                                                                                  |
+-----------------------------------------------------------------------------------------------------------------------------------------------------------+

Step 1:
------
Memento class:

		private final String content;

implement the following methods:

		Memento(String content); 
		=> constructor that takes content and sets it

		String getContent(); 
		=> getter method for content

		String toString();
		=> create a toString method

Step 2:
-------
TextEditor class: (Originator)
		
		private String content;

implement the following methods:

		void setContent(String content); 
		=> setter for content

		String toString();
		=> create a toString method

		Memento createMemento(); 
		=> create a new memento (snapshot of this current state of the originator)

		void restore(Memento memento); 
		=> recieve a memento from the Caretaker and re-set the state of your content.


Step 3:
-------
HistoryLog class: (CareTaker)

		private List<Memento> states;

implement the folloing methods:

		HistoryLog(); 
		=> constructor (instantiate the List with your favorite List util implementation. 
		I suggest for this task, simply use ArrayList, 
		but take notice that in more complicated applications
		you might need another implementation, and perhaps even another type of Collection)

		void push(Memento state);
		=> recieve a state and store it in the collection.

		Memento pop(); 
		=> fetch the element beforre the last one of the collection, remove it from the list and return it.

		void printLogs():
		=> print all the logs saved in your list


Step 4:
-------
Test class:

		Create a Test class with main method to test your memento pattern!
		In the test please follow these instructions:

		- Create an instance of the TextEditor and set your String content.
		- Create an instance of HistoryLog
		- Use HistoryLog’s push method that takes a memento created by the TextEditor’s createMemento method: => HistoryLog.push(TextEditor.createMemento());
		- Create multiple pushes to the HistoryLog. This will reset the content in your TextEditor each time, but will fill the history of edits.
		- Use TextEditor’s restore that takes HistoryLog’s pop - to restore to last saved state. => TextEditor.restore(HistoryLog.pop())
    
    
👻 GOOD LUCK 👻
