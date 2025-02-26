package org.example.expert.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.expert.domain.common.exception.InvalidRequestException;
import org.springframework.web.servlet.HandlerInterceptor;

public class AuthorityIntercepLogic implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(false);

        if (session == null) {
            throw new InvalidRequestException("유효하지 않은 UerRole");
        }

        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
