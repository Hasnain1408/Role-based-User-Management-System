// UserResponseDto.java
package com.example.usermanagement.infrastructure.controller.dto;

import java.util.Set;
import java.util.UUID;

public class UserResponseDto {
    private UUID id;
    private String name;
    private String email;
    private Set<RoleResponseDto> roles;

    public UserResponseDto() {
    }

    public UserResponseDto(UUID id, String name, String email, Set<RoleResponseDto> roles) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.roles = roles;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<RoleResponseDto> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleResponseDto> roles) {
        this.roles = roles;
    }
}
