package com.vovs;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.util.Scanner;



public class Main {
    private final static String menu =
            "\n\nДля работы с приложение выберите один из пунктов меню\n\n" +
                    "Меню:\n" +
                    "1: Добавить контакт\n" +
                    "2: Просмотреть контакты\n" +
                    "3: Редактировать контакт\n" +
                    "4: Удалить контакт\n" +
                    "0: Выход\n" +
                    "Введите пункт меню - ";

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println(menu);
            int menuId = scanner.nextInt();

            switch (menuId) {
                case 1:
                    break;
                case 2:
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
