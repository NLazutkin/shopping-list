import java.util.Scanner;
import java.util.ArrayList;

public class Shopping {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в приложение \"Список покупок\"");

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> shoppingList = new ArrayList<>(8);

        while (true) {
            System.out.println(" ");
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");
            System.out.println(" ");

            int actionNumber = scanner.nextInt();
            System.out.println(" ");

            if(actionNumber == 1) {
                    System.out.println("Введите название нового товара: ");
                    System.out.println("\t*Название должно быть написано без пробелов.*");
                    System.out.println("\t*Несколько слов нужно соединять символом подчёркивания.*");
                    System.out.println(" ");

                    String newProduct = scanner.next();

                    System.out.println(" ");
                    if(!shoppingList.contains(newProduct)) {
                        shoppingList.add(newProduct);
                        System.out.println("Товар " + shoppingList.getLast() + " добавлен в список под номером " + shoppingList.size());

                    } else {
                        System.out.println("Такой товар уже есть в списке.");
                    }

            } else if (actionNumber == 2) {
                if(!shoppingList.isEmpty()) {
                    System.out.println("Список покупок:");
                    for(int i = 0; i != shoppingList.size(); i++) {
                        System.out.println("\tТовар №" + (i+1) + " - " + shoppingList.get(i));
                    }
                } else {
                    System.out.println("Список покупок пуст! Начните делать ваши покупки!");
                }

            } else if (actionNumber == 3){
                if(!shoppingList.isEmpty()) {
                    shoppingList.clear();
                    System.out.println("Список покупок очищен!");
                } else {
                    System.out.println("Список покупок пуст! Начните делать ваши покупки!");
                }

            } else if (actionNumber == 4){
                System.out.println("Спасибо, что воспользовались нашим приложением!");
                break;

            } else {
                System.out.println("Неизвестная команда! Попробуйте ещё раз");
            }
        }


    }
}
