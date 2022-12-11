package baseball;

import baseball.model.Game;
import baseball.model.MakeRandom;
import baseball.veiw.InputVeiw;
import baseball.veiw.OutputVeiw;

public class Application {
    static final InputVeiw inputVeiw = new InputVeiw();
    static final OutputVeiw outputVeiw = new OutputVeiw();
    public static void main(String[] args) {
        outputVeiw.printStartMessage();
        while (true){
            Game game = new Game(MakeRandom.MakeRandom());
            while(!game.isEnd()){
                outputVeiw.printBaseballNumberRequest();
                outputVeiw.printBaseballGameResult(game.compareNumbers(inputVeiw.inputUserBaseballNumber()));
            }
            outputVeiw.printEndGame();
            if(!game.restartGame(inputVeiw.inputUserContinue())){
                break;
            }
        }
    }
}
