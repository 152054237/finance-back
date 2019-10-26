package liliang.service;

import liliang.common.ServerResponse;

public interface userService {

    public ServerResponse login(String username, String password);
}
