package com.example.bibliotekaservice;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component

public class UserDataStorage {
    private List<User> userList;
    public UserDataStorage(){
        this.userList = new ArrayList<>();
    }
    public void addUser(User user) {
        userList.add(user);
    }
    public List<User> getuserList() {
        return userList;
    }
    public void clearData() {
        userList.clear();
    }
}
