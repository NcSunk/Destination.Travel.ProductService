package com.destination.travel.api;

import com.destination.travel.dto.ApiResponse;
import com.destination.travel.dto.ScenicDetailDto;
import com.destination.travel.service.ScenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scenic")
public class ScenicController {
    @Autowired
    ScenicService scenicService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ApiResponse<ScenicDetailDto> getScenicDetail(@PathVariable("id") long id)
    {
        return scenicService.getScenicDetail(id);
    }
}
