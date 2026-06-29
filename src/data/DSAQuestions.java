package data;

import model.Question;
import model.Quiz;

/**
 * Provides Data Structures and Algorithms quiz questions.
 */
public class DSAQuestions {

    public static Quiz getQuiz() {

        Quiz quiz = new Quiz("💻 Data Structures & Algorithms");

        quiz.addQuestion(new Question(
                1,
                "Which data structure follows the Last In First Out (LIFO) principle?",
                "Queue",
                "Stack",
                "Linked List",
                "Tree",
                'B',
                "DSA",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                2,
                "Which data structure follows the First In First Out (FIFO) principle?",
                "Stack",
                "Queue",
                "Heap",
                "Graph",
                'B',
                "DSA",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                3,
                "What is the average time complexity of Binary Search?",
                "O(n)",
                "O(log n)",
                "O(n²)",
                "O(1)",
                'B',
                "DSA",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                4,
                "Which data structure is primarily used to implement recursion?",
                "Queue",
                "Array",
                "Stack",
                "Graph",
                'C',
                "DSA",
                "Medium"
        ));

        quiz.addQuestion(new Question(
                5,
                "Which traversal visits the Root, Left, and Right nodes?",
                "Inorder",
                "Postorder",
                "Preorder",
                "Level Order",
                'C',
                "DSA",
                "Medium"
        ));

        quiz.addQuestion(new Question(
                6,
                "Which sorting algorithm has the best average-case time complexity?",
                "Bubble Sort",
                "Insertion Sort",
                "Merge Sort",
                "Selection Sort",
                'C',
                "DSA",
                "Medium"
        ));

        quiz.addQuestion(new Question(
                7,
                "Which data structure stores elements as key-value pairs?",
                "Stack",
                "Queue",
                "HashMap",
                "ArrayList",
                'C',
                "DSA",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                8,
                "What is the worst-case time complexity of Bubble Sort?",
                "O(log n)",
                "O(n)",
                "O(n log n)",
                "O(n²)",
                'D',
                "DSA",
                "Medium"
        ));

        quiz.addQuestion(new Question(
                9,
                "Which graph traversal algorithm uses a queue?",
                "Depth First Search",
                "Breadth First Search",
                "Binary Search",
                "Merge Search",
                'B',
                "DSA",
                "Hard"
        ));

        quiz.addQuestion(new Question(
                10,
                "Which data structure is best suited for implementing a priority queue?",
                "Array",
                "Linked List",
                "Heap",
                "Stack",
                'C',
                "DSA",
                "Hard"
        ));

        return quiz;
    }
}