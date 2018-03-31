package impl;

import serviec.UserService;

public class UserServiceImpl  implements UserService{
    @Override
    public boolean login(String username, String password) {
        if("zoutianbao".equals(username))
            return true;
        return true;
    }

    @Override
    public void showUser(String username, String password) {

    }
}
