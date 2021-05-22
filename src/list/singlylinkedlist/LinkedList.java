package list.singlylinkedlist;

public class LinkedList <T> {
    private Node head = null;
    int size = 0;

    private class Node<T> {
        Object data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtFront(T item) {
        if (size == 0) {
            head = new Node(item);
            return;
        }

        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtLast(T item) {
        if (size == 0) {
            insertAtFront(item);
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        Node newNode = new Node(item);
        currentNode.next = newNode;
        size++;
    }

    public void insertAtPosition(T item, int pos) {
        if (size == 0) {
            insertAtFront(item);
            return;
        }




    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        Node currentNode = head;

        String list = "[";

        while (currentNode != null) {
            list += currentNode.data;
            list += currentNode.next != null ? "," : "";
            currentNode = currentNode.next;
        }

        list += "]";

        return list;
    }
}
