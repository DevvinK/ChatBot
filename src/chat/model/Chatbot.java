package chat.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Model for the Chatbot project. Contains methods for evaluating Strings.
 * @author Devvin Kraatz
 * @version 1.6 10/30/13
 */
public class Chatbot
{
	/**
	 * ChatBot used for internal chat methods.
	 */
	private ArrayList<String> myMemes;
	private ArrayList<String> myColors;
	/**
	 * Stores a list of random topics
	 */
	private ArrayList<String> myRandomList;
	private ArrayList<String> myState;
	private ArrayList<String> conversationList;
	// Constructor
	
	/**
	 * Executes list checkers
	 */
	public Chatbot()
	{
		myMemes = new ArrayList<String>();
		myColors = new ArrayList<String>();
		myRandomList = new ArrayList<String>();
		myState = new ArrayList<String>();
		conversationList = new ArrayList<String>();
		
		fillTheStateList();
		fillTheMemeList();
		fillTheColorList();
		fillTheRandomList();
		fillTheConversationList();
	}
	/**
	 * ChatBot list to check for state inputs.
	 */
	private void fillTheStateList()
	{
		myState.add("Alabama");
		myState.add("Alaska");
		myState.add("Arizona");
		myState.add("Arkansas");
		myState.add("California");
		myState.add("Colorado");
		myState.add("Connecticut");
		myState.add("Delaware");
		myState.add("Florida");
		myState.add("Georgia");
		myState.add("Hawaii");
		myState.add("Idaho");
		myState.add("Illinois");
		myState.add("Indiana");
		myState.add("Iowa");
		myState.add("Kansas");
		myState.add("Kentucky");
		myState.add("Louisiana");
		myState.add("Maine");
		myState.add("Maryland");
		myState.add("Massachusetts");
		myState.add("Michigan");
		myState.add("Minnesota");
		myState.add("Mississippi");
		myState.add("Missouri");
		myState.add("Montana");
		myState.add("Nebraska");
		myState.add("Nevada");
		myState.add("New Hampshire  ");
		myState.add("New Jersey");
		myState.add("New Mexico");
		myState.add("New York");
		myState.add("North Carolina");
		myState.add("North Dakota");
		myState.add("Ohio");
		myState.add("Oklahoma");
		myState.add("Oregon");
		myState.add("Pennsylvania");
		myState.add("Rhode Island");
		myState.add("South Carolina");
		myState.add("South Dakota");
		myState.add("Tennessee");
		myState.add("Texas");
		myState.add("Utah");
		myState.add("Vermont");
		myState.add("Virginia");
		myState.add("Washington");
		myState.add("West Virginia");
		myState.add("Wisconsin");
		myState.add("Wyoming");
	}
	
	/**
	 * ChatBot list to check for random inputs.
	 */
	private void fillTheRandomList()
	{
		myRandomList.add("penguins");
		myRandomList.add("I have to say something random?");
		myRandomList.add("you don't want that?");
		myRandomList.add("cat");
	}
	
	/**
	 * ChatBot list to check for color inputs.
	 */
	private void fillTheColorList()
	{
		myColors.add("red");
		myColors.add("blue");
		myColors.add("green");
		myColors.add("purple");
		myColors.add("yellow");
		myColors.add("orange");
		myColors.add("pink");
		myColors.add("white");
		myColors.add("black");
		myColors.add("brown");
		myColors.add("cyan");
		myColors.add("gray");
		
	}

	/**
	 * ChatBot list to check for meme inputs.
	 */
	private void fillTheMemeList()
	{
		myMemes.add("my jammies are rustled");
		myMemes.add("cats");
		myMemes.add("What does the fox say");
		myMemes.add("philosoraptor");
		myMemes.add("iamdisappoint");
	}

