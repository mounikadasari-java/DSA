package linkedList;

public class LinkedList {

    class Node{

        int value;

        Node next;

        public Node(int value){

            this.value = value;

        }

    }

    private int length;

    private Node head;

    private Node tail;

    //constructor
    public LinkedList(int value){

        Node newNode =  new Node(value);

        head = newNode;

        tail =  newNode;

        length = 1;
    }
}
