package exceptions;

import java.nio.file.attribute.UserPrincipalNotFoundException;

public class UserService {
    UserRepository userRepository;
    public UserService(){
        userRepository=new UserRepository();
    }
    public User getUserById(int id){
       User user=userRepository.findById(id);
       if(user==null){
           throw new UserNotFoundException("User is not found with id "+id);
       }
       return user;
    }
    public void addUser(User u){
        userRepository.addUser(u);
    }
}
