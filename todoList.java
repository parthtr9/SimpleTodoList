import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class todoList {
    private static ArrayList<String> todolist = new ArrayList<>();

    public static void main (String[] args){

        int switch_num = -1;
        while(switch_num != 4){
            switch_num = mainMenu();

            switch (switch_num){
                case 1:
                display();
                break;

                case 2:
                addItem();
                break;

                case 3:
                removeItem();
                break;

                case 4:
                break;

                default:
                System.out.println("invalid");
            }
        }

    }

    public static int mainMenu(){
        System.out.println("TODO LIST");
        System.out.println();
        System.out.println("1. Display ToDo List");
        System.out.println("2. Add item to ToDo List");
        System.out.println("3. Remove item from ToDo List");
        System.out.println("4. Exit ToDo List");
        System.out.println();
        System.out.println("Enter a Choice:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public static void display(){
        System.out.println();
        System.out.println("TODO List");
        System.out.println();
        int num = 1;
        for (String e: todolist){
            System.out.println(num++ + " " + e);
        }
        System.out.println();

    }

    public static void addItem(){
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        todolist.add(item);
        display();
    }

    public static void removeItem(){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Index of item you want to remove: ");
        int removeIndex = scanner.nextInt();
        if ((removeIndex - 1) < 0 || removeIndex > todolist.size()){
            System.out.println("Invalid index");
        } else {
            todolist.remove(removeIndex - 1);
            display();
        }
        
    }
}
