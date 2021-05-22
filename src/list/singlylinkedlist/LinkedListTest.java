package list.singlylinkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.insertAtFront("Java");
        list.insertAtFront("Rust");
        list.insertAtLast("Javascript");

        System.out.println("Size: " + list.size() + ", list: " + list);
    }
}
