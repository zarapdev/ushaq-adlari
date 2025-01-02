package DorduncuTap;

import java.util.Scanner;

public class Proqramm {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        EmailService service = new EmailService();
        System.out.println("Email qeyd edin" );
        String email = scanner.nextLine();

        System.out.println("Yashinizi qeyd edin");
        int age =scanner.nextInt();
        try {
            service.validateAge(age);
            service.validateEmail(email);
            System.out.println("Yaş və e-poçt ünvanı uğurla təsdiqləndi.");
        }catch (InvalidEmailException | AgeOutOfRangeException e) {
            System.out.println("Xeta" + e.getMessage());

        }

    }

    }


