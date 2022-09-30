package com.example.springsecurityex.dto.trasformer;

import com.example.springsecurityex.dto.ApplicationUserDTO;
import com.example.springsecurityex.model.Recruiter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class RecruiterTrasformer {

    public RecruiterTrasformer(){

    }


    public ApplicationUserDTO applicationUserDTO(Recruiter recruiter,PasswordEncoder passwordEncoder){
        return new ApplicationUserDTO(roleToGrantAuthority(recruiter.getRole())
                , passwordEncoder.encode(recruiter.getPassword()), recruiter.getEmailAziendale()
                ,true
                ,true
                ,true
                ,true
        );
    }

    public Set<? extends GrantedAuthority> roleToGrantAuthority(String role){
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
        return authorities;
    }
}
