package Model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserEntity implements Serializable {

    public  int id;

    private String userName;

    private String passWord;


}
