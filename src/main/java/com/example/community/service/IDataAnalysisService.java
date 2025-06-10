package com.example.community.service;

import com.example.community.common.vo.CommonVO;

/**
 * Author : zhangxiaojian
 * Date : 2021/4/26
 */
public interface IDataAnalysisService {
    CommonVO getStoreDayAnalysis(String storeId);

    CommonVO getStoreMonthAnalysis(String storeId);
}
