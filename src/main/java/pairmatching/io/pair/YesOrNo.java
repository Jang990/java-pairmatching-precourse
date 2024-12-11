package pairmatching.io.pair;

public enum YesOrNo {
    YES("네"), NO("아니오");

    private String name;

    YesOrNo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
