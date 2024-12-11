package pairmatching.io.function;

import org.junit.jupiter.api.Test;
import pairmatching.io.common.InputReaderStub;

import static org.junit.jupiter.api.Assertions.*;

class FunctionSelectionReaderTest {

    @Test
    void 사용자_기능_선택을_읽는다() {
        InputReaderStub commonReaderStub = new InputReaderStub();
        FunctionSelectionReader reader = new FunctionSelectionReader(commonReaderStub, new FunctionSelectionUiGetter());

        commonReaderStub.setTestValue("1");
        assertEquals(MainFunction.PAIR_MATCHING, reader.read());

        commonReaderStub.setTestValue("2");
        assertEquals(MainFunction.PAIR_SEARCH, reader.read());

        commonReaderStub.setTestValue("3");
        assertEquals(MainFunction.PAIR_RESET, reader.read());

        commonReaderStub.setTestValue("Q");
        assertEquals(MainFunction.EXIT, reader.read());
    }

    @Test
    void 잘못된_입력이_들어오면_예외가_발생한다() {
        InputReaderStub commonReaderStub = new InputReaderStub();
        FunctionSelectionReader reader = new FunctionSelectionReader(commonReaderStub, new FunctionSelectionUiGetter());
        commonReaderStub.setTestValue("ABC");

        assertThrows(IllegalArgumentException.class, reader::read);
    }

}