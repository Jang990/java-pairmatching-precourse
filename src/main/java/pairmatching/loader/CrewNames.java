package pairmatching.loader;

import java.util.List;

public class CrewNames {
    private static final String BACKEND_FILE_PATH = "src/main/resources/backend-crew.md";
    private static final String FRONTEND_FILE_PATH = "src/main/resources/frontend-crew.md";
    private final List<String> backendNames;
    private final List<String> frontendNames;

    public CrewNames(CrewNameLoader loader) {
        // TODO: 불변 List로
        backendNames = loader.loadNames(BACKEND_FILE_PATH);
        frontendNames = loader.loadNames(FRONTEND_FILE_PATH);
    }

    public List<String> getBackendNames() {
        return backendNames;
    }

    public List<String> getFrontendNames() {
        return frontendNames;
    }
}
