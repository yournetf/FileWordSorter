import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) {
         
	  //Creates an Unsorted and SortedList instance of their respective classes.
     
      UnsortedList unsortedList = new UnsortedList();
      SortedList sortedList = new SortedList();

      //Reads the filename into both the unsorted and sorted instances, and uses their specific methods in order to add the elements properly.
      
      String filename = args[0];
      inputFromFile(filename, unsortedList, sortedList );
 
      
      //Creates a ListGUI instance
      ListGUI GUI = new ListGUI(unsortedList.toString(),unsortedList.toString(), sortedList.toString());
  
     

     
     

   }
   
   
   //Method that reads each line of the file one by one, using a String Tokenizer to differentiate between each element(words). It then calls each instances correct method, "append" and "and", and assigns each word to its correct position.
public static int inputFromFile(String filename, UnsortedList unsortedList, SortedList sortedList){
	
	TextFileInput in = new TextFileInput(filename);
	int lengthFilled = 0;
	String line = in.readLine();


	while (line != null ) {
		StringTokenizer st = new StringTokenizer(line, " ");



			while(st.hasMoreTokens()) {
					String word = st.nextToken();
					unsortedList.append(word);
					sortedList.add(word);

					lengthFilled++;
			}


			line = in.readLine();
	}


	in.close();
	return lengthFilled;
}
   
}
