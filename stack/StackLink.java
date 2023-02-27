package stack;
import java.util.LinkedList;
//Note the linked list we imported are a doubly linked list
//For using a singly linked list, we need to implement our own linked list.

public class StackLink {
    private LinkedList<Integer> stack;

    public StackLink(){
        stack = new LinkedList<Integer>();
    }

    public void push(Integer num){
        stack.push(num);
    }
    public Integer pop(){
        return stack.pop();
    }
    public Integer peek(){
        return stack.peek();
    }
}
