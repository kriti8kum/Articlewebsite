package com.article.jt.dao;

import com.article.jt.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfoRespository extends JpaRepository<UserInfo, Integer> {

    // select * from appuser where email='abc@mail.com'
    Optional<UserInfo> findByEmail(String email);
}
