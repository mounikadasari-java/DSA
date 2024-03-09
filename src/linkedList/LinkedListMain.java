package linkedList;

public class LinkedListMain {

    public static void main(String args[]){
        System.out.println("Hello Linked list");

        LinkedList list = new LinkedList(1);

        list.append(2);

        list.prepend(4);

//        list.removeLast();
//
//        list.removeFirst();
//
//        System.out.println();

        list.insert(2,5);
//
        System.out.println("get  -> "+list.get(2).value);

        list.set(1,3);

        list.printList();
    }
}
