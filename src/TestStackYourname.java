public class TestStackYourname {

    public static void main(String[] args) {

        MyStackYourname<Integer> stack = new MyStackYourname<Integer>();

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Size of stack: " + stack.size());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack after pushing 10, 20, 30, 40, 50: " + stack.toString());
        System.out.println("Size of stack: " + stack.size());

        System.out.println("Top element in stack: " + stack.peek());

        System.out.println("Pop element from stack: " + stack.pop());
        System.out.println("Stack after popping: " + stack.toString());
        System.out.println("Size of stack: " + stack.size());

        System.out.println("Pop element from stack: " + stack.pop());
        System.out.println("Stack after popping: " + stack.toString());
        System.out.println("Size of stack: " + stack.size());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
