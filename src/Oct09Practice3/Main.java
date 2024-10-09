package Oct09Practice3;

public class Main {
    public static void main(String[] args) {
        MarioGame mario = new MarioGame();

        // 测试从 Normal 状态吃蘑菇
        mario.eatMushroom();
        System.out.println("Current State: " + mario.getState());  // 输出: Super
        System.out.println("Current Score: " + mario.getScore());  // 输出: 150

        // 测试从 Super 状态获得磁铁
        mario.getMagnet();
        System.out.println("Current State: " + mario.getState());  // 输出: Metal
        System.out.println("Current Score: " + mario.getScore());  // 输出: 250

        // 测试从 Metal 状态受到攻击
        mario.underAttack();
        System.out.println("Current State: " + mario.getState());  // 输出: Normal
        System.out.println("Current Score: " + mario.getScore());  // 输出: 17

        // 测试从 Normal 状态获得火焰
        mario.getFire();
        System.out.println("Current State: " + mario.getState());  // 输出: Fire
        System.out.println("Current Score: " + mario.getScore());  // 输出: 217
    }
}
