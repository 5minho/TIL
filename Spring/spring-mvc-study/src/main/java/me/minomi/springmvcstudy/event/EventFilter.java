package me.minomi.springmvcstudy.event;

import javax.servlet.*;
import java.io.IOException;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2019-02-12.
 */

public class EventFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter Before");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Filter After");
    }
}
