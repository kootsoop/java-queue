import StackAssignment.MyStack;
import StackAssignment.Node;

public class SimpleStackTest
{
    public static void main(String[] args)
    {
        MyStack stack = new MyStack();
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        Node.print(stack.pop());
        stack.push("A");
        stack.print();

        Node.print(stack.peek());
    }
}