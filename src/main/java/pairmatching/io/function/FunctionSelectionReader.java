package pairmatching.io.function;

import pairmatching.io.common.InputReader;

public class FunctionSelectionReader {
    private final InputReader reader;
    private final FunctionSelectionUiGetter uiGetter;

    public FunctionSelectionReader(InputReader reader, FunctionSelectionUiGetter uiGetter) {
        this.reader = reader;
        this.uiGetter = uiGetter;
    }

    public MainFunction read() {
        System.out.println(uiGetter.get());
        return findFunction(reader.readLine());
    }

    private MainFunction findFunction(String line) {
        for (MainFunction value : MainFunction.values()) {
            if(value.getKey().equals(line))
                return value;
        }
        throw new IllegalArgumentException("잘못된 기능 선택 입력입니다.");
    }
}
