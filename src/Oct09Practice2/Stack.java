package Oct09Practice2;


import java.util.Iterator;

public class Stack<T> {
    private Object[] elements;
    private int top;// 栈顶元素的索引
    private static final int DEFAULT_CAPACITY = 10;

    public Stack(){
        elements = new Object[DEFAULT_CAPACITY];
        top = -1;// 设置为-1表示栈为空
    }

    public void push(T element){
        if(top == elements.length - 1){// 如果栈已经满了，那么扩容
            resize();// 扩容
        }
        elements[++top] = element;
    }

    public T pop(){
        if(top == -1){
            System.out.println("Stack is empty! NO POP()!");
            return null;
        }
        T result = (T)elements[top];
        top--;
        return result;
    }

    public T peek(){
        if(top == -1){
            System.out.println("Stack is empty! NO PEEK()!");
            return null;
        }
        T result = (T)elements[top];
        return result;
    }

    public void resize(){
        int newCapacity = elements.length * 2;// 扩容为原来的两倍
        Object[] newElements = new Object[newCapacity];
        for(int i = 0; i < elements.length; i++){
            newElements[i] = elements[i];
        }
        for(int i = elements.length; i < newCapacity; i++){
            newElements[i] = null;// 初始化新元素null
        }
        elements = newElements;// 更新数组
        System.out.println("Stack is full, capacity is doubled.");
        System.gc();// 垃圾回收
        // 只要没有引用指向对象，对象就会被垃圾回收器回收，所以newElements指向的对象暂时不会被回收，因为element = newElements
    }

    public int size(){
        return top + 1;
    }

    public void clear(){
        for(int i = 0; i < elements.length; i++){
            elements[i] = null;
        }
        top = -1;
    }

    // 内部类 inner class
    public class StackIterator implements Iterator<T> {
        private int current;// 当前元素的索引

        public StackIterator(){
            current = top;
        }

        public void reset(){
            current = top;
        }

        public boolean hasNext(){
            return current >= 0;
        }

        public T next(){
            T result = (T)elements[current];
            current--;
            return result;
        }

        public void remove() {
            if(current < 0) {
                throw new UnsupportedOperationException();
            }
            for(int i = current; i < top; i++) {
                elements[i] = elements[i + 1];
            }
            elements[top] = null;

        }


    }

    public static void main(String[] args) {
        Practice2.Stack stack = new Practice2.Stack();
        stack.push(Integer.valueOf(10));
        stack.push(Integer.valueOf(20));
        stack.push(Integer.valueOf(30));
        stack.push(Integer.valueOf(40));
        stack.push(Integer.valueOf(50));
        stack.push(Integer.valueOf(60));

        System.out.println("Stack size: " + stack.size());

        Practice2.Stack.StackIterator iterator = stack.new StackIterator();
        System.out.println("Stack elements:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());

        stack.clear();
        System.out.println("Stack size after clear: " + stack.size());
    }
}

