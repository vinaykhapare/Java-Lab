import java.util.Scanner;

class Person {
    String name;
    int day, month, year;
    float height;
    float weight;
    String address;

    // Method to take input from the user
    public void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        name = sc.nextLine();  // Changed to nextLine to handle full names

        System.out.println("Enter Birthdate: ");
        System.out.print("Day: ");
        day = sc.nextInt();
        System.out.print("Month: ");
        month = sc.nextInt();
        System.out.print("Year: ");
        year = sc.nextInt();

        System.out.println("Enter Your Height (in meters): ");
        height = sc.nextFloat();

        System.out.println("Enter Your Weight (in kg): ");
        weight = sc.nextFloat();

        sc.nextLine();  // Clear the buffer before reading address

        System.out.println("Enter Your Address: ");
        address = sc.nextLine();
    }

    // Method to calculate and print the person's age
    void calculateAge() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Current Year: ");
        int currentYear = sc.nextInt();

        int age = currentYear - year;
        System.out.println("Age is: " + age);

        sc.close();  // Close scanner after use
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.Input();
        p1.calculateAge();
    }
}
