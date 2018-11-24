package com.cfs.edm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "hello world!";
    }


    @RequestMapping("/")
    public String home(ModelMap map){
        map.addAttribute("home","https://www.jianshu.com/u/ff5719bbf495");
        return "index";
    }
}
