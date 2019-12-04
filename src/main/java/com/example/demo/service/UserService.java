package com.example.demo.service;

        import com.example.demo.entity.User;
        import com.example.demo.repository.RoleRepository;
        import com.example.demo.repository.UserRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.security.core.userdetails.UserDetails;
        import org.springframework.security.core.userdetails.UserDetailsService;
        import org.springframework.security.core.userdetails.UsernameNotFoundException;
        import org.springframework.stereotype.Service;
        import org.springframework.transaction.annotation.Transactional;

/**
 * User: twodogegg
 * DATE: 2019-12-02 18:11
 */
@Service
public class UserService implements UserDetailsService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDetails user =  userRepository.findByUsername(s);
        return user;
    }
}
