package com.adarsh.service;

import com.adarsh.model.request.UserDTO;
import com.adarsh.model.response.UserVO;

public interface UserService {

    UserVO createUser(UserDTO userDTO);
}
