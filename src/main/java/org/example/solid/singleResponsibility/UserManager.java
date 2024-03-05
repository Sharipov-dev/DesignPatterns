package org.example.solid.singleResponsibility;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    Map<Integer, String> users;
    public static int numberOfUsers = 0;

    public UserManager(){
        users = new HashMap<>();
    }
    public void addUser(String name){
        users.put(numberOfUsers,name);
        numberOfUsers++;
    }
    public boolean deleteById(int id){
        String foundUser = users.remove(id);
        if (foundUser == null) return false;
        return true;
    }

    public boolean updateById(int id, String name){
        if(!users.containsKey(id)) return false;
        else{
            users.put(id, name);
            return true;
        }
    }

}
