
// LIFO Last in first out data structure
// Like a Tower, Pile of Books
// Push Method to add in the bottom of the stack
// Pop Method to remove from top of the stack
// Peep Method to see item at the top of the stack
// Empty to check if stack is empty 
// Search 

import java.util.Stack;

public class stack {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();

        
        stack.push("GAME");
        stack.push("PS5");
        stack.push("Xbox");
        // String myfav =  stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.search("GAME"));
        System.out.println(stack);
        
    }
}
