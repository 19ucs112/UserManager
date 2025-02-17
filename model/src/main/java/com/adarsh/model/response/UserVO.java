package com.adarsh.model.response;


import java.util.UUID;

public record UserVO(UUID id, String name, String email, String city) {
}