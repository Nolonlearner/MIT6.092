package Oct09Practice3;

public class Fire implements MarioState {
    @Override
    public void eatMushroom(MarioGame mario) {

    }

    @Override
    public void getFire(MarioGame mario) {

    }

    @Override
    public void getMagnet(MarioGame mario) {

    }

    @Override
    public void underAttack(MarioGame mario) {
        mario.addScore(-233);
        mario.setState(new Normal());
        System.out.println("Under attack, Mario becomes Normal Mario");
    }
}
