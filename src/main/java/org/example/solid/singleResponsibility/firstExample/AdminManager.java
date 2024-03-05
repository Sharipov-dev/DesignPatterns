package org.example.solid.singleResponsibility.firstExample;

import java.util.HashMap;
import java.util.Map;

public class AdminManager {
    Map<Integer, String> admins;
    public static int numberOfUsers = 0;

    public AdminManager(){
       admins = new HashMap<>();
    }
    public void addUser(String name){
        admins.put(numberOfUsers,name);
        numberOfUsers++;
    }
    public boolean deleteById(int id){
        String foundUser = admins.remove(id);
        if (foundUser == null) return false;
        return true;
    }

    public boolean updateById(int id, String name){
        if(!admins.containsKey(id)) return false;
        else{
            admins.put(id, name);
            return true;
        }
    }
}
