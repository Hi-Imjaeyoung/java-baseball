package baseball.model;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class MakeRandom {
    public static List<Integer> MakeRandom(){
        List<Integer> numbers = new ArrayList<>();
        while(numbers.size()<Constant.LENGTH_NUMBER.length){
            int number = Randoms.pickNumberInRange(1,9);
            if(!numbers.contains(number))
                numbers.add(number);
        }
        return numbers;
    }
}
