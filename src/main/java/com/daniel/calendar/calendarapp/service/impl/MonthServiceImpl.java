package com.daniel.calendar.calendarapp.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.daniel.calendar.calendarapp.entity.Month;
import com.daniel.calendar.calendarapp.model.MonthDTO;
import com.daniel.calendar.calendarapp.repository.MonthRepository;
import com.daniel.calendar.calendarapp.service.MonthService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonthServiceImpl implements MonthService {

    @Autowired
    private MonthRepository monthRepository;

    @Override
    public MonthDTO getMonthById(Long monthId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<MonthDTO> getAllMonths() {
        Iterable<Month> entityList = monthRepository.findAll();
        List<MonthDTO> months = new ArrayList<>();

        entityList.forEach(entity -> {
            MonthDTO dto = new MonthDTO();
            BeanUtils.copyProperties(entity, dto);
            months.add(dto);
        });

        return months;
    }

}
