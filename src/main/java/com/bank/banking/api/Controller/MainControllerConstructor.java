package com.bank.banking.api.Controller;
import com.bank.banking.api.Model.User;
import com.bank.banking.api.Service.UserService;
import jakarta.annotation.Resource;
import jakarta.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainControllerConstructor {

//    Constructor Injection

    private UserService userService;

    @Autowired//  @Resource // @Inject
    public MainControllerConstructor(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/c/user")
    @ResponseBody
    public User findById(){
        return userService.findById();
    }



}
