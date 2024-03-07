In Spring, Inversion of Control (IoC) is a design principle where the control of object creation and management is shifted from the application code to the Spring container. The core of this principle is the Dependency Injection (DI) pattern, where objects are provided with their dependencies instead of creating them internally. 

Here's a simplified explanation of Spring IoC with an example in Spring Boot 3:

1. **IoC Container**: Spring IoC Container is responsible for managing the lifecycle of objects and their dependencies. In Spring Boot, this is achieved through annotations such as `@Component`, `@Service`, `@Repository`, and `@Controller`.

2. **Dependency Injection (DI)**: Spring container injects the dependencies of a bean at runtime. There are several ways to achieve DI in Spring Boot, including Constructor Injection, Setter Injection, and Field Injection.

Example:

Let's say we have a simple application with a `UserService` that depends on a `UserRepository` to fetch user data from a database.

```java
// UserRepository.java
@Repository
public class UserRepository {
    public List<User> getUsers() {
        // Implementation to fetch users from the database
    }
}

// UserService.java
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.getUsers();
    }
}

// UserController.java
@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
```

In this example:

- `UserRepository` and `UserService` are annotated with `@Repository` and `@Service` respectively, indicating that they are managed by the Spring container.
- `UserService` has a dependency on `UserRepository`, which is injected through its constructor.
- Similarly, `UserController` has a dependency on `UserService`, which is also injected through its constructor.
- Spring Boot automatically manages the lifecycle of these components and resolves their dependencies.

By using Spring IoC and Dependency Injection, the application code remains loosely coupled and easier to maintain, as the responsibility of managing dependencies is delegated to the Spring container.