## Linked list

<hr>

### Linked list example:

<p>
<img src="https://github.com/GothamsJoker/DataStructures/blob/master/images/Java-LinkedList.png">
</p>

<hr>

### LinkedList representation

Each element in the LinkedList is called the Node. Each Node of the LinkedList contains two items: 1) Content of the element 2) Pointer/Address/Reference to the Next Node in the LinkedList.

1. Head of the LinkedList only contains the Address of the First element of the List.
2. The Last element of the LinkedList contains null in the pointer part of the node because it is the end of the List so it doesn’t point to anything as shown in the above diagram.
3. The diagram which is shown above represents a singly linked list. There is another complex type variation of LinkedList which is called doubly linked list, node of a doubly linked list contains three parts: 1) Pointer to the previous node of the linked list 2) content of the element 3) pointer to the next node of the linked list.

<hr/>

### Why do we need a Linked List?
You must be aware of the arrays which is also a linear data structure but arrays have certain limitations such as:
1) Size of the array is fixed which is decided when we create an array so it is hard to predict the number of elements in advance, if the declared size fall short then we cannot increase the size of an array and if we declare a large size array and do not need to store that many elements then it is a waste of memory.

2) Array elements need contiguous memory locations to store their values.

3) Inserting an element in an array is performance wise expensive as we have to shift several elements to make a space for the new element. For example:
Let’s say we have an array that has following elements: 10, 12, 15, 20, 4, 5, 100, now if we want to insert a new element 99 after the element that has value 12 then we have to shift all the elements after 12 to their right to make space for new element.

Similarly deleting an element from the array is also a performance wise expensive operation because all the elements after the deleted element have to be shifted left.

<hr/>

### These limitations are handled in the Linked List by providing following features:
1. Linked list allows dynamic memory allocation, which means memory allocation is done at the run time by the compiler and we do not need to mention the size of the list during linked list declaration.

2. Linked list elements don’t need contiguous memory locations because elements are linked with each other using the reference part of the node that contains the address of the next node of the list.

3. Insert and delete operations in the Linked list are not performance wise expensive because adding and deleting an element from the linked list does’t require element shifting, only the pointer of the previous and the next node requires change.
