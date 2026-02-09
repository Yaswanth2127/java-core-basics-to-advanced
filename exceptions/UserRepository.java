package exceptions;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    List<User> users;
    public  UserRepository(){
        users=new ArrayList<>();
    }



    public User findById(int id){
        for(User u:users){
            if(u.getId()==id){
                return u;
            }
        }
        return null;
    }
    public void addUser(User u){
        users.add(u);

    }
}
