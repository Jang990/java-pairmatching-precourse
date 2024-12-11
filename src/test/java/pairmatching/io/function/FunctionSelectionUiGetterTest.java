package pairmatching.io.function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionSelectionUiGetterTest {

    @Test
    void 기능_선택_시_사용자_화면을_가져올_수_있음() {
        FunctionSelectionUiGetter getter = new FunctionSelectionUiGetter();
        assertEquals("""
                기능을 선택하세요.
                1. 페어 매칭
                2. 페어 조회
                3. 페어 초기화
                Q. 종료
                """, getter.get());
    }
}