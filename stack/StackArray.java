package stack;

public class StackArray {
    
    private int[] stack;
    private int top;

    public StackArray(int capacity){
        stack = new int[capacity];
    }

    public void push(int num){
        //handle if stack is full
        if(stack.length == top){
            int[] newArray = new int[stack.length * 2];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = num;
    }
    public int pop(){
        if(top == 0){
            //the stack is empty
            return -1;
        }
        return stack[--top];
    }
    public int peek(){
        if(top == 0){
            //the stack is empty
            return -1;
        }
        return stack[top -1];
    }
    public int length(){
        return top;
    }
}
