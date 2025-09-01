package com.task.TaskManagement.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Table(name = "UserTable")
@Entity
public class UserModel {

    @Id
    @NotBlank(message = "Username must be filled")
    @Size(min = 5, max = 20,message = "Username must between 5-20 characters")
    private String userName;

    @NotBlank(message = "Password must be filled")
    @Size(min = 6 , message = "Password must be atleast 6 character")
    private String password;

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Email must be in correct format")
    @NotBlank(message = "Email is required")
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public String toString()
    {
        return name+" "+userName+" "+email+" "+password;
    }
}
