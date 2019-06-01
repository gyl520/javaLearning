package com.gyl.wenxin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author guoyunlong
 * Date 2018/12/2
 * Time 14:12
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
public class WeiXin {
   @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloWeiXin(){
        return "welcom to 微信"  ;
    }
}
