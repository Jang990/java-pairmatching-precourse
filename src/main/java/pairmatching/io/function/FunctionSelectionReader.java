package pairmatching.io.function;

import pairmatching.io.common.InputReader;

public class FunctionSelectionReader {
    private final InputReader reader;

    public FunctionSelectionReader(InputReader reader) {
        this.reader = reader;
    }

    public MainFunction read() {
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
