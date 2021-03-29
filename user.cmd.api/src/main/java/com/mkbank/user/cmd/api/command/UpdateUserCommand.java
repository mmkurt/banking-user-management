package com.mkbank.user.cmd.api.command;

import com.mkbank.user.core.model.User;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@Builder
public class UpdateUserCommand {

    @TargetAggregateIdentifier
    private String id;

    @NotNull(message = "No user was provided!")
    @Valid
    private User user;

}
