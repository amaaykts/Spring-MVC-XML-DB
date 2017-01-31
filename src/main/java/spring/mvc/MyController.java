package spring.mvc;

import dao.SimpleDBAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    SimpleDBAccess simpleDBAccess;

    @Autowired
    public MyController(SimpleDBAccess simpleDBAccess) {
        this.simpleDBAccess = simpleDBAccess;
    }

    @RequestMapping("/hello")
    private String hello(){
        return "hello";
    }

    @RequestMapping
    private String other(ModelMap modelMap){
        modelMap.addAttribute("text", simpleDBAccess.getVersion());

        return "other";
    }
}
