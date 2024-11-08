package w1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http
				 .csrf().disable()
//				.requiresChannel(channel -> channel.anyRequest().requiresSecure())
//				.authorizeHttpRequests(authorize -> authorize.requestMatchers("/t1").authenticated())
				.authorizeHttpRequests(authorize -> authorize.anyRequest().permitAll())
				.httpBasic().and()
				.build();
	}

	@Bean
	public UserDetailsService userDetailsService() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		UserDetails admin = User.withUsername("test") 
 				.password(encoder.encode("test"))
				.roles("ADMIN") 
				.build(); 
		return new InMemoryUserDetailsManager(admin); 
	} 

}
