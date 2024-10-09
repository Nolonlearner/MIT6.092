package Oct09Practice3;

// MarioGame.java
public class MarioGame {
    private MarioState state;//当前状态
    private int score;//当前分数

    public MarioGame(){
        state = new Normal();//初始化为小马里奥
        score = 0;
    }

    public MarioState getState(){
        return state;
    }

    public void setState(MarioState state){
        this.state = state;
    }

    public void addScore(int add){
        score += add;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }

    public void eatMushroom(){
        state.eatMushroom(this);
    }

    public void getFire(){
        state.getFire(this);
    }

    public void getMagnet(){
        state.getMagnet(this);
    }

    public void underAttack(){
        state.underAttack(this);
    }



}
