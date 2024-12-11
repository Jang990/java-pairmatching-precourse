package pairmatching.matching;

import pairmatching.io.pair.PairOptions;
import pairmatching.options.Level;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MatchingHistoryRepository {
    private Map<PairOptions, MatchingResult> history = new HashMap<>();

    public Optional<MatchingResult> findHistory(PairOptions pairOptions) {
        return Optional.ofNullable(history.get(pairOptions));
    }

    public boolean isAlreadyMatched(Level level, Pair pair) {
        return history.keySet().stream()
                .filter(k -> k.getLevel().equals(level))
                .map(history::get)
                .anyMatch(matchingResult -> matchingResult.hasPair(pair));
                // TODO: 조회와 비즈니스 로직의 혼합. map하고 List로 반환하는게 더 적절할 듯.
    }

    public void save(MatchingResult matchingResult) {
        history.put(matchingResult.getPairOptions(), matchingResult);
    }

    public void reset() {
        history = new HashMap<>();
    }
}
