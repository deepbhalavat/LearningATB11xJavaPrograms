package Tasks;

public class Task03_Grade_Calculator {
    public static void main(String[] args) {
        String grade1 = args[0];
        System.out.println(grade1);

        int grade = Integer.parseInt(grade1);
        /*
        A: 90-100

B: 80-89

C: 70-79

D: 60-69

F: 0-59
         */
        String Grade_Result = (grade <= 59) ? "F" : (grade <= 69 ? "D" : (grade <= 79 ? "C" : (grade <= 89 ? "B" : (grade <= 100 ? "A" : "Grade should be between 0 to 100"))));
        System.out.println(Grade_Result);

    }
}
