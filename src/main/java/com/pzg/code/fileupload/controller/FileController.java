package com.pzg.code.fileupload.controller;

import com.pzg.code.fileupload.entity.ProcessFastFile;
import com.pzg.code.fileupload.utils.ResultInfo;
import com.pzg.code.fileupload.utils.WorkFlowUpload;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @ClassName :  FileController
 * @Author : PZG
 * @Date : 2019-06-21   10:01
 * @Description :
 */
@Api(tags = {"FileController"})
@RestController
@RequestMapping("/FileController")
public class FileController {
    @Autowired
    private WorkFlowUpload workFlowUpload;

    @ApiOperation(value = "单个多个文件上传接口", httpMethod = "POST", response = ResultInfo.class)
    @RequestMapping(value = "/upload", produces = {"application/json"}, method = RequestMethod.POST)
    public ResultInfo fileUpload(HttpServletRequest request) {
        try {
            Map<Integer, ProcessFastFile> integerProcessFastFileMap = workFlowUpload.workFlowUpload(request);
            return ResultInfo.success().build(integerProcessFastFileMap);
        } catch (Exception e) {
            e.printStackTrace();
            ResultInfo.failure(e.getMessage());
        }
        return null;
    }


}
