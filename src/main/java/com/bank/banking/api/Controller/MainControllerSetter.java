package com.bank.banking.api.Controller;
import com.bank.banking.api.Model.User;
import com.bank.banking.api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainControllerSetter {

//    Setter Injection

    private UserService userService;

    @Autowired//  @Resource // @Inject
    public void SetUserService(UserService userService)
    {
        this.userService = userService;
    }

    @RequestMapping("/c/user")
    @ResponseBody
    public User findById(){
        return userService.findById();
    }



}
