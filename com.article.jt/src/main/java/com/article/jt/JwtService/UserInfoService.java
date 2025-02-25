package com.article.jt.JwtService;

import com.article.jt.dao.UserInfoRespository;
import com.article.jt.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserInfoService implements UserDetailsService {

    @Autowired
    private UserInfoRespository repository; // Fixed spelling mistake

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserInfo> userDetails = repository.findByEmail(username);
        // Fixed: Using 'username' directly

        return userDetails.map(UserInfoDetails::new) // Using UserInfoDetails constructor
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
    }
}
