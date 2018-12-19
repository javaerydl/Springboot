package com.qujiali.springboot.web;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author YangDeLong
 * @date 2018/12/18 0018 16:40
 **/
@RestController()
@RequestMapping("/noPage")
public class HelloController {
    @ApiOperation(value = "前后端分离返回json实例",notes = "这个默认请求出来的为json不指定页面")
    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public Object helloWord(){
        String str="hello";
        return str;
    }
}
