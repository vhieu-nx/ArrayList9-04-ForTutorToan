import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vali v =  new Validate();
        Scanner sc = new Scanner(System.in);
        List<Book> list = new ArrayList<>();
        while (true) {
            int index = 0;
            int choice = 0;
            System.out.println("Book Manager");
            System.out.println("1- Add Book ");
            System.out.println("2- Display Book ");
            System.out.println("3- Remove Book ");
            System.out.println("4- Edit Book ");
            System.out.println("0- Exit ");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    v.add(list);
                    break;
                case 2:
                    v.display(list);
                    break;
                case 3:
                    System.out.print("Enter remove index: ");
                    index = Integer.parseInt(sc.nextLine());
                    v.remove(list, index);
                    break;
                case 4:
                    System.out.print("Enter edit index: ");
                    index = Integer.parseInt(sc.nextLine());
                    v.edit(list, index);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}

