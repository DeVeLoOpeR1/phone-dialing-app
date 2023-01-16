import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Dialing.......");
        System.out.println("pls create 5 user ");
        List<mobileUser> userList = new ArrayList<mobileUser>();
        mobileUser user1 = new mobileUser(101);
        mobileUser user2 = new mobileUser(102);
        mobileUser user3 = new mobileUser(103);
        mobileUser user4 = new mobileUser(104);
        mobileUser user5 = new mobileUser(105);
        //added all the user to the userList
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        System.out.println(user1.calling(104,userList));
        System.out.println(user4.answering());
        System.out.println(user3.calling(200,userList));





    }
}