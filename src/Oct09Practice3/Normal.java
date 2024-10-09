package Oct09Practice3;

public class Normal implements MarioState {
    @Override
    public void eatMushroom(MarioGame mario) {
        mario.addScore(150);
        mario.setState(new Super());
        System.out.println("Eat mushroom, Mario becomes Super Mario");
    }

    @Override
    public void getFire(MarioGame mario) {
        mario.addScore(200);
        mario.setState(new Fire());
        System.out.println("Get fire, Mario becomes Fire Mario");
    }

    @Override
    public void getMagnet(MarioGame mario) {
        mario.addScore(100);
        mario.setState(new Metal());
        System.out.println("Get magnet, Mario becomes Magnet Mario");
    }

    @Override
    public void underAttack(MarioGame mario) {
        System.out.println("Mario in Normal state received attack and NOTHING HAPPENS(maybe died)");
    }
}
