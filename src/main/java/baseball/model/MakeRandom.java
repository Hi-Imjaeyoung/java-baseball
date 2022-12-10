package baseball.model;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class MakeRandom {
    public List<Integer> MakeRandom(){
        List<Integer> numbers = new ArrayList<>();
        while(numbers.size()<3){
            int number = Randoms.pickNumberInRange(1,9);
            if(numbers.contains(number))
                numbers.add(number);
        }
        return numbers;
    }
}
