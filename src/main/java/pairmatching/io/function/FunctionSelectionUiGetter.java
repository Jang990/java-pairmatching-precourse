package pairmatching.io.function;

public class FunctionSelectionUiGetter {
    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append("기능을 선택하세요.\n");
        sb.append(createMainFunctionsUi());
        return sb.toString();
    }

    private String createMainFunctionsUi() {
        StringBuilder sb = new StringBuilder();
        for (MainFunction value : MainFunction.values()) {
            sb.append(value.getKey())
                    .append(". ")
                    .append(value.getName())
                    .append("\n");
        }
        return sb.toString();
    }
}
