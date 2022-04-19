package az.iktlab.groupj4web.DI;

public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    public void reg () {

    }
}
