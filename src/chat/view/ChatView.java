package chat.view;

import javax.swing.JOptionPane;
import chat.model.Chatbot;
/**
 * GUI View for the ChatBot project.
 * @author Devvin Kraatz
 * @version 1.3 10/13/13
 */
public class ChatView
{
//	Declaration section
	/**
	 * ChatBot used for internal chat methods.
	 */
	private Chatbot myChatBot;
	
//	Constructor section
	public ChatView()
	{
		myChatBot = new Chatbot();
	}
	
	
	
	/**
	 * The displaying of the ChatBot controller.
	 */
	public void showChatController()
	{
		String input = "keep going";
		
		while(input == null || !input.equals("no"))
		{
			JOptionPane.showMessageDialog(null, myChatBot.getRandomTopic());
			input = getInput();
			useInput(input);	
		}
		
		myChatBot.conversationPiece();
	}
	
	/**
	 * Captures the users input based on a question.
	 * @return The String object typed by the user.
	 */
	private String getInput()
	{
		String input = "";
		
		input = JOptionPane.showInputDialog("Would you like to talk with me?");
		
		return input;
	}
	
	/**
	 * Runs through the inputed message by the user to determine what answer to give back.
	 * @param The String object typed by the user into userInput.
	 */
	private void useInput(String userInput)
	{
		if(myChatBot.memeChecker(userInput))
		{
			JOptionPane.showMessageDialog(null, "you knew that " + userInput + " is a meme!!!");
		}
		
		else if(myChatBot.colorChecker(userInput))
		{
			JOptionPane.showMessageDialog(null, "I can tell that " + userInput + " is a color!");
		}
		JOptionPane.showMessageDialog(null, "Wow that is so interestion that you want to talk with me about " + userInput);
		
		
	}
}
