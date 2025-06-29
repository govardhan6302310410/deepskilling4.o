package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    UserRepository repo; // mock

    @InjectMocks
    UserService service; // real object, with fake repo injected

    @Test
    void testGetUserName() {
        // Stub: when repo.findById(1) is called, return a fake user
        when(repo.findById(1)).thenReturn(new User(1, "Alice"));

        // Act
        String result = service.getUserName(1);

        // Assert
        assertEquals("Alice", result);
    }

    @Test
    void testUserNotFound() {
        when(repo.findById(99)).thenReturn(null);

        String result = service.getUserName(99);

        assertEquals("Unknown", result);
    }
}
