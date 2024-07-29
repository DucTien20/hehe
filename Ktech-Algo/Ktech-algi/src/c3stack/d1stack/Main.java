package c3stack.d1stack;

public class Main {
    public static void main(String[] args) {
        MyStack intStack = new MyStack();
        intStack.push(10);
        intStack.push(25);
        intStack.push(20);

        System.out.println(intStack.isEmpty());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
    }
}
