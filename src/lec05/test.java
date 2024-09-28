package lec05;

public class test {
    private int myCounter = 0;
    private static int ourCounter = 0;
    void increment() {
        myCounter++;
        ourCounter++;
    }
    void printCount() {
        System.out.println( "myCounter = " + myCounter + ", ourCounter = " + ourCounter);
    }

    public int nums=0;
    public void service(int nums){
        nums = this.nums +nums;
        System.out.println(nums);

        nums = nums +nums;
        System.out.println(nums);

        nums = this.nums +this.nums;
        System.out.println(nums);
    }
    public static void main(String[] args) {
        test obj1 = new test();
        test obj2 = new test();
        obj1.increment();
        obj1.increment();
        obj2.increment();
        Class<? extends test> cls = obj1.getClass();
        String instanceName = cls.getSimpleName();
        System.out.println(instanceName);

        instanceName = obj2.toString();
        System.out.println(instanceName);

        obj1.printCount();
        obj2.printCount();

        obj1.service(10);
    }
}
