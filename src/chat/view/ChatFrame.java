package chat.view;

import javax.swing.JFrame;

import chat.controller.ChatController;

/**
 * 
 * @author Devvin Kraatz
 * @version 
 */
public class ChatFrame extends JFrame
{
	/**
	 * Creates a reference to the base controller.
	 */
	private ChatController baseController;
	/**
	 * Creates a new Chatbot panel
	 */
	private ChatPanel basePanel;
	
	public ChatFrame(ChatController baseController)
	{
		this.baseController = baseController;
		basePanel = new ChatPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * Sets all the properties of the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setVisible(true);
		
	}
}
