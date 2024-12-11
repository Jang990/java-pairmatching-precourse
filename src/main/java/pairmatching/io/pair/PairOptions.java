package pairmatching.io.pair;

import pairmatching.options.Course;
import pairmatching.options.Level;
import pairmatching.options.Mission;

public class PairOptions {
    private final Course course;
    private final Level level;
    private final Mission mission;

    public PairOptions(Course course, Level level, Mission mission) {
        this.course = course;
        this.level = level;
        this.mission = mission;
    }

    public Course getCourse() {
        return course;
    }

    public Level getLevel() {
        return level;
    }

    public Mission getMission() {
        return mission;
    }
}
