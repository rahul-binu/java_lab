import java.util.Scanner;

// Interface Department
interface Department {
    void showData();
}

// Class Hostel
class Hostel {
    String hostelName;
    String hostelLocation;
    int noOfRooms;

    // Method to read data
    void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Hostel Name:");
        hostelName = scanner.nextLine();
        System.out.println("Enter Hostel Location:");
        hostelLocation = scanner.nextLine();
        System.out.println("Enter Number of Rooms:");
        noOfRooms = scanner.nextInt();
    }

    // Method to print data
    void printData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + noOfRooms);
    }
}

// Class Student extending Hostel and implementing Department
class Student extends Hostel implements Department {
    String studName;
    int regNo;
    String electiveSub;
    double avgMark;

    // Implementing the showData method from Department interface
    @Override
    public void showData() {
        System.out.println("Student Name: " + studName);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Elective Subject: " + electiveSub);
        System.out.println("Average Mark: " + avgMark);
    }

    // Method to read data
    void readData() {
        super.readData(); // Call readData method from the Hostel class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        studName = scanner.nextLine();
        System.out.println("Enter Registration Number:");
        regNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.println("Enter Elective Subject:");
        electiveSub = scanner.nextLine();
        System.out.println("Enter Average Mark:");
        avgMark = scanner.nextDouble();
    }

    // Method to print data
    void printData() {
        super.printData(); // Call printData method from the Hostel class
        showData(); // Call showData method from the Department interface
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object of Student class
        Student student = new Student();

        // Read data
        student.readData();

        // Print data
        student.printData();
    }
}
