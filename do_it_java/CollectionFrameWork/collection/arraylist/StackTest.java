package do_it_java.CollectionFrameWork.collection.arraylist;

import java.util.ArrayList;

class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<>();

    public void push(String data) {
        arrayStack.add(data);
    }

    public String pop() {
        if (arrayStack.size() == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return arrayStack.remove(arrayStack.size()-1);
    }
}

public class StackTest {

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
