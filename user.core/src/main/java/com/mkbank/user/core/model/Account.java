package com.mkbank.user.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {

    @Size(min = 2, message = "Username must have minimum 2 characters!")
    private String userName;

    @Size(min = 7, message = "Password must have minimum 7 characters!")
    private String password;

    @NotNull(message = "Please specify at least 1 user role!")
    private List<Role> roles;

}
