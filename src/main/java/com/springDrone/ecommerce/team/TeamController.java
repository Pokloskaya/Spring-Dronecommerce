package com.springDrone.ecommerce.team;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

// @Controller
// @RequestMapping("/teams")
// public class TeamController {

//     @GetMapping
//     public String index(Model model) {
//         return "teams/list";
//     }
// }

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.SortedSet;

@Controller
public class TeamController {
    
    // private final TeamService service;
    
    // public TeamController(TeamService service) {
    //     this.service = service;
    // }
    
    @GetMapping("/all")
    public String index(Model model) {
        // SortedSet<Team> teams = service.getTeams();
        // model.addAttribute("teams", teams);
        return "teams/list";
    }
}


