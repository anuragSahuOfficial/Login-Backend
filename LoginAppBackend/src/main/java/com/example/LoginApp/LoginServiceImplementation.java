package com.example.LoginApp;

import org.springframework.stereotype.Component;

@Component
public class LoginServiceImplementation implements LoginService{
        LoginRepository loginRepository;

        public LoginServiceImplementation(LoginRepository loginRepository) {
            super();
            this.loginRepository = loginRepository;
        }

        @Override
        public boolean validateUser(String username, String password) {
            User user = loginRepository.findByUsername(username);

            if (user == null) {
                return false;
            } else {
                if (user.password.equals(password)) {
                    return true;
                }
                return false;
            }
        }
    }
