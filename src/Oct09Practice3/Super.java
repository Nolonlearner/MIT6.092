package Oct09Practice3;

public class Super implements MarioState {
    @Override
    public void eatMushroom(MarioGame mario) {

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
        mario.addScore(-200);
        mario.setState(new Normal());
        System.out.println("Under attack,Super Mario becomes Normal Mario");
    }
}
