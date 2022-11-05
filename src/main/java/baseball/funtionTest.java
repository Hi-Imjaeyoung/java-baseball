package baseball;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static baseball.Application.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class funtionTest {
    @Test
    void 볼_스트라이크를_잘_찾아내는지() {
        String com = "123";
        String num = "2";
        int index = 1;
        assertEquals(1,is_Strike_or_Ball(com,num,index));
        com = "123";
        num = "1";
        index = 1;
        assertEquals(0,is_Strike_or_Ball(com,num,index));
    }
    @Test
    void 볼_스트라이크_출력_테스트(){
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        assertEquals("1볼 2스트라이크",calculate_Result(list));
        list.set(0,0);
        assertEquals("2스트라이크",calculate_Result(list));
        list.set(0,2);
        list.set(1,0);
        assertEquals("2볼",calculate_Result(list));
    }
}
