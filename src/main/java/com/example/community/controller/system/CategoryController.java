package com.example.community.controller.system;
import com.example.community.entity.Category;
import com.example.community.service.ICategoryService;
import com.example.community.common.vo.CommonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("admin")
@CrossOrigin
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;
    @RequestMapping("categoryAll")
    public List<Category> getCategoryAll(){
        return categoryService.list();
    }
    @RequestMapping("categoryTree")
    public CommonVO getCategoryTree(){
        List<Category> list = categoryService.getCategoryTree();
        return new CommonVO(true,list);
    }
    @PostMapping("category")
    public CommonVO addCategory(@RequestBody Category category){
        boolean save = categoryService.save(category);
        return new CommonVO(save,save?"保存成功":"保存失败");
    }
}
