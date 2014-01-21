package chat.controller;

import java.util.ArrayList;

import chat.model.Chatbot;
import chat.view.ChatFrame;
import chat.view.ChatView;


/**
 * 
 * @author Devvin Kraatz
 * @version 1.5 10/31/13 Adding Model to the project and changed GUI load. Added a getter for the Chatbot.
 * Removed the referenced to the popup view. Added documentation. Added conversation helper and Validator.
  */
public class ChatController
{
	
//	Declaration section
	
	/**
	 * The application frame for the Chatbot Program.
	 */
	private ChatFrame chatFrame;
	/**
	 * The Main Chatbot for the application.
	 */
	private Chatbot appBot;
	
	
	/**
	 * @return the chatFrame
	 */
	public ChatFrame getChatFrame()
	{
		return chatFrame;
	}
	/**
	 * Getter method for the Chatbot instance.
	 * @return The Chatbot for the application.
	 */
	public Chatbot getAppBot()
	{
		return appBot;
	}


	/**
	 * @param chatFrame the chatFrame to set
	 */
	public void setChatFrame(ChatFrame chatFrame)
	{
		this.chatFrame = chatFrame;
	}

	/**
	 * @param appBot the appBot to set
	 */
	public void setAppBot(Chatbot appBot)
	{
		this.appBot = appBot;
	}

	/**
	 * Creates a ChatbotController and initialized the Chatbot model instance.
	 */

//	Constructor section
	
	public ChatController()
	{
//		chatController = new ChatView();
		appBot = new Chatbot();
	}
	
	
//	Run section.
	
	/**
	 * Initialized the ChatbotFrame for the GUI.
	 */
	public void start()
	{
		chatFrame = new ChatFrame(this);
	}
	
	/**
	 * 
	 * @param currentInput
	 * @return
	 */
	public String memeValidation(String currentInput)
	{
		String memeReaction = "Why aren't you talking about the mems?";
		if(appBot.memeChecker(currentInput))
		{
			memeReaction = currentInput + " is the coolest meme huh";
		}
		
		return memeReaction;
	}
	
	/**
	 * 
	 * @param currentInput
	 * @return
	 */
	public String stateValidation(String currentInput)
	{
		String stateReaction = "Why aren't you talking about the States?";
		if(appBot.memeChecker(currentInput))
		{
			stateReaction = currentInput + " is the coolest state huh";
		}
		
		return stateReaction;
	}
	
	/**
	 * 
	 * @param currentInput
	 * @return
	 */
	public String colorValidation(String currentInput)
	{
		String colorReaction = "Why aren't you talking about colors?";
		if(appBot.memeChecker(currentInput))
		{
			colorReaction = currentInput + " is the coolest color huh";
		}
		
		return colorReaction;
	}
	
	/**
	 * 		
	 * @param currentList
	 * @return
	 */
	private String conversationHelper(ArrayList<String> currentList)
	{
		String currentPhrase = "";
		
		if(currentList.size() > 0)
		{
			currentPhrase = currentList.remove(0);
		}
		
		return currentPhrase;
	}
	
	/**
	 * 
	 * @return
	 */
	public String dominateTheConversation()
	{
		String currentConversationPiece = "";
		
		currentConversationPiece = conversationHelper(appBot.conversationPiece());
		
		return currentConversationPiece;
	}
	
	/**
	 * Tests whether currentInput matches any of the checkers
	 * @param currentInput The current input by the user
	 * @return Returns a response to a noted list element
	 */
	public String processUserInput(String currentInput)
	{
		String response = "";
		
		if (appBot.memeChecker(currentInput))
		{
			response = "Memes!";
		}
		
		else if(true)
		{
			
		}
		
		return response;
	}
}
