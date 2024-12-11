package pairmatching.loader;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CrewNamesTest {

    @Test
    void 크루원_이름을_가져올_수_있다() {
        CrewNames names = new CrewNames(new CrewNameLoader());

        assertEquals(List.of(
                "백호", "태웅", "치수", "태섭", "대만", "준호", "대협", "덕규", "태산", "경태",
                "수겸", "현준", "준섭", "한나", "소연", "호열", "대남", "용팔", "구식", "달재"), names.getBackendNames());
        assertEquals(List.of(
                "보노", "시저", "쉐리", "신디", "다비", "덴버", "이브", "제시", "라라",
                "린다", "리사", "니콜", "로드", "윌터", "제키"), names.getFrontendNames());
    }

}