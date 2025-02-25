package com.article.jt.filter;

import com.article.jt.JwtService.JwtService;
import com.article.jt.JwtService.UserInfoService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JwtAuthFilter extends OncePerRequestFilter {

    private final List<String> allowedEndPoints = Arrays.asList("/appuser/addNewAppuser", "/appuser/login", "/article/getAllPublishedArticle");

    @Autowired
    JwtService jwtService;

    @Autowired
    UserInfoService userDetailsService;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

    }
}
