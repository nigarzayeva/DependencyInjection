package az.iktlab.groupj4web.DI;

public class LoginService {
    private final UserRepository userRepository;
    private final AdminRepository adminRepository;

    public LoginService(UserRepository userRepository, AdminRepository adminRepository) {
        this.userRepository = userRepository;
        this.adminRepository = adminRepository;
    }
}
