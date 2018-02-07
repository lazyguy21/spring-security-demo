package newbie.yyf.springsecuritydemo.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class SimpleUserDetailsService implements UserDetailsService {
  @Override
  public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
    UserDetails user = User.builder().username(username).password("123").authorities("ROLE_A").build();

    return user;
  }
}
