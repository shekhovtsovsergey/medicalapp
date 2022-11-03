package com.example.medicalapp.controller;

import com.example.medicalapp.entity.Logentries;
import com.example.medicalapp.service.LogentriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1/logentries")
public class LogentriesController {

    private final LogentriesService logentriesService;


/*    @GetMapping("/{userid}")
    public Logentries findByUserid(Model model, @PathVariable(name = "userid") String userid) {
        return logentriesService.findByUserid(userid);
    }*/

    @GetMapping("/{userid}")
    public ResponseEntity<? extends Logentries> getLogentries(@PathVariable("userid") String userid) {
        Logentries logentries = logentriesService.findByUserid(userid);
        return new ResponseEntity<>(logentries, HttpStatus.OK);
    }





}
