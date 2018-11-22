package com.prototipo.vacinacaoweb.config;

import com.prototipo.vacinacaoweb.services.UsuarioDetalhesServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableConfigurationProperties
public class SegurancaConfiguracao extends WebSecurityConfigurerAdapter {
    @Autowired
    UsuarioDetalhesServico usuario;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage("/login.html")
                    .loginProcessingUrl("/login.html")
                        .usernameParameter("nomeUsuario")
                        .passwordParameter("senhaUsuario")
                    .permitAll()
                    .failureUrl("/login-erro.html")
                    .and()
                .logout()
                    .logoutSuccessUrl("/index.html");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public void configure(AuthenticationManagerBuilder builder) throws Exception {
        builder.userDetailsService(usuario);
    }

}
