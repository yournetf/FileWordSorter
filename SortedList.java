public class SortedList extends LinkedList {

	//Constructor that is used to inherit the super class.
	SortedList(){
		super();
	}


	
	//Method that is used to sort the list in alphabetical order, using the compare to method.
	public void add(String s){
		ListNode a,b;
		a = first;
		b = a.next;
		ListNode in = new ListNode(s);

		while(b !=null && b.data.compareTo(s) <= 0){
			a = a.next;
			b = b.next;
		}
		in.next = b;
		a.next = in;
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