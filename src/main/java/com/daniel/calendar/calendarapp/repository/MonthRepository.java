package com.daniel.calendar.calendarapp.repository;

import com.daniel.calendar.calendarapp.entity.Month;

import org.springframework.data.repository.CrudRepository;

public interface MonthRepository extends CrudRepository<Month, Long>{
    
}