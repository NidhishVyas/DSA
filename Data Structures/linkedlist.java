import java.util.LinkedList;

// linked list is made up of nodes each node has 2 parts data and address to the next node
// They are non consecutive they can be anywhere in the machine

// push methiod will act as stack 
// offer method will act as queue

//Dynamic data struture 
// addition and deletion is easy 
// no/low memory waste

// more meory usage for next node address
// doubly linkedlist use extra memory for address
// no random access of any element of index[i] like arrays

// implement stack or queue
// music playlist 
// GPS navigation

public class linkedlist {
    public static void main ( String[] args){
        
        LinkedList<String> linkedList = new LinkedList<String>();

        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("F");
        // linkedList.pop();


         linkedList.offer("A");
         linkedList.offer("B");
         linkedList.offer("C");
         linkedList.offer("D");
         linkedList.offer("F");
         linkedList.addFirst("0");
         linkedList.addLast("G");
        //  linkedList.poll();

        linkedList.add(4, "E");
        // linkedList.remove("E");

        // String first = linkedList.removeFirst();
        // String last = linkedList.removeLast();

        System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList);
    }
}
