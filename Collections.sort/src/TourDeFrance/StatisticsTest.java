package TourDeFrance;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

class StatisticsTest {

    @Test
    public void testGetTeams() {
        List<Cyclist> cyclists = List.of(
                new Cyclist("Tadej Pogačar", "UAE TEAM EMIRATES"),
                new Cyclist("Jonas Vingegaard", "TEAM VISMA | LEASE A BIKE"),
                new Cyclist("Joao Almeida", "UAE TEAM EMIRATES")
        );

        Statistics stats = new Statistics(cyclists);
        Set<String> teams = stats.getTeams();

        assertEquals(2, teams.size());
        assertTrue(teams.contains("UAE TEAM EMIRATES"));
        assertTrue(teams.contains("TEAM VISMA | LEASE A BIKE"));
    }

    @Test
    public void testGetTeamsWithMembers() {
        List<Cyclist> cyclists = List.of(
                new Cyclist("Tadej Pogačar", "UAE TEAM EMIRATES"),
                new Cyclist("Joao Almeida", "UAE TEAM EMIRATES"),
                new Cyclist("Jonas Vingegaard", "TEAM VISMA | LEASE A BIKE")
        );

        Statistics stats = new Statistics(cyclists);
        Map<String, Set<String>> teamsWithMembers = stats.getTeamsWithMembers();

        assertEquals(2, teamsWithMembers.size());
        assertEquals(Set.of("Tadej Pogačar", "Joao Almeida"), teamsWithMembers.get("UAE TEAM EMIRATES"));
        assertEquals(Set.of("Jonas Vingegaard"), teamsWithMembers.get("TEAM VISMA | LEASE A BIKE"));
    }

    @Test
    public void testGetTeamMembers() {
        List<Cyclist> cyclists = List.of(
                new Cyclist("Tadej Pogačar", "UAE TEAM EMIRATES"),
                new Cyclist("Joao Almeida", "UAE TEAM EMIRATES")
        );

        Statistics stats = new Statistics(cyclists);
        Set<String> members = stats.getTeamMembers("UAE TEAM EMIRATES");

        assertEquals(2, members.size());
        assertTrue(members.contains("Tadej Pogačar"));
        assertTrue(members.contains("Joao Almeida"));
    }
}