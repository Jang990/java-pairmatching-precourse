package pairmatching.io.pair;

import pairmatching.io.common.InputReader;
import pairmatching.options.Course;
import pairmatching.options.Level;
import pairmatching.options.Mission;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PairOptionsReader {
    private static final String DELIMITER = Pattern.quote(", ");
    private static final int COURSE_IDX = 0;
    private static final int LEVEL_IDX = 1;
    private static final int MISSION_IDX = 2;
    private static final String COURSE_INPUT_ERROR = "잘못된 코스 입력입니다.";
    private static final String LEVEL_INPUT_ERROR = "잘못된 레벨 입력입니다.";
    private static final String MISSION_INPUT_ERROR = "잘못된 미션 입력입니다.";

    private final InputReader inputReader;

    public PairOptionsReader(InputReader inputReader) {
        this.inputReader = inputReader;
    }

    public PairOptions read() {
        String[] options = inputReader.readLine().split(DELIMITER);
        return new PairOptions(
                parseCourse(options[COURSE_IDX]),
                parseLevel(options[LEVEL_IDX]),
                parseMission(options[MISSION_IDX])
        );
    }

    private Mission parseMission(String option) {
        return Arrays.stream(Mission.values())
                .filter(m -> m.getName().equals(option))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(MISSION_INPUT_ERROR));
    }

    private Level parseLevel(String option) {
        return Arrays.stream(Level.values())
                .filter(l -> l.getName().equals(option))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(LEVEL_INPUT_ERROR));
    }

    private Course parseCourse(String option) {
        return Arrays.stream(Course.values())
                .filter(c -> c.getName().equals(option))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(COURSE_INPUT_ERROR));
    }
}
