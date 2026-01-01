package com.example.mapper;

import com.example.domain.User;
import com.example.model.UserCommand;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-11T10:52:37+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCommand userToCommand(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        userCommand.setFirstName( user.getFirstName() );
        userCommand.setLastName( user.getLastName() );
        userCommand.setEmail( user.getEmail() );

        return userCommand;
    }

    @Override
    public User userCommandToUser(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        User user = new User();

        user.setFirstName( userCommand.getFirstName() );
        user.setLastName( userCommand.getLastName() );
        user.setEmail( userCommand.getEmail() );

        return user;
    }
}
