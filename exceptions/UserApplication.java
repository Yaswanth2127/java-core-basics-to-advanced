package exceptions;

import java.util.Scanner;

public class UserApplication {
    public static void main(String[] args) {
        //Scanner class initiation
        Scanner sc=new Scanner(System.in);

        User u1=new User(1,"Yaswanth");
        User u2=new User(2,"Lahari");
        User u3=new User(3,"Yashri");
        UserService us=new UserService();
        us.addUser(u1);
        us.addUser(u2);
        us.addUser(u3);

        try{
            System.out.print("Enter id number :");
            int id=sc.nextInt();
            sc.close();

            System.out.println(us.getUserById(id));
        }catch (UserNotFoundException unf){
            System.out.println(unf.getMessage());
        }

    }
}
