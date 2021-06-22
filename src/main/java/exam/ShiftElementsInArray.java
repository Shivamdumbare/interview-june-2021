package exam;

public class ShiftElementsInArray {
  Node head;
  class Node
  {
    int data;
    Node next;
    Node (int d ) {data = d; next = null;}
  }

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    if(head == null || head.next == null)
      return;
    Node secLast = null;
    Node last = head;
    
    while (last.next !=null)
    {
      secLast = Last;
      last = last.next;
    }
    srclast.next = head;
    
    head = last;
    public void push(int new_data)
    {
      Node new_node = new Node(new_data);
      new_node.next = head;
      head = new_node;
     
    }
    void printList()
    {
      Node temp = head;
      while (temp !=null)
      {
        System.out.print(temp.data+" ");
        temp = temp.next;
      }
      System.out,println();
    }
    piblic static void main(String args[])
    {
      LinkedList llist = new LinkedList();
      llist.pust(5);
      llist.pust(4);
      llist.pust(3);
      llist.pust(2);
      llist.pust(1);
      System.out.println("Linked List before moving last to front");
      llist.printList();
      llist.moveToFront();
      System.out.println("Linked List after moving last to front");
                     llist.printLis();
    }
  }

  }

}
