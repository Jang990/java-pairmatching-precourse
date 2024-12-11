package pairmatching.options;

public enum Mission {
    자동차경주(Level.LEVEL1, "자동차경주"),
    로또(Level.LEVEL1, "로또"),
    숫자야구게임(Level.LEVEL1, "숫자야구게임"),
    장바구니(Level.LEVEL2, "장바구니"),
    결제(Level.LEVEL2, "결제"),
    지하철노선도(Level.LEVEL2, "지하철노선도"),
    성능개선(Level.LEVEL4, "성능개선"),
    배포(Level.LEVEL4, "배포");

    private Level level;
    private String name;

    Mission(Level level, String name) {
        this.level = level;
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
