package com.md.frame.controller;

import com.alibaba.fastjson.JSON;
import com.md.frame.BaseController;
import com.md.frame.entity.MUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @类名: ${CLASS_NAME}
 * @包名: com.md.frame.controller
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @日期: 2017/12/25 16:23
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 */
@Controller
@RequestMapping("/test")
public class UserController extends BaseController{

    @ResponseBody
    @RequestMapping("/indexcc")
    public String index(){
        MUser user = userService.findUser();
        String json = JSON.toJSONString(user);
        return json;
    }
}
