package com.destination.travel.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.destination.travel.domain.ScenicDetail;

public interface ScenicDetailMapper extends BaseMapper<ScenicDetail> {
    ScenicDetail getByScenicId(long scenicId);
}
