package com.example.springsecurityex.securityconfig;

import com.example.springsecurityex.dto.trasformer.RecruiterTrasformer;
import com.example.springsecurityex.repository.RecruiterRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service @NoArgsConstructor
public class AuthenticationUserConfig implements UserDetailsService {

    @Autowired
    RecruiterRepository recruiterRepository;

    @Autowired
    RecruiterTrasformer recruiterTrasformer;


    private PasswordEncoder passwordEncoder;


    @Autowired
    public AuthenticationUserConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String emailAziendale) throws UsernameNotFoundException {
        return recruiterTrasformer.applicationUserDTO(recruiterRepository.findByEmailAziendale(emailAziendale),passwordEncoder);
    }
}
