import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
public class FileMenuHandler implements ActionListener {
   JFrame jframe;
   public FileMenuHandler (JFrame jf) {
      jframe = jf;
   }
   
   //Creates Array Lists of type string to store the data that lies in the Word Line objects.
   ArrayList<String> wordLineList = new ArrayList<String>();
   ArrayList<String> wordLineListA = new ArrayList<String>();
   ArrayList<String> wordLineListE = new ArrayList<String>();
   ArrayList<String> wordLineListI = new ArrayList<String>();
   ArrayList<String> wordLineListO = new ArrayList<String>();
   ArrayList<String> wordLineListU = new ArrayList<String>();



   
   
   
   
   public void actionPerformed(ActionEvent event) {
	   
	   //Creates actions for selected menu items. Calls the appropriate method for said task.
      String  menuName;
      menuName = event.getActionCommand();
      if (menuName.equals("Open"))
         openFile( );
      else if (menuName.equals("Quit"))
         System.exit(0);
      else if (menuName.equals("A")) {
          printVowelAWords();

      }
      else if (menuName.equals("E"))
      printVowelEWords();
      else if (menuName.equals("I"))
     printVowelIWords();
      else if (menuName.equals("O"))
     printVowelOWords();
      else if (menuName.equals("U"))
     printVowelUWords();
   } //actionPerformed

   
   
   
   
   
   //Method to both open the file and also calls read source to read in the file.
    private void openFile( ) {
       JFileChooser chooser;
       int          status;
       chooser = new JFileChooser( );
       status = chooser.showOpenDialog(null);
       if (status == JFileChooser.APPROVE_OPTION)
          readSource(chooser.getSelectedFile());
       else
          JOptionPane.showMessageDialog(null, "Open File dialog canceled");
    } //openFile
 
   
   
   
   
   //Method to read the file, tokenize each word and then create a Word Line object based off of each word and its respective line within the file. The data within the WordLine objects are then stored into the appropriate ArrayList. 
    private void readSource(File chosenFile) {
       String chosenFileName = chosenFile.getName();
       TextFileInput inFile = new TextFileInput(chosenFileName);
       String ssn;
       int subscript = 1;
       int wordLineIterator = 0;
       int tokenizerElements = 0;
       Container myContentPane = jframe.getContentPane();
       TextArea myTextArea = new TextArea();
       myContentPane.add(myTextArea);
     
     
   
       ssn = inFile.readLine();
       WordLine[] myWordLines = new WordLine[10000];
       while (ssn != null) {
     
      StringTokenizer tokenizer = new StringTokenizer(ssn, " ");
      
      while(tokenizer.hasMoreTokens()) {
      myTextArea.append(tokenizer.nextToken()+ "\n");
    
      }
      
      
      
      StringTokenizer tokenizer2 = new StringTokenizer(ssn, " ");
      tokenizerElements += tokenizer2.countTokens();
      
      while(tokenizer2.hasMoreTokens()) {
      myWordLines[wordLineIterator++] = new WordLine(tokenizer2.nextToken(), subscript);
      }
     
      
      subscript++;
         
         
 
         
          ssn = inFile.readLine();
       } //while
   //    jframe.setVisible(true);
     jframe.setVisible(true);
     
     
    for(int i =0; i<tokenizerElements;i++){
    wordLineList.add(myWordLines[i].getWordLine());
    if((myWordLines[i].getWordLine().charAt(0)== 'A') || (myWordLines[i].getWordLine().charAt(0)== 'a')) wordLineListA.add(myWordLines[i].getWordAndLineNumber()+"\n");
    if((myWordLines[i].getWordLine().charAt(0)== 'E') || (myWordLines[i].getWordLine().charAt(0)== 'e')) wordLineListE.add(myWordLines[i].getWordAndLineNumber()+"\n");
    if((myWordLines[i].getWordLine().charAt(0)== 'I') || (myWordLines[i].getWordLine().charAt(0)== 'i')) wordLineListI.add(myWordLines[i].getWordAndLineNumber()+"\n");
    if((myWordLines[i].getWordLine().charAt(0)== 'O') || (myWordLines[i].getWordLine().charAt(0)== 'o')) wordLineListO.add(myWordLines[i].getWordAndLineNumber()+"\n");
    if((myWordLines[i].getWordLine().charAt(0)== 'U') || (myWordLines[i].getWordLine().charAt(0)== 'u')) wordLineListU.add(myWordLines[i].getWordAndLineNumber()+"\n");
     
     
     }
    }
   
   
   //Each of the methods below, create a new text area and then appends it with the corresponding array list of words with the vowels.
    private void printVowelAWords(){
    Container myContentPane = jframe.getContentPane();
        TextArea myVowelFinderArea = new TextArea();
        myVowelFinderArea.append(wordLineListA.toString().replace("[", "").replace("]", "").replace(",", ""));
        myContentPane.add(myVowelFinderArea);
        jframe.setVisible(true);

}
   
    private void printVowelEWords() {
    Container myContentPane = jframe.getContentPane();
        TextArea myVowelFinderArea = new TextArea();
        myVowelFinderArea.append(wordLineListE.toString().replace("[", "").replace("]", "").replace(",", ""));
        myContentPane.add(myVowelFinderArea);
        jframe.setVisible(true);
    }
   
    private void printVowelIWords() {       
    Container myContentPane = jframe.getContentPane();
        TextArea myVowelFinderArea = new TextArea();
        myVowelFinderArea.append(wordLineListI.toString().replace("[", "").replace("]", "").replace(",", ""));
        myContentPane.add(myVowelFinderArea);
        jframe.setVisible(true);

    }
   
    private void printVowelOWords() {       
    Container myContentPane = jframe.getContentPane();
        TextArea myVowelFinderArea = new TextArea();
        myVowelFinderArea.append(wordLineListO.toString().replace("[", "").replace("]", "").replace(",", ""));
        myContentPane.add(myVowelFinderArea);
        jframe.setVisible(true);
    }
   
    private void printVowelUWords() {       
    Container myContentPane = jframe.getContentPane();
        TextArea myVowelFinderArea = new TextArea();
        myVowelFinderArea.append(wordLineListU.toString().replace("[", "").replace("]", "").replace(",", ""));
        myContentPane.add(myVowelFinderArea);
        jframe.setVisible(true);
    }
 
   
   
   
   
}
