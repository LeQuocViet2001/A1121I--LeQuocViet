package ss10DanhSach.ThucHanh.LinkedList;

public class TestMyLinkedList {

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(2);


        ll.addFirst(4);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,8);
        ll.add(4,5);
        ll.printList();
    }
}
