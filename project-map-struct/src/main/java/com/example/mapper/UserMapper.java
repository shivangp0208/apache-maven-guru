package com.example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.domain.User;
import com.example.model.UserCommand;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToCommand(User user);

    User userCommandToUser(UserCommand userCommand);
}
