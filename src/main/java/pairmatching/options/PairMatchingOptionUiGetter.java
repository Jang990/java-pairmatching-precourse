package pairmatching.options;

import java.util.Arrays;
import java.util.List;

public class PairMatchingOptionUiGetter {

    private static final String LINE = "#############################################";

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(LINE).append("\n");
        sb.append(createCourseUi());
        sb.append(createMissionUi());
        sb.append(LINE).append("\n");
        sb.append("과정, 레벨, 미션을 선택하세요.").append("\n");

        System.out.println(sb.toString());
        return sb.toString();
    }

    private String createMissionUi() {
        StringBuilder sb = new StringBuilder();
        sb.append("미션: ").append("\n");
        for (Level value : Level.values()) {
            sb.append(createLevelLine(value));
        }
        return sb.toString();
    }

    private String createLevelLine(Level target) {
        StringBuilder sb = new StringBuilder();
        sb.append("  - %s: ".formatted(target.getName()));
        sb.append(String.join(
                " | ", findMission(target).stream().map(Mission::getName).toList())
        );
        sb.append("\n");
        return sb.toString();
    }

    private List<Mission> findMission(Level target) {
        return Arrays.stream(Mission.values())
                .filter(m -> m.getLevel().equals(target))
                .toList();
    }

    private String createCourseUi() {
        return "과정: ".concat(
                String.join(" | ", Arrays.stream(Course.values()).map(Course::getName).toList())
        ).concat("\n");
    }
}
