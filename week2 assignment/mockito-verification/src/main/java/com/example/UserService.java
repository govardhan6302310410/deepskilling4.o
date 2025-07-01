public class UserService {

    private UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public void register(User user) {
        if (user != null) {
            repo.save(user);
        }
    }
}
