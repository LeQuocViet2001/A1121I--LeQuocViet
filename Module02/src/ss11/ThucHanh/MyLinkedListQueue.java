package ss11.ThucHanh;

public class MyLinkedListQueue {
    private Note head;
    private Note tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        Note temp = new Note(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Note dequeue() {
        if (this.head == null)
            return null;
        Note temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }




}
