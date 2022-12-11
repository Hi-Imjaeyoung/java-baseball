package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class GameTest {
    @DisplayName("숫자야구 사용자 입력")
    @Test
    void CONVERT(){
        Game game = new Game(List.of(1,2,3));
        List<Integer> expect = List.of(1,2,3);
        assertThat(game.convertNumbers("123")).containsExactly(1,2,3);
    }
    @DisplayName("숫자야구 게임 결과")
    @Test
    void NOTHING(){
        Game game = new Game(List.of(1,2,3));
        assertThat("낫싱").isEqualTo(game.compareNumbers("456"));
    }
    @Test
    void BALL(){
        Game game = new Game(List.of(1,2,3));
        assertThat("1볼").isEqualTo(game.compareNumbers("245"));
        assertThat("2볼").isEqualTo(game.compareNumbers("235"));
        assertThat("3볼").isEqualTo(game.compareNumbers("231"));
    }
    @Test
    void STRIKE(){
        Game game = new Game(List.of(1,2,3));
        assertThat("1스트라이크").isEqualTo(game.compareNumbers("145"));
        assertThat("2스트라이크").isEqualTo(game.compareNumbers("125"));
        assertThat("3스트라이크").isEqualTo(game.compareNumbers("123"));
    }
    @Test
    void BALLANDSTRIKE(){
        Game game = new Game(List.of(1,2,3));
        assertThat(game.compareNumbers("142")).isEqualTo("1볼 1스트라이크");
    }
    @DisplayName("난수 생성 테스트")
    @Test
    void RANDOMNUMBER(){
        List<Integer> list = MakeRandom.MakeRandom();
        Stream<Integer> stream = list.stream().distinct();
        assertThat(list.size()==stream.toArray().length).isEqualTo(true);
        list = List.of(1,1,1);
        stream = list.stream().distinct();
        assertThat(list.size()==stream.toArray().length).isEqualTo(false);
    }
}