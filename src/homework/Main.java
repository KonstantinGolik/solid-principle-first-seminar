package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        OperationsOnUser oou = new OperationsOnUser(user);
        oou.saveUser();
        oou.reportUser();
    }
}