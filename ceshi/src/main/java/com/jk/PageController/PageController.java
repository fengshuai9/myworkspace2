package com.jk.PageController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("tomain")
    public String tomian(){

        System.out.println(111);
        
        System.out.println("这是我从远程仓库改的");

        return "main";
    }


}
