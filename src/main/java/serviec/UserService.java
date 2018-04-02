package serviec;

import Model.UserEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserService {

  /*  public boolean login(String username ,String password);

    public void  showUser(String  username ,String password);*/


   public   Boolean getUserName(@RequestParam String userName);

    public Boolean addUser(@RequestBody UserEntity userInfo);


}
