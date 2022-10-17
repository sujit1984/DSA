**Linked Lists**

    A linked list is a data structure , which like array is also sequential list of objects. In a linked list ,each item in the list is aware of another item in the list, because each item in the list contains a link to the next item in the list. With arrays , each item in the list is completely unaware of the other items in the array.
    Since items in a linked list know what item comes after that, we would need to store some extra information with each item in the list.
    In case of arrays we just store the item value in each position. But when it comes to linked lists , for each item we have to store the value and the reference to the next item on the list. 

    Each item in a linked list is called a **node**.
    The first item in the linked list is the **head** of the list. 
    The last item in the linked list always points to **null** since nothing comes after it. 
    
    **Implementation**
    To implement the linked list we will first create a node class which will contain a field for whatever data we are holding in that node. And then we will have a **next** field, which will be of the type **node** since it points to the node which comes after it. 
    Thus if we have the reference to the **head** field we can traverse the entire list. We can start at head and then move on to **head.next** and then next and so on until we hit **null**, thus traversing the entire list.
