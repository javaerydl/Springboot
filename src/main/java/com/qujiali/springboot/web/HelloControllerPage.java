package com.qujiali.springboot.web;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author YangDeLong
 * @date 2018/12/18 0018 16:40
 **/
@Controller
@RequestMapping("/page")
public class HelloControllerPage {

    /**
     * @Author YangDeLong
     * @Description:
     * @Date 16:57 2018/12/18 0018
     * @Param []
     * @return java.lang.Object
     * **/
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ApiOperation(value = "前后端不分离返回指定页面",notes = "返回指定页面")
    public Object pageHello(){
        String str="hello";
        return str;
    }
}
