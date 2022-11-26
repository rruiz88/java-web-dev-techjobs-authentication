package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginFormDTO {

    @NotNull
    @NotBlank
    @Size(min = 5, max = 15, message = "Invalid username. Must be between 5 and 15 characters.")
    private String username;

    @NotBlank
    @NotNull
    @Size(min = 7, max = 15, message = "Invalid password. Must be between 7 and 15 characters.")
    public String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
