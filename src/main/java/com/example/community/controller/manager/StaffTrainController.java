package com.example.community.controller.manager;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.community.common.properties.FileProperties;
import com.example.community.common.util.FileUtil;
import com.example.community.common.vo.CommonVO;
import com.example.community.entity.StaffTrain;
import com.example.community.entity.TrainFile;
import com.example.community.service.IStaffTrainService;
import com.example.community.service.ITrainFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Properties;
@Controller
@RequestMapping("manager/staffTrain")
public class StaffTrainController {
    @Autowired
    private IStaffTrainService staffTrainService;
    @Autowired
    private ITrainFileService trainFileService;
    @Autowired
    private FileProperties fileProperties;
    @RequestMapping("upload")
    @ResponseBody
    public CommonVO fileUpload(@RequestParam("files") MultipartFile[] multipartFiles, String trainName, String trainContent) {
        return staffTrainService.saveTrainAndUpload(multipartFiles,trainName,trainContent);
    }
    @RequestMapping("download")
    public ResponseEntity<Object> fileDownload(@RequestParam("trainFileId") Integer trainFileId, HttpServletResponse response) {
        TrainFile trainFile = trainFileService.getById(trainFileId);
        if (trainFile == null) {
            return null;
        }
        File file = new File(trainFile.getFilePath());
        if (file.isFile()) {
            return FileUtil.download(fileProperties.getPath(),trainFile.getFilePath());
        }
        return null;
    }
    @GetMapping("all/{pageNo}/{pageSize}")
    @ResponseBody
    public Page<?> getAllStaffTrain(@PathVariable(value = "pageNo") Integer pageNo, @PathVariable(value = "pageSize") Integer pageSize) {
        Page<StaffTrain> paramPage = new Page<>(pageNo, pageSize);
        return staffTrainService.page(paramPage, null);
    }
    @GetMapping("{trainId}")
    @ResponseBody
    public CommonVO getStaffTrainDetail(@PathVariable Integer trainId) {
        return staffTrainService.getStaffTrainDetail(trainId);
    }
    @DeleteMapping("{trainId}")
    @ResponseBody
    public CommonVO deleteStaffTrain(@PathVariable Integer trainId) {
        return staffTrainService.deleteStaffTrain(trainId);
    }
}
