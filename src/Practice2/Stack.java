package Practice2;

/*
• Implement a class named Stack, which stores int elements, and provides the following methods:
– void push(int x), int pop(), int size(), void clear()
• Implement an inner class StackIterator, which supports the iteration through stored values
– void reset(), boolean hasNext(), int next()
• Experiment with the Stack and StackIterator classes in the main method
 */
// 我做了一点修改，将元素变为Integer,可以赋值为null以此来表示没有赋值的元素，否则用-1或者0初始化的化有缺陷
public class Stack {
    private Integer[] elements;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    public Stack(){
        elements = new Integer[DEFAULT_CAPACITY];
        top = -1;// 设置为-1表示栈为空
    }

    public void push(Integer x){
        if(top == elements.length - 1){// 如果栈已经满了，那么扩容
            resize();// 扩容
        }
        elements[++top] = x;
    }

    public Integer pop(){
        if(top == -1){
            System.out.println("Stack is empty! NO POP()!");
            return null;
        }
        return elements[top--];
    }

    public void resize(){
        int newCapacity = elements.length * 2;// 扩容为原来的两倍
        Integer[] newElements = new Integer[newCapacity];
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
    public class StackIterator{
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

        public Integer next(){
            return elements[current--];
        }


    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(Integer.valueOf(10));
        stack.push(Integer.valueOf(20));
        stack.push(Integer.valueOf(30));
        stack.push(Integer.valueOf(40));
        stack.push(Integer.valueOf(50));
        stack.push(Integer.valueOf(60));

        System.out.println("Stack size: " + stack.size());

        Stack.StackIterator iterator = stack.new StackIterator();
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

