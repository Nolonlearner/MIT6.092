package lec04;
/*
* static的基本概念->定义：static关键字用于声明类的字段和方法，使其与类本身相关联，而不是与类的实例（对象）相关联。
* static的作用->1. 修饰字段：所有实例共享这个字段，可以用类名直接访问；2. 修饰方法：可以直接通过类名调用，不需要实例化对象。
* static的使用场景->1. 常量：使用static final修饰；2. 工具类：如Math类；3. 单例模式：只有一个实例的类；4. 计数器：统计类的实例个数。
* static的注意事项->1. 静态方法中不能直接访问非静态字段和方法；2. 静态方法中不能使用this和super关键字；3. 静态方法中不能直接调用非静态方法。
* static的优缺点->1. 优点：节省内存，提高性能；2. 缺点：生命周期长，容易导致内存泄漏。
* 适用的场景
*   a. 静态字段（Static Fields）
*       共享状态：static字段被所有实例共享。例如，如果一个类有一个static字段，它的所有对象都会访问同一个字段。这适用于需要在所有对象之间共享的数据。
*   b. 静态方法（Static Methods）
*       类级别的行为：static方法可以在没有对象实例的情况下被调用。这使得它们适合于工具类或常用功能，比如数学运算。
* 静态块（Static Blocks）
*   静态初始化：可以使用静态块在类加载时初始化静态字段。这在需要复杂初始化时非常有用。
*   class Example {
        static int value; // 静态字段
        static {
            value = 10; // 静态块初始化
        }
    }
* 注意事项->与实例无关：static字段和方法不可以直接访问实例字段和方法，必须通过对象来访问实例成员。
*   static字段和方法属于类本身，而不是类的实例。这意味着可以在没有创建对象的情况下访问它们。
*   由于它们与特定实例无关，static成员不能直接访问实例字段和方法。
*   实例字段和方法属于特定的对象实例。要访问这些成员，必须通过对象的引用。
*   A->static方法访问实例成员:
*       class Example {
*       int value; // 实例字段
        static int count; // 静态字段
        void increment() {
            value++; // 实例方法可以访问实例字段
            count++; // 实例方法可以访问静态字段
            }
        static void increment() {
            value++; // 编译错误：静态方法不能访问实例字段
            count++; // 静态方法可以访问静态字段
            }
        }

*   B->通过对象访问实例成员:
*       class Example {
            int instanceField = 20; // 实例字段
            static void staticMethod(Example obj) {
            // 通过对象引用访问实例字段
                System.out.println(obj.instanceField); // 正确，输出 20
            }
        }
* 对于普通字段：
* public class Baby {
    int numBabiesMade = 0; // 实例字段

    Baby() {
        numBabiesMade += 1; // 创建新实例时增加计数
    }
 }
* numBabiesMade 是一个实例字段。这意味着每个 Baby 对象都有自己的 numBabiesMade 副本。
* 在构造函数中，每当创建一个新的 Baby 对象时，numBabiesMade 的值会增加1。
* 由于 numBabiesMade 是实例字段，每个 Baby 对象的 numBabiesMade 都是独立的，不会相互影响。所以每一个 numBabiesMade 的值都是 1。
*
* 对于静态字段：
* public class Baby {
    static int numBabiesMade = 0; // 静态字段

    Baby() {
        numBabiesMade += 1; // 创建新实例时增加计数
    }
 }
* static int numBabiesMade 是一个静态字段。它与类本身相关，而不是与任何特定实例相关。
* 当创建新的 Baby 对象时，所有对象共享同一个 numBabiesMade 字段。每次创建新对象时，numBabiesMade 的值都会增加1。
* 这样，无论创建多少个 Baby 对象，它们都将共享相同的 numBabiesMade 值，能够更准确地跟踪所有创建的Baby对象的总数。
*
*
* why main method is static in Java?
*  1. main()方法是程序的入口点，JVM调用main()方法来执行程序。
*  2. main()方法是静态的，因为在调用main()方法时，没有创建对象实例。
*  3. 静态方法可以直接通过类名调用，而不需要创建对象实例。
*  其实就是因为不想要创建对象实例之后再编译，所以main()方法被定义为静态的。可以通过类名直接访问执行
* */
class Counter {
    static int count = 0; // 静态字段

    Counter() {
        count++; // 每次创建对象时，计数器增加
    }
}

class MathUtils {
    static int add(int a, int b) {
        return a + b;
    }
}

class Baby {
    String name; // 实例字段
    Baby(){
        this.name = "Default Baby Name";
    }
    Baby(String name) {
        this.name = name;
    }
    static void cry(Baby thebaby) {
        System.out.println(thebaby.name + " cries");
    }
    /*
    * 静态方法 cry 是一个类方法，使用 static 关键字定义。这意味着它可以在没有创建 Baby 对象的情况下直接通过类名调用。
    * 方法接受一个 Baby 类型的参数 thebaby，并打印出该婴儿的名字和“哭泣”的信息。
    */

    /*
    * 实例方法 cry 是一个实例方法，没有使用 static 关键字定义。这意味着它必须通过 Baby 对象的引用调用。
    * public class Baby {
        void cry() {
            System.out.println(name + " cries");
            }
        }
    * 实例方法 cry 是一个非静态方法，属于特定的 Baby 对象。要调用这个方法，必须先创建 Baby 的实例。
    * 在这个方法中，可以直接访问实例字段（如 name），因为它是与特定对象相关的。
    * Baby baby = new Baby("Tommy");
    * baby.cry();
    * */
}

//下面是这次Assignment04的实现


public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.count); // 输出 2
        int sum = MathUtils.add(5, 10); // 直接通过类名MathUtils.add调用
        System.out.println(sum); // 输出 15
        Baby.cry(new Baby("Tom")); // 输出 Tom cries
    }
}
