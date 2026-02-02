package com.example.LoginApp;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class LoginController {

        LoginService loginService;

        public LoginController(LoginService loginService) {
            this.loginService = loginService;
        }

        @PostMapping("/login")
        public Map<String , String> userLogin(@RequestBody Map<String, String> data){
            String username = data.get("username");
            String password = data.get("password");

            boolean result = loginService.validateUser(username,password);

            Map<String, String> response = new HashMap<String,String>();

            if(result==false) {
                response.put("Error", "INVALID USERNAME OR PASSWORD");
            }
            response.put("success", "LoginSuccessful");
            response.put("username", username);
            return response;
        }
    }
