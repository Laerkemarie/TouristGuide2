package TourDeFrance;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        TDFFileReader reader = new TDFFileReader("C:/Users/laerk/Downloads/tdffinishers2024.csv");
        List<Cyclist> cyclists = reader.readFile();

        Statistics stats = new Statistics(cyclists);


        System.out.println("Afsluttede hold:");
        Set<String> teams = stats.getTeams();
        for (String team : teams) {
            System.out.println(team);
        }

        System.out.println();

        System.out.println("Hold og medlemmer:");
        Map<String, Set<String>> teamsWithMembers = stats.getTeamsWithMembers();
        for (Map.Entry<String, Set<String>> entry : teamsWithMembers.entrySet()) {
            System.out.println("Hold: " + entry.getKey());
            System.out.println("Medlemmer: " + entry.getValue());
            System.out.println();
        }

        String teamName = "UAE TEAM EMIRATES";
        System.out.println("Medlemmer af holdet: " + teamName + ":");
        Set<String> teamMembers = stats.getTeamMembers(teamName);
        if (teamMembers.isEmpty()) {
            System.out.println("Ingen medlemmer fundet for dette hold.");
        } else {
            System.out.println(teamMembers);
        }
    }
}
