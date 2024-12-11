package pairmatching.io.function;

public enum MainFunction {
    PAIR_MATCHING("1", "페어 매칭"),
    PAIR_SEARCH("2", "페어 조회"),
    PAIR_RESET("3", "페어 초기화"),
    EXIT("Q", "종료");

    private String key;
    private String name;

    MainFunction(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }
}
