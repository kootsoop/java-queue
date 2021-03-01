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

public interface CPSC2232Queue<E>
{
        void enqueue(E e);
        E dequeue();
        boolean isEmpty();
        int size();
        E peek();
        void print();                
}
