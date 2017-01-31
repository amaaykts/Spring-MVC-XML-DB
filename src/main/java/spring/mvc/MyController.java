package spring.mvc;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.UserService;

import java.util.List;
import java.util.Random;

@Controller
public class MyController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    private String hello(){
        return "hello";
    }

    @RequestMapping
    private String other(ModelMap modelMap){
        User user = generatedUser();
        userService.add(user);
        List<User> users = userService.list();
        for (User u:users) {
            System.out.println(u.getName() + " " + u.getOld());
        }
//        modelMap.addAttribute("list", simpleDBAccess.getVersion());

        return "other";
    }

    private User generatedUser() {
        Random random = new Random();
        User user = new User();
        user.setName("Artem - " + random.nextInt(15));
        user.setOld(random.nextInt(30));
        return user;
    }

}
