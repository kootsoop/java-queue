import StackAssignment.MyStack;
import StackAssignment.Node;

public class LotsOfItemsStackTest
{
    public static void main(String[] args)
    {
        MyStack stack = new MyStack();

        for (int i=0; i<10000; i++)
        {
            stack.push("Pushed " + i);
        }

        System.out.println(stack.size());
    }
}
