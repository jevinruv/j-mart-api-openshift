package com.jevin.jmartapi.configuration;

import com.jevin.jmartapi.model.UserSignUp;
import com.jevin.jmartapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitDatabase implements CommandLineRunner {

    @Autowired
    UserService userService;

/*    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String isInit;*/

    public void init() {

        Set<String> adminRole = new HashSet<>();
        adminRole.add("admin");

        Set<String> userRole = new HashSet<>();
        userRole.add("user");

        Set<String> customerRole = new HashSet<>();
        customerRole.add("customer");

        UserSignUp admin = new UserSignUp("Jevin", "jevinruv", "jevinruv@gmail.com", adminRole, "qwerty");
        UserSignUp user = new UserSignUp("Tom", "tom", "tom@gmail.com", userRole, "qwerty");
        UserSignUp customer = new UserSignUp("Cus", "cus", "tom@gmail.com", customerRole, "qwerty");

        admin.setRole(adminRole);
        user.setRole(userRole);

        userService.createUser(admin);
        userService.createUser(user);
    }

    @Override
    public void run(String... args) {

        // if(!isInit.isEmpty()){
        init();
        // }
    }
}
