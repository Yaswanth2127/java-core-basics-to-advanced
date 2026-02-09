package enums;

public class SimpleEnum {
    enum Status{
        Active,InActive,Blocked
    }
    enum Role{
        ADMIN(1),
        USER(2);

        private final int level;
        Role(int level){
            this.level=level;
        }
        public int getLevel(){
            return level;
        }
    }
    public static void main(String[] args) {
        //enum is a fixed set of constants
        Status s=Status.Active;
        switch(s){
            case Active-> System.out.println("User active");
            case InActive -> System.out.println("User is inactive");
            case Blocked -> System.out.println("User blocked");
            default -> System.out.println("nothing ");
        }
        Role r=Role.ADMIN;
        System.out.println(r.getLevel());
    }
}
