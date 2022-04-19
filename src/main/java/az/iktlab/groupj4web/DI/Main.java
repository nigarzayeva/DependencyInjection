package az.iktlab.groupj4web.DI;

public class Main {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        AdminRepository adminRepository = new AdminRepository();
        LoginService loginService = new LoginService(userRepository,adminRepository);
        LoginController loginController = new LoginController(loginService);

        loginController.reg();
    }
}
