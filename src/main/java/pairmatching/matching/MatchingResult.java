package pairmatching.matching;

import pairmatching.io.pair.PairOptions;

import java.util.List;

public class MatchingResult {
    private final PairOptions pairOptions;
    private final List<Pair> pairs;

    public MatchingResult(PairOptions pairOptions, List<Pair> pairs) {
        this.pairOptions = pairOptions;
        this.pairs = pairs;
    }

    public PairOptions getPairOptions() {
        return pairOptions;
    }

    public List<Pair> getPairs() {
        return pairs;
    }

    public boolean hasPair(Pair pair) {
        return pairs.stream()
                .anyMatch(p -> p.countDuplicatedCrew(pair) >= 2);
    }
}
