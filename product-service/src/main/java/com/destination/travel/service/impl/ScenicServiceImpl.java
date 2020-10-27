package com.destination.travel.service.impl;

import com.destination.travel.domain.Scenic;
import com.destination.travel.domain.ScenicDetail;
import com.destination.travel.dto.ApiResponse;
import com.destination.travel.dto.ScenicDetailDto;
import com.destination.travel.enums.DataStatusEnum;
import com.destination.travel.repository.ScenicMapper;
import com.destination.travel.service.ScenicDetailService;
import com.destination.travel.service.ScenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScenicServiceImpl implements ScenicService {

    @Autowired
    ScenicMapper scenicMapper;
    @Autowired
    ScenicDetailService scenicDetailService;

    @Override
    public ApiResponse<ScenicDetailDto> getScenicDetail(long id) {
        ApiResponse<ScenicDetailDto> response=new ApiResponse<>();
        Scenic scenic= scenicMapper.selectById(id);
        if(scenic==null||scenic.getStatus()== DataStatusEnum.Disabled)
        {
            response.setMessage("景区不存在或者已下架");
            response.setSuccess(false);
            return response;
        }
        ScenicDetail scenicDetail=scenicDetailService.getScenicDetailByScenicId(id);
        if(scenicDetail==null)
        {
            return response;
        }
        response.setData(convert(scenic,scenicDetail));
        return response;
    }

    private ScenicDetailDto convert(Scenic scenic,ScenicDetail scenicDetail)
    {
        ScenicDetailDto dto=new ScenicDetailDto();
        dto.setId(scenic.getId());
        dto.setName(scenic.getName());
        dto.setBestTime(scenicDetail.getBestTime());
        dto.setDurationAdvise(scenicDetail.getDurationAdvise());
        dto.setAddress(scenic.getAddress());
        dto.setDescription(scenicDetail.getDescription());
        dto.setBookNotice(scenicDetail.getBookNotice());
        dto.setContactPhone(scenicDetail.getContactPhone());
        dto.setPlayTips(scenicDetail.getPlayTips());
        dto.setTips(scenicDetail.getTips());
        dto.setGrade(scenicDetail.getGrade());
        return dto;
    }
}
