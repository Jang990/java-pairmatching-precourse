package pairmatching.loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CrewNameLoader {
    public List<String> loadNames(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            return readAll(br);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<String> readAll(BufferedReader br) throws IOException {
        List<String> result = new LinkedList<>();
        String line;
        while ((line = br.readLine()) != null) {
            result.add(line);
        }
        return result;
    }
}
