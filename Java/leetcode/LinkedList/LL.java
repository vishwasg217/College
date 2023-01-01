package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL()
    {
        this.size=0;
    }

    public void insertFirst(int value)
    {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if(tail==null)
            tail=head;
        size++;
    }

    public void insertLast(int value)
    {
        if(tail==null)
            insertFirst(value);
        Node newNode = new Node(value);
        tail.next=newNode;
        tail=newNode;
        size++;
    }

    public void insertAtIndex(int value, int i)
    {
        if(i==0)
        {
            insertFirst(value);
            return;
        }
        if(i==size-1)
        {
            insertLast(value);
            return;
        }

        Node newNode = new Node(value);
        Node temp = getNode(i-1);
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }

    public void deleteFirst()
    {

        if(size==0)
        {
            System.out.println("No element to be deleted");
            return;
        }
        int del = head.value;
        if(size==1)
        {
            head=null;
            tail=null;
            System.out.println("Element deleted: "+del);
            size--;
            return;
        }
        head=head.next;
        System.out.println("Element deleted: "+del);
        size--;
    }

    public void deleteLast()
    {
        if(size==0)
        {
            System.out.println("No element to be deleted");
            return;
        }
        int del = tail.value;
        if(size==1)
        {
            head=null;
            tail=null;
            System.out.println("Element deleted: "+del);
            size--;
            return;
        }
        tail= getNode(size-2);
        tail.next=null;
        System.out.println("Element deleted: "+del);
        size--;
    }

    public void deleteAtIndex(int i)
    {
        if(i==0)
        {
            deleteFirst();
            return;
        }
        if(i==size-1) {
            deleteLast();
            return;
        }
        Node temp = getNode(i-1);
        int del=temp.next.value;
        temp.next=temp.next.next;
        System.out.println("Element deleted: "+del);
        size--;
    }

    private Node getNode(int i)
    {
        Node temp = head;
        for(int x=0;x<i;x++)
            temp=temp.next;
        return temp;
    }

    public void display()
    {
        Node temp = head;
        for(int i=0;i<size;i++)
        {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.print("END");
        System.out.println();
    }


    private class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value=value;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(2);
        list.insertLast(8);
        list.insertAtIndex(5, 2);
        list.deleteAtIndex(2);
        list.display();

    }

}

