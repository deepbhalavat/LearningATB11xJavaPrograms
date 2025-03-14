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
        String Grade_Result = (grade > 0) ? ((grade <= 59) ? ("F - "+grade) : (grade <= 69 ? ("D - "+grade) : (grade <= 79 ? ("C - "+grade) : (grade <= 89 ? ("B - "+grade) : (grade <= 100 ? ("A - "+grade) : "Grade should be between 0 to 100"))))) : ("Grade must be in Positive as entered value is " + grade);
        System.out.println(Grade_Result);

    }
}
