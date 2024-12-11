package pairmatching.matching;

import java.util.List;

public class Pair {
    private List<String> crewNames;

    public Pair(List<String> names) {
        if(names.size() > 3 || names.size() < 2)
            throw new IllegalArgumentException("페어는 2~3명이 필수입니다.");
        crewNames = names;
    }

    public int countDuplicatedCrew(Pair pair) {
        return (int) crewNames.stream()
                .filter(pair.getCrewNames()::contains)
                .count();
    }

    protected List<String> getCrewNames() {
        return crewNames;
    }

    @Override
    public String toString() {
        return String.join(" : ", crewNames);
    }
}
