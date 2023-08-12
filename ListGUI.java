import java.awt.GridLayout;

import javax.swing.*;

public class ListGUI extends JFrame{
	
	//Constructor that calls and fills in the variable for the GUI that will display the original text, unsorted and sorted texts.
	public ListGUI(String original, String unsorted, String sorted) {
		
		createListGUI(original, unsorted, sorted);
		
	}
	
	
	
	
	
	
	//Method that creates the GUI.
	public static void createListGUI(String originalText, String unsortedText, String sortedText) {
		
		//Creates the frame, as well as sizes, layout, and locates it. Gives it a close option.
		JFrame frame = new JFrame("Project2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLocation(200, 200);
		frame.setLayout(new GridLayout(1,3));
		
		
		//Creates text areas and appends respective string values to it.
		JTextArea originalTextArea = new JTextArea(5,20);
		originalTextArea.setText("Original Text: ");
		originalTextArea.append("\n" + originalText);
		//JScrollPane scrollpane = new JScrollPane();
		originalTextArea.setVisible(true);
		
		
		JTextArea unsortedTextArea = new JTextArea();
		unsortedTextArea.setText("Unsorted Text: ");
		unsortedTextArea.append("\n" + unsortedText);
		unsortedTextArea.setVisible(true);
		
		
		JTextArea sortedTextArea = new JTextArea();
		sortedTextArea.setText("Sorted Text: ");
		sortedTextArea.append("\n" + sortedText);
		sortedTextArea.setVisible(true);
		
		//Adds the text areas to the content pane.
		frame.getContentPane().add(originalTextArea);
		frame.getContentPane().add(unsortedTextArea);
		frame.getContentPane().add(sortedTextArea);
		
		
		//Sets everything as visible once completed.
		frame.pack();
		frame.setVisible(true);
	}
	
}
