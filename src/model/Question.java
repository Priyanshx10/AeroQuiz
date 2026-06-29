package model;

/**
 * Represents a single quiz question.
 */
public class Question {

    // ===========================
    // Fields
    // ===========================
    private int id;
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private char correctAnswer;
    private String category;
    private String difficulty;

    // ===========================
    // Default Constructor
    // ===========================
    public Question() {
    }

    // ===========================
    // Parameterized Constructor
    // ===========================
    public Question(int id, String question,
                    String optionA,
                    String optionB,
                    String optionC,
                    String optionD,
                    char correctAnswer,
                    String category,
                    String difficulty) {

        this.id = id;
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = Character.toUpperCase(correctAnswer);
        this.category = category;
        this.difficulty = difficulty;
    }

    // ===========================
    // Getters & Setters
    // ===========================

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(char correctAnswer) {
        this.correctAnswer = Character.toUpperCase(correctAnswer);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    // ===========================
    // Methods
    // ===========================

    public void displayQuestion() {

        System.out.println("\n----------------------------------------");
        System.out.println("Question " + id);
        System.out.println("Category   : " + category);
        System.out.println("Difficulty : " + difficulty);
        System.out.println("----------------------------------------");

        System.out.println(question);

        System.out.println("A. " + optionA);
        System.out.println("B. " + optionB);
        System.out.println("C. " + optionC);
        System.out.println("D. " + optionD);
    }

    public boolean isCorrect(char answer) {
        return Character.toUpperCase(answer) == correctAnswer;
    }

    @Override
    public String toString() {

        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", category='" + category + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", correctAnswer=" + correctAnswer +
                '}';
    }
}