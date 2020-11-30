package com.company;

public class Store {
    private String name;
    private String URL;
    private User[] arrayUser;
    private User user;


    public boolean login(String login,String password){
        for (int i = 0; i < arrayUser.length; i++) {
            if(arrayUser[i].Сheck(login, password)){
                user = arrayUser[i];
                return true;
            }
        }

        return false;
    }

    public void getCurrentUserRights(){
        EmployeePositions value = user.getRole();
        switch (value) {
            case Director:
                System.out.println("Директор магазина, может управлять кадрами, и ценами");
                break;
            case Administrator:
                System.out.println("Администратор магазина, может добавлять товары и редактировать их описание");
                break;
            case Manager:
                System.out.println("Менеджер магазина, может общаться с клиентами ");
                break;

            case Client:
                System.out.println("Клиент магазина, может покупать товары и пользоваться дисконтом");
                break;
            case Anonymous:
                System.out.println("Анонимный пользователь, может покупать товары или авторизоваться");
        }


    }

    public void logout(){
        user = null;
        System.out.println("Пользователь вышел из системы");
    }

    public Store(String name, String URL, User[] arrayUser) {
        this.name = name;
        this.URL = URL;
        this.arrayUser = arrayUser;
    }
}
