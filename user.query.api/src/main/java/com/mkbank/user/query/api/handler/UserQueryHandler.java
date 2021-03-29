package com.mkbank.user.query.api.handler;

import com.mkbank.user.query.api.dto.UserLookupResponse;
import com.mkbank.user.query.api.query.FindAllUsersQuery;
import com.mkbank.user.query.api.query.FindUserByIdQuery;
import com.mkbank.user.query.api.query.SearchUsersQuery;

public interface UserQueryHandler {

    UserLookupResponse getUserById(FindUserByIdQuery query);

    UserLookupResponse searchUsers(SearchUsersQuery query);

    UserLookupResponse getAllUsers(FindAllUsersQuery query);
}
