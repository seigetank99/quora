package com.billy.UniQuery.component;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈〉
 *
 * @author Billy Yan
 * @create 3/17/2020
 * @since 1.0.0
 */
public class Interceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object currentUser = request.getSession().getAttribute("currentUser");
        if (currentUser != null) {
            return true;
        } else {
            request.getRequestDispatcher("/login.html");
            return false;
        }
    }
}
