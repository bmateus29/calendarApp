package com.daniel.calendar.calendarapp.controller;

import java.util.ArrayList;
import java.util.List;

import com.daniel.calendar.calendarapp.model.MonthDTO;
import com.daniel.calendar.calendarapp.service.MonthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController()
@RequestMapping(value = "/month")
@Slf4j
public class MonthController {

    @Autowired
    private MonthService monthService;

    @GetMapping
    public List<MonthDTO> getAllMonths() {
        //TODO this is just mock data
        log.debug("called getAllMonth in MonthController");
        return new ArrayList<MonthDTO>();
    }

}