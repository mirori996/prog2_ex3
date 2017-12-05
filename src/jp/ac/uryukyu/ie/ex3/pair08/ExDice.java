package jp.ac.uryukyu.ie.ex3.pair08;

public class ExDice extends Dice {
    private int minValue;
    private int maxvalue;

    public ExDice(int minValue, int maxvalue){
        this.minValue = minValue;
        this.maxvalue = maxvalue;
        play();
    }
    @Override
    public void play(){
        int Value = (int)(Math.random()*(maxvalue - minValue + 1));
        setValue(Value + minValue);
    }



}