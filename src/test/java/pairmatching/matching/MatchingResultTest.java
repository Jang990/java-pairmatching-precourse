package pairmatching.matching;

import org.junit.jupiter.api.Test;
import pairmatching.io.pair.PairOptions;
import pairmatching.options.Course;
import pairmatching.options.Level;
import pairmatching.options.Mission;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MatchingResultTest {

    @Test
    void 특정_크루가_함께_있는지_확인_가능() {
        PairOptions pairOptions = new PairOptions(Course.BACKEND, Level.LEVEL1, Mission.BASEBALL);
        List<Pair> pairs = List.of(new Pair(List.of("ABC", "DDD", "CCC")));
        MatchingResult matchingResult = new MatchingResult(pairOptions, pairs);

        assertTrue(matchingResult.hasPair(new Pair(List.of("ABC", "CCC"))));
        assertFalse(matchingResult.hasPair(new Pair(List.of("ABC", "EEE"))));
    }

}