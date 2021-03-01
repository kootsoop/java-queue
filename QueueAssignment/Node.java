/*
 * This is the starter code for the Queue Java assignment
 * in CPSC 2232 for Fairfield University.
 * 
 * DO NOT ALTER THIS CODE!!
 * 
 * (c) Peter J. Kootsookos
 * 
 */
package QueueAssignment;

public class Node
{
  public String name;

  public static void print(Node node)
  {
    if (node != null)
    {
      System.out.println(node.name);
    }
    else
    {
      System.out.println("null");
    }
  }
}
