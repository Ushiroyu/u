package com.example.community.service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;
public interface IGoodsService extends IService<Goods> {
    CommonVO updateGoods(MultipartFile[] multipartFiles, Goods goods);
    CommonVO deleteGoods(Integer id);
    Page<Goods> getCommunityGoods(Boolean select, Page<Goods> page);
    Page<Goods> getUserCommunityGoods(Page<Goods> page);
}
