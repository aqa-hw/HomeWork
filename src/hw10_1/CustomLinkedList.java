package hw10_1;
import java.util.ListIterator;

public class CustomLinkedList<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    public void add(T element){
        Node<T> node;
        if (first == null){
            node = new Node<>(element, null, null);
            first = node;
        } else {
            node = new Node<>(element, null, last);
            last.next = node;
        }
        last = node;
        size++;
    }

    public int size() {
        return size;
    }

public T get(int index) {
   return getNodeByIndex(index).element;
}

    private Node<T> getNodeByIndex(int index) {
        Node<T> node = first;
        for (int i = 0; i < index; i++)
        {
            node = node.next;
        }
        return node;
    }
public void remove(int index) {
    Node<T> current = getNodeByIndex(index);
    if (index == 0) {
        first = current.next;
    } else if (index == size - 1) {
        Node<T> newLastNode = current.prev;
        newLastNode.next = null;
        last = newLastNode;
        } else {
        Node<T> beforeNode = current.prev;
        Node<T> afterNode = current.next;
        beforeNode.next = afterNode;
        afterNode.prev = beforeNode;

    }
        size--;
    }

    public T getFirst() {
        return (first != null) ? first.element : null;
    }

    public T getLast() {
        return (last != null) ? last.element : null;
    }


    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element, first, null);

        if (first != null) {
            first.prev = newNode;
        }

        first = newNode;

        if (last == null) {
            last = newNode;
        }

        size++;
    }


    public ListIterator<T> listIterator() {
        return new CustomListIterator();
    }

    private class CustomListIterator implements ListIterator<T> {
        private Node<T> nextNode;
        private Node<T> lastReturned;
        private int nextIndex;

        public CustomListIterator() {
            this.nextNode = first;
            this.lastReturned = null;
            this.nextIndex = 0;
        }
        public boolean hasNext() {
            return nextIndex < size;
        }
        public T next() {
            lastReturned = nextNode;
            nextNode = nextNode.next;
            nextIndex++;
            return lastReturned.element;
        }
        public boolean hasPrevious() {
            return nextIndex > 0;
        }
        public T previous() {
            if (nextNode == null) {
                nextNode = last;
            } else {
                nextNode = nextNode.prev;
            }

            lastReturned = nextNode;
            nextIndex--;
            return lastReturned.element;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(T t) {

        }

        @Override
        public void add(T t) {

        }
    }


    public void set(int index, T element) {
        Node<T> node = getNodeByIndex(index);
        if (node != null) {
            node.element = element;
        }
    }


    private static class Node<T>{
        T element;
        Node<T> next;
        Node<T> prev;

        public Node(T element, Node<T> next, Node<T> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
