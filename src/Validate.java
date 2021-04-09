import java.util.List;
import java.util.Scanner;

public class Validate implements Vali{
    @Override
    public void add(List<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        float price = Float.parseFloat(sc.nextLine());
        System.out.print("Enter author: ");
        String author = sc.nextLine();

        Book s = new Book(name, price, author);
        list.add(s);
    }

    @Override
    public void display(List<Book> list) {
        for (Book o : list) {
            System.out.println(o);
        }
    }

    @Override
    public void remove(List<Book> list, int index) {
        for (int j = 0; j < list.size(); j++) {
            if (j == index) {
                list.remove(j);
                break;
            }
        }
    }

    @Override
    public void edit(List<Book> list, int index) {
        for (int j = 0; j < list.size(); j++) {
            if (j == index) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter name new: ");
                String name = sc.nextLine();
                System.out.print("Enter price new: ");
                float price = Float.parseFloat(sc.nextLine());
                System.out.print("Enter author new: ");
                String author = sc.nextLine();

                list.get(j).setName(name);
                list.get(j).setPrice(price);
                list.get(j).setAuthor(author);
                break;
            }
        }
    }
}
