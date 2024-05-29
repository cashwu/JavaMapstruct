package com.cashwu.javamapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author cash.wu
 * @since 2024/05/29
 */
@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "firstName",
             target = "first")
    @Mapping(source = "lastName",
             target = "last")
    UserDto userToUserDto(User user);

    @Mapping(source = "first",
             target = "firstName")
    @Mapping(source = "last",
             target = "lastName")
    User userDtoToUser(UserDto userDto);
}
