package com.example.comsumersecurity.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity (prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        System.out.println("configure");
//        http.formLogin()
//                .loginPage("/login")// 设置登录页面，未登录的用户将会被拦截到该页面
//                .failureForwardUrl("/fail")//验证失败时访问
//                .defaultSuccessUrl("/index").permitAll().and()// 验证成功时访问
//                .authorizeRequests()// 定义哪些URL需要被保护、哪些不需要被保护
//                .antMatchers("/login",// 设置所有人都可以访问登录页面，也可以不设置，反正被拦截了都是到这
//                        "/amchart/**",
//                        "/bootstrap/**",
//                        "/bootstrap-table/**",
//                        "/css/**",
//                        "/documentation/**",
//                        "/jquery-validation/**",
//                        "/fonts/**",
//                        "/layer/**",
//                        "/js/**",
//                        "/pages/**",
//                        "/plugins/**")
//                .permitAll()// 开放常用静态资源权限，这里的根路径为resources下的static
//                .anyRequest()// 任何请求,登录后可以访问
//
//                .authenticated()
//                .and()
//                .logout().permitAll();
//        http.csrf().disable();// 关闭csrf防护
//        http.logout().logoutSuccessUrl("/login");// 注销时访问
//
//    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/index","/page/**").hasRole("ADMIN").anyRequest().permitAll().and().httpBasic();

    }
}
