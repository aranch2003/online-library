package backend.controller;

import backend.model.User;
import backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")  // Allows frontend requests
public class UserController {

    private final UserService userService;

    @Autowired  // Optional when using constructor injection in newer Spring versions
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // ✅ Single, final register endpoint
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        System.out.println("🔥 REGISTER endpoint hit with user: " + user.getEmail());
        if (userService.checkUserExists(user.getEmail())) {
            return ResponseEntity.badRequest().body("User already exists with this email.");
        }
        User newUser = userService.registerUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

    @GetMapping("/check")
    public ResponseEntity<?> checkUser(@RequestParam String email) {
        boolean exists = userService.checkUserExists(email);
        return ResponseEntity.ok(exists);
    }
    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from backend!");
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        Optional<User> user = userService.findUserById(id);
        return user.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
