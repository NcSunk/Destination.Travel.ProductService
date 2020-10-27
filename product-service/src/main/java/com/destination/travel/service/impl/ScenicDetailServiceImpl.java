package com.destination.travel.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.destination.travel.domain.ScenicDetail;
import com.destination.travel.repository.ScenicDetailMapper;
import com.destination.travel.service.ScenicDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScenicDetailServiceImpl implements ScenicDetailService {
    @Autowired
    ScenicDetailMapper scenicDetailMapper;

    @Override
    public ScenicDetail getScenicDetailByScenicId(long scenicId) {
        ScenicDetail scenicDetail=scenicDetailMapper.selectOne(Wrappers.<ScenicDetail>lambdaQuery().eq(ScenicDetail::getScenicId,scenicId));
        return scenicDetail;
    }
}
