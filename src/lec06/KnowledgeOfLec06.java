package lec06;

public class KnowledgeOfLec06 {
    public static void main(String args[]) {
        System.out.println("This is the knowledge of Lecture 06.");
        System.out.println("What is a good program?");
        System.out.println(
                "Correct / no errors\n" +
                "Easy to understand\n" +
                "Easy to modify / extend\n" +
                "Good performance (speed)");

        System.out.println("naming like highScore, minLevel, etc.");
        // good naming:  lowercase first letter, capitals separating words
        // bad naming:   all lowercase, all uppercase, no separation

        System.out.println("Good classes: easy to understand and use");
        /*
        Make fields and methods private by default
        Only make methods public if you need to
        If you need access to a field, create a method:
            public int getBar() { return bar; }
         */

        System.out.println("What is debugging?");
        System.out.println("Finding and fixing errors in your code");
        System.out.println(
                "Donʼt introduce errors in the first place\n" +
                "Reuse: find existing code that does what you want\n" +
                "Design: think before you code\n" +
                "Best Practices: Recommended \n" +
                "procedures/techniques to avoid common problems");
        System.out.println(
                "pseduo code: write out the steps of your program in English before you write the code\n" +
                "伪代码只需要关心框架，不需要关心具体的语法，可以帮助你更好的理解问题\n"
                );
    }
}