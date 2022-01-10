### Queues
The Queue interface present in the java.util package and extends the Collection interface is used to hold the elements about to be processed in ***FIFO(First In First Out)*** order. It is an ordered list of objects with its use limited to insert elements at the end of the list and deleting elements from the start of the list, (i.e.), it follows the FIFO or the First-In-First-Out principle.

- Java Queue supports all methods of Collection interface.
- Most frequently used Queue implementations are LinkedList, ArrayBlockingQueue and PriorityQueue.
- All Queues supports insertion at the tail of the queue and removal at the head of the queue, except Deques.
- Deques are queues but they support element insertion and removal at both ends.

![image](https://user-images.githubusercontent.com/66742430/148716076-aad5003c-0f58-46ae-b92b-536d0710e284.png)


### Common methods for Queues
- int size(): to get the number of elements in the Set.
- boolean isEmpty(): to check if Set is empty or not.
- boolean contains(Object o): Returns true if this Set contains the specified element.
- Iterator iterator(): Returns an iterator over the elements in this set. The elements are returned in no particular order.
- boolean removeAll(Collection c): Removes from this set all of its elements that are contained in the specified collection (optional operation).
-boolean retainAll(Collection c): Retains only the elements in this set that are contained in the specified collection (optional operation).
- void clear(): Removes all the elements from the set.
- E remove(): Retrieves and removes the head of this queue.
- E poll(): Retrieves and removes the head of this queue, or returns null if this queue is empty.
- E peek(): Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
- boolean offer(E e): Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
- E element(): Retrieves, but does not remove, the head of this queue.
- boolean add(E e): Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and - throwing an IllegalStateException if no space is currently available.
- Object[] toArray(): Returns an array containing all of the elements in this set. If this set makes any guarantees as to what order its elements are returned by its iterator, this method must return the elements in the same order.

