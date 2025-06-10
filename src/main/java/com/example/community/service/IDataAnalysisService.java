package com.example.community.service;
import com.example.community.common.vo.CommonVO;
public interface IDataAnalysisService {
    CommonVO getStoreDayAnalysis(String storeId);
    CommonVO getStoreMonthAnalysis(String storeId);
}
