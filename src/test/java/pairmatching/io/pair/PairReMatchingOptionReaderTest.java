package pairmatching.io.pair;

import org.junit.jupiter.api.Test;
import pairmatching.io.common.InputReaderStub;

import static org.junit.jupiter.api.Assertions.*;

class PairReMatchingOptionReaderTest {

    @Test
    void 매칭_다시_시도_입력() {
        InputReaderStub commonInputReader = new InputReaderStub();
        PairReMatchingOptionReader reader = new PairReMatchingOptionReader(commonInputReader);

        commonInputReader.setTestValue("네");
        assertEquals(YesOrNo.YES, reader.read());

        commonInputReader.setTestValue("아니오");
        assertEquals(YesOrNo.NO, reader.read());
    }

    @Test
    void 잘못_입력_시_예외_발생() {
        assertThrows(IllegalArgumentException.class,
                () -> new PairReMatchingOptionReader(
                        new InputReaderStub("ABC")).read());
    }
}