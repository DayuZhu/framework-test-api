package com.framework.api.controller;

import com.framework.api.commons.web.base.AbstractApiController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述:
 *
 * @className:ApiController
 * @projectName:framework-test-api
 * @author:Dayu
 * @date: 2021/5/26 17:33
 */

@RestController
@RequestMapping(value = "/api")
public class ApiController extends AbstractApiController {

//    @RequestMapping(value = "/api", method = { RequestMethod.GET, RequestMethod.POST })
//    @ResponseBody
//    protected ApiResponse api(HttpServletRequest request, HttpServletResponse response) {
//        return this.execute(request, response);
//    }
//
//    @RequestMapping(value = "/resource/upload", method = RequestMethod.POST)
//    @ResponseBody
//    public ApiResponse upfile(@RequestParam int spaceCode, @RequestParam("upfile") MultipartFile file) {
//        try {
//            if (!(spaceCode == NameSpace.SPACE_USER || spaceCode == NameSpace.SPACE_INVOICE
//                    || spaceCode == NameSpace.SPACE_HUMAN || spaceCode == NameSpace.SPACE_OTHER)) {
//                return new ApiResponse(-1, "参数spaceCode错误");
//            }
//            String space = NameSpace.createSpace(spaceCode);
//            String fileName = file.getOriginalFilename();
//            InputStream is = file.getInputStream();
//            String key = clientResourceService.create(space, fileName, is);
//            if (StringUtils.isBlank(key)) {
//                return new ApiResponse(-1, "上传失败");
//            }
//            String resourceUrl = PropertyConfig.getProperty("resource.remote");
//            Map<String, String> resMap = new HashMap<String, String>();
//            resMap.put("resourceUrl", resourceUrl + key);
//            resMap.put("resourceKey", key);
//            return new ApiResponse(RespCode.SUCCESS, resMap);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ApiResponse(-1, "上传失败");
//        }
//    }

}
