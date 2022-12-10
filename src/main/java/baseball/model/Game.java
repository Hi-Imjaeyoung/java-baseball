package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Integer> computerNumber;
    private int strike,ball;
    public Game(List<Integer> numbers){
        this.computerNumber = numbers;
        this.strike =0;
        this.ball =0;
    }
    public String compareNumbers(String input){
        resetCount();
        List<Integer> inputNumbers = convertNumbers(input);
        for(int i=0;i<3;i++){
            int nowNumber = inputNumbers.get(i);
            if(computerNumber.contains(nowNumber))
                isStrikeOrBall(nowNumber,i);
        }
        return result();
    }
    public List<Integer> convertNumbers(String input){
        List<Integer> inputNumbers = new ArrayList<>();
        for(int i=0 ;i<3;i++){
            inputNumbers.add(Character.getNumericValue(input.charAt(i)));
        }
        return inputNumbers;
    }
    public boolean restartGame(String input){
        if(input.equals("1")){
            return true;
        }
        return false;
    }
    private void isStrikeOrBall(int number,int index){
        if(computerNumber.get(index)==number){
            strike = strike+1;
            return;
        }
        ball=ball+1;
    }
    private void resetCount(){
        strike = 0;
        ball = 0;
    }
    private String result(){
        if(strike==0 && ball ==0){
            return "낫싱";
        }
        if(ball==0){
            return strike+"스트라이크";
        }
        if(strike==0){
            return ball+"볼";
        }
        return ball+"볼 "+strike+"스트라이크" ;
    }

}
