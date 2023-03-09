import java.util.ArrayList;

public class MyStackYourname<E> {
    private ArrayList<E> elements;

    public MyStackYourname() {
        elements = new ArrayList<E>();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements.get(elements.size() - 1);
    }

    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }

    public E push(E element) {
        elements.add(element);
        return element;
    }


    // return elements in order [top to bottom]
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = elements.size() - 1; i >= 0; i--) {
            sb.append(elements.get(i)).append(" ");
        }
        return sb.toString().trim();
    }
}
