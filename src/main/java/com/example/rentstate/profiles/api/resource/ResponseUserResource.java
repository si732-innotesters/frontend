package com.example.rentstate.profiles.api.resource;

import com.example.rentstate.profiles.domain.model.aggregates.User;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class ResponseUserResource {
    private Long id;
    private String name;
    private String lastName;
    private Integer age;
    private String gender;
    private String description;
    private Boolean isPremium;

    public ResponseUserResource(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.lastName = user.getLastName();
        this.age = user.getAge();
        this.gender = user.getGender();
        this.description = user.getDescription();
        this.isPremium = user.getIsPremium();
    }
}
