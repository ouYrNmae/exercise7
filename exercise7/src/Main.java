//Jocelin Martinez-Reyes | Exercise 7 | 2/25/25
import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<ContactInfo> phoneBook = new ArrayList<>();
    static ArrayList<BusinessContact> businessBook = new ArrayList<>();

    public static void main(String[] args) {
        int quit = 0;
        while (quit == 0) {
            System.out.println("Is this a Personal Contact (Use Y/y for yes and N/n for no)? [If no then it will be assumed it's a Business Contact]");
            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Name: ");
                String name = input.nextLine();
                System.out.println("Email: ");
                String email = input.nextLine();
                phoneBook.add(new ContactInfo(name, email));
                System.out.println("Person successfully added!");
                System.out.println("Would you like to add another Personal Contact? (Use Y/y for yes and N/n for no)");
                String answer = input.nextLine();
                if (answer.equalsIgnoreCase("N")) {
                    System.out.println("Goodbye. But WAITTTT! Would you like to add a Business Contact? (Y/y for yes, N/n for no)");
                    String result = input.nextLine();
                    if (result.equalsIgnoreCase("Y")) {
                        System.out.println("Name: ");
                        String businessName = input.nextLine();
                        System.out.println("Email: ");
                        String businessEmail = input.nextLine();
                        System.out.println("Phone Number: ");
                        String businessPhone = input.nextLine();
                        businessBook.add(new BusinessContact(businessName, businessEmail, businessPhone));
                        System.out.println("Business person successfully added!");
                    }
                    System.out.println("Would you like to add another Business Contact? (Use Y/y for yes and N/n for no)");
                    String option = input.nextLine();
                    if (option.equalsIgnoreCase("N")) {
                        quit = 1;
                    }
                }
            } else {
                System.out.println("Name: ");
                String businessName = input.nextLine();
                System.out.println("Email: ");
                String businessEmail = input.nextLine();
                System.out.println("Phone Number: ");
                String businessPhone = input.nextLine();
                businessBook.add(new BusinessContact(businessName, businessEmail, businessPhone));
                System.out.println("Business person successfully added!");
                System.out.println("Would you like to add another Business Contact? (Use Y/y for yes and N/n for no)");
                String option = input.nextLine();
                if (option.equalsIgnoreCase("N")) {
                    quit = 1;
                }
            }
        }
        for (ContactInfo contact : phoneBook) {
            contact.display();
        }

        for (BusinessContact contact : businessBook) {
            contact.display();
        }
    }
}
