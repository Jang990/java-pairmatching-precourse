package pairmatching.matching;

import org.junit.jupiter.api.Test;
import pairmatching.io.pair.PairOptions;
import pairmatching.options.Course;
import pairmatching.options.Level;
import pairmatching.options.Mission;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MatchingHistoryRepositoryTest {

    @Test
    void 페어_매칭_기록_초기화() {
        MatchingHistoryRepository repository = new MatchingHistoryRepository();
        PairOptions pairOptions = new PairOptions(Course.BACKEND, Level.LEVEL1, Mission.BASEBALL);
        List<Pair> pairs = List.of(new Pair(List.of("A", "B")));
        MatchingResult matchingResult = new MatchingResult(pairOptions, pairs);
        repository.save(matchingResult);

        repository.reset();

        assertFalse(repository.findHistory(pairOptions).isPresent());
    }

    @Test
    void 페어_매칭_기록_조회_가능() {
        MatchingHistoryRepository repository = new MatchingHistoryRepository();
        PairOptions pairOptions = new PairOptions(Course.BACKEND, Level.LEVEL1, Mission.BASEBALL);
        List<Pair> pairs = List.of(new Pair(List.of("A", "B")));
        MatchingResult matchingResult = new MatchingResult(pairOptions, pairs);
        repository.save(matchingResult);

        Optional<MatchingResult> history = repository.findHistory(pairOptions);

        assertTrue(history.isPresent());
        assertEquals(history.get(), matchingResult);
    }

    @Test
    void 같은_레벨에서_이미_만난적_있는지_조회() {
        MatchingHistoryRepository repository = new MatchingHistoryRepository();
        PairOptions pairOptions = new PairOptions(Course.BACKEND, Level.LEVEL1, Mission.BASEBALL);
        List<Pair> pairs = List.of(
                new Pair(List.of("A", "B")),
                new Pair(List.of("C", "D")),
                new Pair(List.of("E", "F", "G"))
        );
        repository.save(new MatchingResult(pairOptions, pairs));

        assertTrue(repository.isAlreadyMatched(Level.LEVEL1, new Pair(List.of("F", "G"))));
    }

}