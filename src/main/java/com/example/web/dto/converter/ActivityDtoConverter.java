package com.example.web.dto.converter;

import com.example.web.dto.ActivityDto;
import com.example.web.model.Activities;
import org.springframework.stereotype.Component;

@Component
public class ActivityDtoConverter {
    public ActivityDto convert(Activities from){
        return new ActivityDto(from.getName());
    }

}
