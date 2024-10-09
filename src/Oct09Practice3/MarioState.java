package Oct09Practice3;

//MarioState.java
public interface MarioState {
    public abstract void eatMushroom(MarioGame mario);
    public abstract void getFire(MarioGame mario);
    public abstract void getMagnet(MarioGame mario);
    public abstract void underAttack(MarioGame mario);
}
