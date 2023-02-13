package security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author LiGuanda
 * @date 2023/2/13 上午 8:01:23
 * @description no description right now...
 * @filename MyConfiguration.java
 */

@Configuration
public class MyConfiguration {


    @Bean
    public InMemoryUserDetailsManager userDetailsService() {

        UserDetails user = User.withDefaultPasswordEncoder()
                .username("Dage")
                .password("123456")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);

    }


}
