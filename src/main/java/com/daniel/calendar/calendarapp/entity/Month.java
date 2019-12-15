package com.daniel.calendar.calendarapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Month {

    @Id
    @GeneratedValue
    @Column(name = "month_id")
    private Long monthId;
    
    @Column
    private String description;

    @Column(name = "number_of_days")
    private Integer numberOfDays;

}