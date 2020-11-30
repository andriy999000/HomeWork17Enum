package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	User user1 = new User("Иван54","иван544??!","Иван",EmployeePositions.Anonymous);
	User user2 = new User("Andriy","135qwer","Андрей",EmployeePositions.Administrator);
	User user3 = new User("Менеджер №4","12345670","Юля",EmployeePositions.Manager);
	User user4 = new User("vlad)))","324354647585","Влад",EmployeePositions.Client);
	User user5 = new User("Алексей","qaz123wsx456","Алексей",EmployeePositions.Director);

	Store store = new Store("Атб","atb.com",new User[]{user1,user2,user3,user4,user5});
	while (true){
        tryLogin(store);
    }


    }

    public static void tryLogin(Store store){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String  login = scanner.nextLine();
        System.out.println("Введите пароль");
        String  password = scanner.nextLine();
        if (store.login(login,password)){
            store.getCurrentUserRights();
            store.logout();
        }else {
            System.out.println("Неверный логин или пароль");
        }

    }
}
