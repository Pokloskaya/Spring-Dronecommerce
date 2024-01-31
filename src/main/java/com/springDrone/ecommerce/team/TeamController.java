package com.springDrone.ecommerce.team;

import com.springDrone.ecommerce.model.Team;
import com.springDrone.ecommerce.services.TeamService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.SortedSet;
import java.util.ArrayList;

@Controller
public class TeamController {
    
    private final TeamService service;
    
    public TeamController(TeamService service) {
        this.service = service;
    }
    
    @GetMapping("/teams")
    public String index(Model model) {
        List<String> teamNames = new ArrayList<>();
        SortedSet<Team> teams = service.getTeams();
        for (Team team : teams) {
            teamNames.add(team.getName());
        }
        model.addAttribute("teamNames", teamNames);
        
        return "teams/list";
    }
}


