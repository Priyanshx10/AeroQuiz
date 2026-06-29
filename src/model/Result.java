package model;

/**
 * Represents the final quiz result.
 */
public class Result {

    private int correctAnswers;
    private int wrongAnswers;
    private int skippedQuestions;

    private double percentage;
    private String grade;

    public Result() {
    }

    public Result(int correctAnswers, int wrongAnswers, int skippedQuestions) {

        this.correctAnswers = correctAnswers;
        this.wrongAnswers = wrongAnswers;
        this.skippedQuestions = skippedQuestions;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public int getWrongAnswers() {
        return wrongAnswers;
    }

    public void setWrongAnswers(int wrongAnswers) {
        this.wrongAnswers = wrongAnswers;
    }

    public int getSkippedQuestions() {
        return skippedQuestions;
    }

    public void setSkippedQuestions(int skippedQuestions) {
        this.skippedQuestions = skippedQuestions;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getGrade() {
        return grade;
    }

    public void calculatePercentage(int totalQuestions) {

        if (totalQuestions == 0) {
            percentage = 0;
            return;
        }

        percentage = ((double) correctAnswers / totalQuestions) * 100;
    }

    public void calculateGrade() {

        if (percentage >= 90)
            grade = "A";
        else if (percentage >= 80)
            grade = "B";
        else if (percentage >= 70)
            grade = "C";
        else if (percentage >= 60)
            grade = "D";
        else
            grade = "F";
    }

    public void displayResult() {

        System.out.println("\n====================================");
        System.out.println("          QUIZ RESULT");
        System.out.println("====================================");

        System.out.println("Correct Answers : " + correctAnswers);
        System.out.println("Wrong Answers   : " + wrongAnswers);
        System.out.println("Skipped         : " + skippedQuestions);
        System.out.printf("Percentage      : %.2f%%\n", percentage);
        System.out.println("Grade           : " + grade);

        System.out.println("====================================");
    }
}