package euroMålScorer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MatchResultFileReader {
    private String fileName = "C:/Users/laerk/Downloads/Euro2024QualifyingRound(in).csv";

    public MatchResultFileReader() throws FileNotFoundException {
       String fileName = "C:/Users/laerk/Downloads/Euro2024QualifyingRound(in).csv";
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + fileName);
        }
    }

    public List<MatchResult> readFile() throws FileNotFoundException {
        List<MatchResult> matchResults = new ArrayList<>();
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(";");

            String teams = parts[0];

            List<String> goalScores = new ArrayList<>();
            if (parts.length > 1) {
                String[] scores = parts[1].split(",");
                goalScores = Arrays.asList(scores);
            }

            matchResults.add(new MatchResult(teams, goalScores));

        }

        scanner.close();
        return matchResults;
    }
}
