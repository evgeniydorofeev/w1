package w1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http
				.csrf(AbstractHttpConfigurer::disable)
//				.requiresChannel(channel -> channel.anyRequest().requiresSecure())
//				.authorizeHttpRequests(authorize -> authorize.requestMatchers("/").authenticated())
				.authorizeHttpRequests(authorize -> authorize.anyRequest().permitAll()  )
//				.httpBasic().and()
//				formLogin(form -> form.loginPage("/login").and()
//				.formLogin(withDefaults())
//				.formLogin().and()
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
	
	@Bean 
	public PasswordEncoder passwordEncoder() { 
	    return new BCryptPasswordEncoder(); 
	}
}
