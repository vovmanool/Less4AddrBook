package com.vovs;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import com.vovs.IUser;



public class Main {
    private static ArrayList arrUsers = new ArrayList();
    public static IUser theUser;
    private final static String menu =
            "\n\nДля работы с приложение выберите один из пунктов меню\n\n" +
                    "Меню:\n" +
                    "1: Добавить контакт\n" +
                    "2: Просмотреть контакты\n" +
                    "3: Редактировать контакт\n" +
                    "4: Удалить контакт\n" +
                    "0: Выход\n" +
                    "Введите пункт меню - ";

    public static void addUnit(){
        Scanner scanner = new Scanner(System.in);
        boolean b1=false;
        IUser cUser=new IUser();
        while (!b1) {
            // валидируем и добавляем имя
            System.out.println("Введите Имя нового пользователя");
            b1=cUser.setName(scanner.nextLine());
            if (!b1) { System.out.println("Длинна имени меньше 5 букв. Повторите ввод");}
        }
        b1=false;
        while (!b1) {
            // валидируеми добавляем майл
            System.out.println("Введите Email нового пользователя");
            b1=cUser.setEmail(scanner.nextLine());
            if (!b1) { System.out.println("Длинна адреса меньше 6 букв или '@' '.' ' '.   Повторите ввод");}
        }
        arrUsers.add(cUser);

    }
    public static void outputUser(){
        System.out.println("Список контактов");
        for (int i = 0; i < arrUsers.size(); i++) {
            theUser=(IUser)arrUsers.get(i);
            System.out.println(i+" "+theUser.getName()+" "+theUser.getEmail());

        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println(menu);
            int menuId = scanner.nextInt();

            switch (menuId) {
                case 1:
                    addUnit();
                    break;
                case 2:
                    outputUser();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Досвидос!");
                    return;

            }

        }
    }
}
