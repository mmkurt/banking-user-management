package com.mkbank.user.query.api.dto;

import com.mkbank.user.core.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserLookupResponse {

    private List<User> users;

    public UserLookupResponse(User user) {
        this.users.add(user);
    }
}
