package com.projects.coronavirustracker.controller;

import com.projects.coronavirustracker.models.LocationStats;
import com.projects.coronavirustracker.service.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.annotation.WebServlet;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private CoronaVirusDataService coronaVirusDataService;


    @GetMapping("/coronavirus-tracker/")
    public String home(Model model){
        List<LocationStats> allStats=coronaVirusDataService.getAllStats();
        int totalReportedCases=allStats.stream().mapToInt(stat-> stat.getLatestTotalCases()).sum();
        int totalNewCases=allStats.stream().mapToInt(stat-> stat.getDiffFromPrevDay()).sum();
        model.addAttribute("totalReportedCases",totalReportedCases);
        model.addAttribute("locationStats",allStats);
        model.addAttribute("totalNewCases",totalNewCases);
        return "home";
    }
}
