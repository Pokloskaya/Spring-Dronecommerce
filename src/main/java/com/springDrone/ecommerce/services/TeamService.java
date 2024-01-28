package com.springDrone.ecommerce.services;

import com.springDrone.ecommerce.model.Team; //ESTO FALLA
import org.springframework.stereotype.Service;
import java.util.SortedSet;
import java.util.TreeSet;


@Service
public class TeamService {

    public SortedSet<Team> getTeams() {
        // Your logic to fetch teams
        // For demonstration purposes, let's create a sample set of teams
        SortedSet<Team> teams = new TreeSet<>();
        teams.add(new Team("Team A"));
        teams.add(new Team("Team B"));
        teams.add(new Team("Team C"));
        return teams;
    }
}
