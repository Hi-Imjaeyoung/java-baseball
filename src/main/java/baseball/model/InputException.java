package baseball.model;

public class InputException {
    public  void isBaseballNumber(String input) throws IllegalArgumentException{
        if(input.replaceAll("[^1-9]", "").length() != input.length()){
            throw new IllegalArgumentException("1과 9사이 숫자를 입력해주세요.");
        }
        if(input.length()!=3){
            throw new IllegalArgumentException("숫자를 3개만 입력해주세요.");
        }
    }
    public void isRestartOrEndNumber(String input) throws IllegalArgumentException{
        if(input.replaceAll("[^0-9]", "").length() != input.length()){
            throw new IllegalArgumentException("숫자를 입력해주세요.");
        }
        if(!input.equals("1") && !input.equals("2")){
            throw new IllegalArgumentException("1과 2로 입력해주세요");
        }
    }
}
