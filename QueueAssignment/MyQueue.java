/*
 * This is the starter code for the Queue Java assignment
 * in CPSC 2232 for Fairfield University.
 * 
 * This is what you need to implement.
 * 
 * (c) Peter J. Kootsookos
 * 
 */
package QueueAssignment;

public class MyQueue implements CPSC2232Queue<Node>
{
	public void enqueue(String name)
	{
		Node newNode = new Node();
		newNode.name = name;
		enqueue(newNode);
	}

	@Override
	public void enqueue(Node e)
	{
		// TODO: Implement!
	}

	@Override
	public Node dequeue()
	{
		// TODO: Implement!
		return null;
	}

	@Override
	public boolean isEmpty()
	{
		// TODO: Implement!
		return true;
	}

	@Override
	public int size()
	{
		// TODO: Implement!
		return 0;
	}

	@Override
	public Node peek()
	{
		// TODO: Implement!
		return null;
	}

	@Override
	public void print()
	{
		// TODO: Iterate through the contents of the queue, and print the name part of each node.
		System.out.println("Empty");
	}
}
