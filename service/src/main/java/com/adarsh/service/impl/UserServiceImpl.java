package com.adarsh.service.impl;

import com.adarsh.data.entity.UserEntity;
import com.adarsh.data.repository.UserRepository;
import com.adarsh.model.request.UserDTO;
import com.adarsh.model.response.UserVO;
import com.adarsh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserVO createUser(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userDTO.getName());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setCity(userDTO.getCity());
        userEntity = userRepository.save(userEntity);
        return new UserVO(userEntity.getId(), userEntity.getName(), userEntity.getEmail(), userEntity.getCity());
    }
}
