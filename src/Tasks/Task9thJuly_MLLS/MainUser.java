package Tasks.Task9thJuly_MLLS;

public class MainUser {
    public static void main(String[] args) {
        SuperAdmin user1= new SuperAdmin();

        user1.shutdownSystem();
        user1.login();
        user1.accessAdminPanel();

    }


}