	private void fillTheConversationList()
	{
		conversationList.add("I was wondering, do you like Klondike Bars?");
		conversationList.add("I like Klondike Bars a lot. You're probably wondering what I would do for one then?");
		conversationList.add("I don't know about you but I would do some hardcore parkore to get to the store, maybe some break dancing moves, and even steal a bike too.");
		conversationList.add("That is, until I get to the store and see the price for it, then you can forget about it. :D");
	}
	
	/**
	 * Method to retrieve a random value from the myRandomList.
	 * @return The String value randomly selected from the list.
	 */
	public String getRandomTopic()
	{
		String randomTopic = "";
		
		double myRandomNumber = Math.random();
		int myMemePosition = (int) (myRandomNumber * myMemes.size());
		randomTopic = myMemes.get(myMemePosition);
		
		return randomTopic;
		
	}
	
	
	/**
	 * Checks the user input to see if a color was used.
	 * @param ChatBot checker of the currentPhrase by the user for colors.
	 * @return The String object typed by the user.
	 */
	public boolean colorChecker(String currentPhrase)
	{
		boolean isColor = false;
		
		if(currentPhrase != null)
		{
			for (String currentColor : myColors)
			{
				if (currentPhrase.equalsIgnoreCase(currentColor))
				{
					isColor = true;
				}
			}
		}
		return isColor;
	}
	
	/**
	 * Checks the user input to see if a meme was used.
	 * @param ChatBot checker of the currentPhrase by the user for memes.
	 * @return The String object typed by the user.
	 */
	public boolean memeChecker(String currentPhrase)
	{
		boolean isMeme = false;

		if (currentPhrase != null)
		{
			for (String currentMeme : myMemes)
			{
				if (currentPhrase.equalsIgnoreCase(currentMeme))
				{
					isMeme = true;
				}
			}

		}
		return isMeme;
	}
	
	/**
	 * Method that checks if the user has typed anything about a state.
	 * @param currentPhrase What was currently typed by the user
	 * @return Returns true if someone was talking about a state, and returns false if not.
	 */
	public boolean stateChecker(String currentPhrase)
	{
		boolean isState = false;
		
		if(currentPhrase != null)
		{
			for (String currentState : myState)
			{
				if (currentPhrase.equalsIgnoreCase(currentState))
				{
					isState = true;
				}
			}
		}
		return isState;
	}
	
	/**
	 * Method that checks if the user has typed anything about saying boo.
	 * @param current What was currently typed by the user
	 * @return Returns true if someone was saying boo but false if something else.
	 */
	public String usesContent(String current)
	{
		String processedString = "";
		if(current.contains("boo"))
		{
			processedString = "Woo scary";
		}
		else
		{
			processedString = "boooooooooooooring";
		}
		return processedString;
	}
	
	/**
	 * Sorts different variables in alphabetical order
	 * @param first Enter a value for first
	 * @param middle Enter a value for middle
	 * @param last Enter a value for last
	 * @return Returns the values in order
	 */
	public String putNameInAlphabeticOrder(String first, String middle, String last)
	{
		String sortedName= "";
		
		if(first.compareTo(middle) < 0)
		{
			if(first.compareTo(last) < 0)
			{
				if(middle.compareTo(last) < 0)
				{
					sortedName = first + ", " + middle + ", "+ last;
				}
				
				else
				{
					sortedName= first + ", " + last + ", " + middle;
				}
			}
			
			else
			{
				sortedName = last + ", " + first + ", " + middle;
			}
		}
		
		else
		{
			if(middle.compareTo(last) < 0)
			{
				if (last.compareTo(first) < 0)
				{
					sortedName = middle + ", " + last + ", " + first;
					
				}
				else
				{
					sortedName = middle +", " + first + ", " + last;
				}
			}
			else
			{
				sortedName = last + ", " + middle + ", " + first;
			}
		}
		
		return sortedName;
	}
	
	
	public ArrayList<String> conversationPiece()
	{
//		conversationList.add("");
		return conversationList;
				
	}
}
