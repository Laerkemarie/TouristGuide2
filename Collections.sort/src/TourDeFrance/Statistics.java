package TourDeFrance;

import java.util.*;

public class Statistics {
    private Set<String> teams;
    private Map<String, Set<String>> teamMembers;

    public Statistics(List<Cyclist> cyclists) {
        if (cyclists == null) {
            throw new IllegalArgumentException("Cyclists-listen må ikke være null!");
        }

        teams = new HashSet<>();
        teamMembers = new HashMap<>();

        for (Cyclist cyclist : cyclists) {
            if (cyclist == null) continue; // Undgå fejl hvis der er null-elementer

            String team = cyclist.getTeam().trim();
            String name = cyclist.getName().trim();

            teams.add(team);
            teamMembers.putIfAbsent(team, new HashSet<>());
            teamMembers.get(team).add(name);
        }

        System.out.println("Statistics oprettet med " + teams.size() + " hold.");
    }

    public Set<String> getTeams() {
        return teams;
    }

    public Map<String, Set<String>> getTeamsWithMembers() {
        return teamMembers;
    }

    public Set<String> getTeamMembers(String team) {
        return teamMembers.getOrDefault(team, new HashSet<>());
    }
}

