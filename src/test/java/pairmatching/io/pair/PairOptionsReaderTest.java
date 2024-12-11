package pairmatching.io.pair;

import org.junit.jupiter.api.Test;
import pairmatching.io.common.InputReaderStub;
import pairmatching.options.Course;
import pairmatching.options.Level;
import pairmatching.options.Mission;

import static org.junit.jupiter.api.Assertions.*;

class PairOptionsReaderTest {

    @Test
    void 페어와_관련된_입력을_읽어온다() {
        InputReaderStub commonReaderStub = new InputReaderStub("프론트엔드, 레벨1, 자동차경주");
        PairOptionsReader reader = new PairOptionsReader(commonReaderStub);

        PairOptions result = reader.read();

        assertEquals(Course.FRONTEND, result.getCourse());
        assertEquals(Level.LEVEL1, result.getLevel());
        assertEquals(Mission.CAR_RACING, result.getMission());
    }

    @Test
    void 잘못된_입력이_들어오면_예외가_발생한다() {
        InputReaderStub commonReaderStub = new InputReaderStub();
        PairOptionsReader reader = new PairOptionsReader(commonReaderStub);

        commonReaderStub.setTestValue("ABC, 레벨1, 자동차경주");
        assertThrows(IllegalArgumentException.class, reader::read);

        commonReaderStub.setTestValue("프론트엔드, ABC, 자동차경주");
        assertThrows(IllegalArgumentException.class, reader::read);

        commonReaderStub.setTestValue("프론트엔드, 레벨1, ABC");
        assertThrows(IllegalArgumentException.class, reader::read);
    }

}