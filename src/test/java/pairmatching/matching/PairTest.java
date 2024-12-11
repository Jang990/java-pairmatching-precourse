package pairmatching.matching;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    @Test
    void 페어는_3명을_넘어가면_예외발생() {
        assertThrows(IllegalArgumentException.class, () -> new Pair(List.of("AAA", "BBB", "CCC", "DDD")));
    }

    @Test
    void 페어는_2명보다_작으면_예외발생() {
        assertThrows(IllegalArgumentException.class, () -> new Pair(List.of("AAA")));
    }

    @Test
    void 특정_크루원이_얼마나_포함됐는지_확인가능() {
        assertEquals(pair(List.of("AAA", "BBB"))
                .countDuplicatedCrew(pair(List.of("DDD", "EEE"))), 0);
        assertEquals(pair(List.of("AAA", "BBB"))
                .countDuplicatedCrew(pair(List.of("BBB", "CCC"))), 1);
        assertEquals(pair(List.of("AAA", "BBB"))
                .countDuplicatedCrew(pair(List.of("BBB", "AAA"))), 2);
        assertEquals(pair(List.of("AAA", "BBB"))
                .countDuplicatedCrew(pair(List.of("AAA", "BBB", "CCC"))), 2);
    }

    @Test
    void 크루원_출력() {
        assertEquals("AAA : BBB", pair(List.of("AAA", "BBB")).toString());
    }

    private static Pair pair(List<String> names) {
        return new Pair(names);
    }

}