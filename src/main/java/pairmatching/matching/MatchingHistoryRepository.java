package pairmatching.matching;

import pairmatching.io.pair.PairOptions;
import pairmatching.options.Level;

import java.util.HashMap;
import java.util.Map;

public class MatchingHistoryRepository {
    private Map<PairOptions, MatchingResult> history = new HashMap<>();

    public MatchingResult findHistory(PairOptions pairOptions) {
        return null;
    }

    public boolean isAlreadyMatched(Level level, Pair pair) {
        return false;
    }

    public void save(MatchingResult matchingResult) {
        history.put(matchingResult.getPairOptions(), matchingResult);
    }
}
