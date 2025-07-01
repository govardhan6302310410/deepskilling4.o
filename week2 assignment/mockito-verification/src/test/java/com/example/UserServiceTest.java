

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    UserRepository repo;

    @InjectMocks
    UserService service;

    @Test
    void testRegisterCallsSave() {
        // Arrange
        User user = new User("Alice");

        // Act
        service.register(user);

        // Assert / Verify
        verify(repo).save(user); // ✅ check that save(user) was called once
    }

    @Test
    void testSaveNeverCalledWhenUserIsNull() {
        // Act
        service.register(null);

        // Verify
        verify(repo, never()).save(any()); // ✅ repo.save() should never be called
    }
}
