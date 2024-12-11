package pairmatching.loader;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CrewNameLoaderTest {
    @Test
    void 파일을_한_줄씩_읽어서_반환() {
        CrewNameLoader nameLoader = new CrewNameLoader();
        assertEquals(List.of(
                        "백호", "태웅", "치수", "태섭", "대만", "준호", "대협", "덕규", "태산", "경태",
                        "수겸", "현준", "준섭", "한나", "소연", "호열", "대남", "용팔", "구식", "달재"
                ),
                nameLoader.loadNames("src/main/resources/backend-crew.md"));
    }
}