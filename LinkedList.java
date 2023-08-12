
public class LinkedList {
	
	//Creates variables that will exist as parts of the linked list. Starting with first and ending with last. Length is the length of said list.
   protected ListNode first;
   protected ListNode last;
   protected int length;
   
   
   
   //Constructor  that creates a list by creating its first element and last element as the same node. The length is 0, similar to the way the first element of an array is 0. 
   public LinkedList () {
         ListNode ln = new ListNode();
         first = ln;
         last = ln;
         length = 0;
      }
   


}
