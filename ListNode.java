public class ListNode {
	
	//Creates variables that will determine the makeup of the List Node
   String data;
   ListNode next;
   
   //Constructor to create and assign a value to the List Node and then to the next node it points to.
   public ListNode(String data, ListNode next)  {
      this.data = data;
      this.next = next;
   } 
   
   
   //Constructor that will be called simply to create a List Node
   public ListNode()  {
      this.data = null;
      this.next = null;
   }  
   
   
   //Constructor that will create a List Node and fill it with a value, but points to nothing.
   public ListNode(String data)  {
      this.data = data;
      this.next = null;
   }  

}
