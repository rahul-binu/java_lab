import java.util.Scanner;

class Test {
    static String name;

    public static void main(String Arg[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Youre Name");
        name = in.nextLine();
        System.out.println("Hello " + name);
    }
}