// FIFO First in first out 
// Linear Data Structure
// Queue
// Enqueue adding objects at the tails
// Dqueue removing objects from the head
// Head is the start of the queue and tail is the last object of the queue
// Poll removes the head from the queue
// Offers adds object at the tail of the queue
// Examine peeks and returns the object at the head of the queue
// Queue is an interface so we cannot instanciate a queue thats why we use LinkedList

// add(), remove(), element() throws exception
// offer(), poll(), peek() doesnot throw exception all thress are same 

// Queue extends Collection class

import java.util.Queue;
import java.util.LinkedList;

public class queue{
public static void main (String[] args){
    
    Queue<String> queue = new LinkedList<String>();

    System.out.println(queue.isEmpty()); // returns boolean
   
    queue.offer("Nirmit");
    queue.offer("Mansi");
    queue.offer("Chintu");

    System.out.println(queue.peek()); // returns the head and examins
    queue.poll(); // removes the element
    // queue.remove();
    // queue.remove();
    // queue.poll();
    // queue.add("nirmit");

    System.out.println(queue.size()); // returns size of the Queue

    System.out.println(queue.contains("Nirmit")); // returns boolean if the queue contains the value


    System.out.println(queue);
}
}