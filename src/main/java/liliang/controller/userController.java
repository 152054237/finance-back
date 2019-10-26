package liliang.controller;


import liliang.common.ServerResponse;
import liliang.pojo.User;
import liliang.service.userService;
import liliang.utils.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    userService userservice;

    //比如修改了一行
    @RequestMapping("/login.do")
    public ServerResponse login(String username,
                                String password,
                                HttpSession session){

        ServerResponse serverResponse=userservice.login(username,password);

        if (serverResponse.isSuccess()){
            session.setAttribute("user",username);
        }

        return serverResponse;

    }


}
