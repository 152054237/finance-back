package liliang.service.impl;

import liliang.common.ResponseCode;
import liliang.common.ServerResponse;
import liliang.dao.UserMapper;
import liliang.pojo.User;
import liliang.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerResponse login(String username, String password) {

        if (username==null||username.equals("")){
            return ServerResponse.serverResponseByError(ResponseCode.ERROR,"用户名不能为空");
        }
        if (password==null||password.equals("")){
            return ServerResponse.serverResponseByError(ResponseCode.ERROR,"密码不能为空");
        }

        int result=userMapper.judgeusername(username);
        if (result<=0){
            return ServerResponse.serverResponseByError(ResponseCode.ERROR,"用户名不存在");
        }

        User user=userMapper.finduser(username,password);
        if (user==null) {
            return ServerResponse.serverResponseByError(ResponseCode.ERROR, "密码错误");
        }

        return ServerResponse.serverResponseBySuccess();
    }
}
