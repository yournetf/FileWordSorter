import javax.swing.*;
import java.awt.*;
public class GUI extends JFrame {
     
	//Constructor that initializes the GUI with values.
   public GUI(String title, int height, int width) {
   setTitle(title);
   setSize(height,width);
       setLocation  (400,200);
   createFileMenu();
   setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
       setLayout(new GridLayout(1,2));
       
       
   } //GUI

   //Method that creates the File menus and gives the menus items for each vowel and File and Quit options.
   private void createFileMenu( ) {
      JMenuItem   Open;
      JMenuItem   Quit;
      JMenuItem   A, E, I, O, U;
      JMenuBar    menuBar  = new JMenuBar();
      JMenu       fileMenu = new JMenu("File");
      JMenu  listMenu = new JMenu("List");
      FileMenuHandler fmh  = new FileMenuHandler(this);

      Open = new JMenuItem("Open");    //Open...
      Open.addActionListener( fmh );
      fileMenu.add( Open );

      fileMenu.addSeparator();           //add a horizontal separator line
   
      Quit = new JMenuItem("Quit");       //Quit
      Quit.addActionListener( fmh );
      fileMenu.add( Quit );
     
     
     
     //Creates the Jmenu items as well as appends them to the file menu handler to provide actions for each option.
      A = new JMenuItem("A");
      A.addActionListener(fmh);
      listMenu.add(A);
     
      E = new JMenuItem("E");
      E.addActionListener(fmh);
      listMenu.add(E);
     
      I = new JMenuItem("I");
      I.addActionListener(fmh);
      listMenu.add(I);
     
      O = new JMenuItem("O");
      O.addActionListener(fmh);
      listMenu.add(O);
     
      U = new JMenuItem("U");
      U.addActionListener(fmh);
      listMenu.add(U);
     
   
     
     
     

     
     
      setJMenuBar(menuBar);
      menuBar.add(fileMenu);
      menuBar.add(listMenu);
   
   } //createMenu

} //SSNGUI
