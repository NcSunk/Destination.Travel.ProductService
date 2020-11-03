package com.destination.travel.product.client;

import com.destination.travel.basic.dto.CityDto;
import com.destination.travel.basic.dto.ScenicDto;
import com.destination.travel.common.dto.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("basic-service")
public interface BasicServiceClient {
    @RequestMapping(value = "/city/{id}",method = RequestMethod.GET)
    ApiResponse<CityDto> getCity(@PathVariable("id") long id);

    @RequestMapping(value = "/scenic/{id}",method = RequestMethod.GET)
    ApiResponse<ScenicDto> getScenic(@PathVariable("id") long id);
}
