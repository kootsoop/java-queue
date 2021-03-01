/*
 * This is the starter code for the Linked List Java assignment
 * in CPSC 2232 for Fairfield University.
 * 
 * DO NOT ALTER THIS CODE!!
 * 
 * (c) Peter J. Kootsookos
 * 
 */
import StackAssignment.MyStack;
import StackAssignment.Node;

import java.util.*;

public class PopulateStackTest
{      
    public static void populateStack(MyStack listToPopulate)
    {
        Scanner scanner = new Scanner(System.in);
		String readString = "first entry";
		while (!readString.equals("end"))
		{
			if (!readString.equals("first entry"))
			{
				Node node = new Node();
				node.name = readString;
				listToPopulate.push(node);
			}
			readString = scanner.nextLine();
		}

		scanner.close();
    }

    public static void main(String[] args)
    {
        MyStack stack = new MyStack();
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());

		populateStack(stack);

		stack.print();
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());

		stack.push("A");
		stack.print();
		stack.push("B");
		stack.print();
		assert stack.peek().name.equals("B");
		
		stack.push("C");
		stack.print();
		stack.push("D");
		stack.print();
		assert stack.peek().name.equals("D");

		Node firstOff = stack.pop();

		for (int counter = 0; counter < 10; counter++)
		{
			Node.print(firstOff);
			firstOff = stack.pop();	
		}

		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
	}
}
