package w1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
public class SecurityConfig {
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http//.requiresChannel(channel -> channel.anyRequest().requiresSecure())
				.authorizeHttpRequests(authorize -> authorize.anyRequest().permitAll())
				.build();
	}

//	@Bean
//	public UserDetailsService userDetailsService(PasswordEncoder encoder) { 
//		UserDetails admin = User.withUsername("test") 
//				.password(encoder.encode("test")) 
//				.roles("ADMIN") 
//				.build(); 
//		return new InMemoryUserDetailsManager(admin); 
//	} 
//
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception { 
//		return http.csrf().disable() 
//				.authorizeHttpRequests().requestMatchers("/admin").authenticated() 
//				.and().httpBasic() 
//				.and().build(); 
//	} 
//
//	@Bean
//	public PasswordEncoder passwordEncoder() { 
//		return new BCryptPasswordEncoder(); 
//	} 
//
}
