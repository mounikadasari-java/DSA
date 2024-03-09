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

    //print the list
    public void printList(){

        Node  temp = head;

        int count = 0;

        while( temp != null){

            System.out.println(temp.value);

            temp = temp.next;

            count++;
        }

        System.out.println("count -> "+count);
    }


    //adding at last
    public void append(int value){

        Node newNode = new Node(value);

        if(length == 0){

            head = newNode;

            tail =  newNode;
        }
        else{

            tail.next = newNode;

            tail = newNode;
        }

        length++;
    }

    //remove last
    public Node removeLast(){

        if(length == 0) return null;

        Node temp = head;

        Node prev = head;

        while(temp.next != null){

            prev = temp;

            temp = temp.next;

        }

        tail = prev;

        tail.next = null;

        length--;

        if(length == 0){

            tail = null;

            head = null;
        }

        return temp;

    }

    //prepend, adding to head part

    public void prepend(int value){

        Node newNode =  new Node(value);

        if(length == 0){

            head = newNode;

            tail = newNode;
        }
        else{

            newNode.next = head;

            head = newNode;
        }

        length++;
    }

    //remove first
    public Node removeFirst(){

        if(length == 0) return null;

        Node temp = head;

        head = head.next;

        temp.next = null;

        length--;

        if(length == 0){

            tail = null;
        }

        return temp;
    }

    //get the element at the perticular index
    public Node get(int index){

        if(index < 0 || index >= length) return null;

        Node temp = head;

        for(int i = 0; i < index; i++){

            temp  = temp.next;
        }

        return temp;
    }

    //set the value at the index

    public boolean set(int index, int value){

        Node temp = get(index);

        while(temp != null){

            temp.value = value;

            return true;
        }

        return false;

    }

    //insert new node at particular index

    public boolean insert(int value, int index){

        if(index < 0 || index > length) return false;

        if(index == length){

            append(value);

            return true;
        }

        if(index == 0){

            prepend(value);

            return true;
        }

        Node newNode = new Node(value);

        Node temp = get(index - 1);

        newNode.next = temp.next;

        temp.next = newNode;

        length++;

        return true;
    }

    //remove value at particular index

    public Node remove(int index){

        if(index < 0 || index >= length) return null;

        if(index == 0){

            return removeFirst();

        }

        if(index == length){

            return removeLast();
        }

        Node prev = get(index - 1);

        Node temp = prev.next;

        prev.next = temp.next;

        temp.next = null;

        length--;

        return temp;

    }

    //reverse the list

    public void reverse(){

        Node temp = head;

        head = tail;

        tail = head;

        Node after = temp.next;

        Node before = null;

        for(int i = 0; i < length; i++) {

            after = temp.next;

            temp.next = before;

            before = temp;

            temp = after;
        }
    }

}
