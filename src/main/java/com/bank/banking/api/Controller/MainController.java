package com.bank.banking.api.Controller;
import jakarta.annotation.Resource;
import jakarta.inject.Inject;
import com.bank.banking.api.Model.User;
import com.bank.banking.api.Service.UserService;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

//    Field Injection

//    Match by Type
    @Autowired // @Resource // @Inject
    private UserService userService;

//    Match by Qualifier
    @Autowired // @Resource // @Inject
    @Qualifier("myUserService")
    private UserService myUserService;

//    Match by Name
    @Autowired // @Resource // @Inject
    private UserService UserServiceByName;

//    @RequestMapping("/user")
//    @ResponseBody
//    public User findById(){
//        return userService.findById();
//    }

//    @RequestMapping("/user")
//    @ResponseBody
//    public User findById(){
//        return myUserService.findById();
//    }

    @RequestMapping("/f/user")
    @ResponseBody
    public User findById(){
        return UserServiceByName.findById();
    }
}
