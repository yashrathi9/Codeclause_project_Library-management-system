import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        char r;

        do {
            System.out.println("LibraryManagementSystem");
            System.out.println("Press 1 to add a book");
            System.out.println("Press 2 to issue a book");
            System.out.println("Press 3 to return a book");
            System.out.println("Press 4 to print complete issue details");
            System.out.println("Press 5 to exit");
            Scanner obj1 = new Scanner(System.in);
            System.out.println("Enter any Number:");
            int a = obj1.nextInt();
            switch (a) {
                case 1 -> {
                    Library aa = new Library();
                    aa.add();
                }
                case 2 -> {
                    Library bb = new Library();
                    bb.iss();
                }
                case 3 -> {
                    Library cc = new Library();
                    cc.ret();
                }
                case 4 -> {
                    Library dd = new Library();
                    dd.detail();
                }
                case 5 -> {
                    Library ee = new Library();
                    ee.exit();
                }
                default -> System.out.println("Invalid number");
            }
            System.out.println("Do you want to select the next option? (Y/N)");
            r = obj1.next().charAt(0);
        } while (r == 'y' || r == 'Y');

        if (r == 'n' || r == 'N') {
            Library z = new Library();
            z.exit();
        }
    }
}

class Library {
   static  String str, b, date;
   static int a, c;

    void add() {
        System.out.println("Enter book name, price, and book number:");
        Scanner obj2 = new Scanner(System.in);
        str = obj2.nextLine();
        float prize = obj2.nextFloat();
        int bookno = obj2.nextInt();
        System.out.println("Your details are: " + str + ", " + prize + ", " + bookno);
    }

    void iss() {
        Scanner obj3 = new Scanner(System.in);
        System.out.println("Book Name:");
        str = obj3.nextLine();
        System.out.println("Book ID:");
        a = obj3.nextInt();
        obj3.nextLine();
        System.out.println("Issue date:");
        b = obj3.nextLine();
        System.out.println("Total number of books issued:");
        c = obj3.nextInt();
        obj3.nextLine();
        System.out.println("Return book date:");
        date = obj3.nextLine();
    }

    void ret() {
        System.out.println("Enter Student name & book ID:");
        Scanner c = new Scanner(System.in);
        c.nextLine();
        int bookid = c.nextInt();
        if (a == bookid) {
            System.out.println("Total Details:");
            System.out.println("Book Name: " + Library.str);
            System.out.println("Book ID: " + Library.a);
            System.out.println("Issue Date: " + Library.b);
            System.out.println("Total number of books issued: " + Library.c);
            System.out.println("Book return date: " + Library.date);
        } else {
            System.out.println("Wrong ID entered. Please enter the correct ID.");
        }
    }

    void detail() {
        System.out.println("Total Details:");
        System.out.println("Book Name: " + Library.str);
        System.out.println("Book ID: " + Library.a);
        System.out.println("Issue Date: " + Library.b);
        System.out.println("Total number of books issued: " + Library.c);
        System.out.println("Book return date: " + Library.date);
    }

    void exit() {
        System.exit(0);
    }
}
