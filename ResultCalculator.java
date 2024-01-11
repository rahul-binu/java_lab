class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String message) {
        super(message);
    }
}

class StudentResult {
    private String name;
    private int seatNo;
    private String date;
    private int centerNumber;
    private int[] marks = new int[5];

    public StudentResult(String name, int seatNo, String date, int centerNumber, int[] marks) {
        this.name = name;
        this.seatNo = seatNo;
        this.date = date;
        this.centerNumber = centerNumber;
        this.marks = marks;
    }

    public void calculateResult() throws MarksOutOfBoundsException {
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new MarksOutOfBoundsException("Marks should be between 0 and 100 (inclusive).");
            }
        }

        // Calculate and display the result logic can be added here
        System.out.println("Result calculated successfully!");
    }
}

public class ResultCalculator {
    public static void main(String[] args) {
        int[] marks = { 85, 90, 78, 92, 88 }; 

        StudentResult studentResult = new StudentResult("John Doe", 123, "2022-01-01", 456, marks);

        try {
            studentResult.calculateResult();
        } catch (MarksOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
