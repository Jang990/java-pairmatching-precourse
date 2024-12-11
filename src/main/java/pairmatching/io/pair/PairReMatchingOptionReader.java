package pairmatching.io.pair;

import pairmatching.io.common.InputReader;

public class PairReMatchingOptionReader {
    private static final String OVERWRITING_MESSAGE = """
            매칭 정보가 있습니다. 다시 매칭하시겠습니까?
            네 | 아니오
            """;
    private static final String OVERWRITING_ERROR_MESSAGE = "잘못된 다시 매칭 시도 입력입니다.";

    private final InputReader reader;

    public PairReMatchingOptionReader(InputReader reader) {
        this.reader = reader;
    }

    public YesOrNo read() {
        System.out.println(OVERWRITING_MESSAGE);
        return parseYesOrNo(reader.readLine());
    }

    private YesOrNo parseYesOrNo(String input) {
        for (YesOrNo value : YesOrNo.values()) {
            if(value.getName().equals(input))
                return value;
        }
        throw new IllegalArgumentException(OVERWRITING_ERROR_MESSAGE);
    }
}
