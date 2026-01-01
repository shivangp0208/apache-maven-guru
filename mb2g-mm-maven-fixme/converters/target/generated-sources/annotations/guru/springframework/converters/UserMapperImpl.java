package guru.springframework.converters;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-11T10:52:35+0530",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
*/
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCommand userToUserCommand(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        return userCommand;
    }

    @Override
    public User userCommandToUser(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        User user = new User();

        return user;
    }
}
