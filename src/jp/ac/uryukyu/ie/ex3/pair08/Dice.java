package jp.ac.uryukyu.ie.ex3.pair08;
import java.util.Random;
public class Dice {
    private int value;

    public Dice(){
        play();
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
    public void play(){
        this.value = (int)(Math.random()*6) + 1;
     /*   Random rnd = new Random();
        int ran = rnd.nextInt(6) + 1;
        this.value = ran;
        */
    }

}
