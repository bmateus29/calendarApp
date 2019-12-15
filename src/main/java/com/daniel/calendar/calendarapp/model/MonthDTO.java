package com.daniel.calendar.calendarapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonthDTO {

    private Long monthId;
    private String description;
    private Integer numberOfDays;

}