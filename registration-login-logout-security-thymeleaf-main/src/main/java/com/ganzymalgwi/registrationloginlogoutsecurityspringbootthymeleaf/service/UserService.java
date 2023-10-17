package com.ganzymalgwi.registrationloginlogoutsecurityspringbootthymeleaf.service;

import com.ganzymalgwi.registrationloginlogoutsecurityspringbootthymeleaf.model.User;
import com.ganzymalgwi.registrationloginlogoutsecurityspringbootthymeleaf.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService {
    User save(UserRegistrationDto registrationDta);

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
