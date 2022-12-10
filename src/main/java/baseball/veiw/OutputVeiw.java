package baseball.veiw;

public class OutputVeiw {
    public void printStartMessage(){
        System.out.println("숫자 야구 게임을 시작합니다.");
    }
    public void printBaseballNumberRequest(){
         System.out.println("숫자를 입력해주세요 : ");
    }
    public void printBaseballGameResult(String result){
        //TODO : 결과를 어떤 형식으로 받아서 출력할 것인가
        System.out.println(result);
    }
    public void printEndGame(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료"+"\n"+"게임을 새로 시작하여면 1, 종료하려면 2를 입력하세요.");

    }
}
