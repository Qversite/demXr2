package com.example.proba123.Dt;


import com.example.proba123.Entity.Role;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class UsersDt {
    private Long id;
    private String username;
    private String password;
    private Set<Role> roles;

}
