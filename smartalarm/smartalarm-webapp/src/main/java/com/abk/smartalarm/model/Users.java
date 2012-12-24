package com.abk.smartalarm.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Users {

    private List<User> users;
    
    public Users(){
        
    }
    
    public Users(List<User> users) {
        this.users = users;
    }

    /**
     * @return the users
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(List<User> users) {
        this.users = users;
    }
}
