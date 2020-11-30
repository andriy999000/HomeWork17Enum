package com.company;

public class User {
    private String login;
    private String password;
    private String name;
    private EmployeePositions role = EmployeePositions.Anonymous;


    public User(String login, String password, String name, EmployeePositions role) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public EmployeePositions getRole() {
        return role;
    }

    public boolean Сheck(String login, String password){
        if(this.login.equals(login) && this.password.equals(password)){
            return true;
        }
        return false;
    }

}
