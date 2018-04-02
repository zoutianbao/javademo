package serviec;

import Model.UserEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class UserServiceImp implements  UserService {


    @Override
    public   Boolean getUserName(@RequestParam String userName)
    {
        return  true;
    }

    @Override
    public Boolean addUser(@RequestBody UserEntity userInfo)
    {
        return  true;
    }
}
