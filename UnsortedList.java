
public class UnsortedList extends LinkedList{
	
	
	//Constructor that is used to inherit the super class.
	UnsortedList(){
		super();
	}
	
	
	
	//Method that will add elements to the end of the list, with no particular order in mind.
	public void append (String s) {
		ListNode n = new ListNode(s);
		last.next = n;
		last = n;
		length++;
	}
	
	
	//Method that turns the list object into a string that will be read into the GUI method, which will only take a string.
	public String toString() {
		// create p to check through list.
		ListNode p = first.next;
		String listString = "";
		while (p != null) {
			listString += p.data + " \n";
			p = p.next; 
		}
		return listString;
	}
	
}
