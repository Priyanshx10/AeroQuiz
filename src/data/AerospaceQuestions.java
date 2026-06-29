package data;

import model.Question;
import model.Quiz;

/**
 * Provides Aerospace-related quiz questions.
 */
public class AerospaceQuestions {

    public static Quiz getQuiz() {

        Quiz quiz = new Quiz("🚀 Aerospace Fundamentals");

        quiz.addQuestion(new Question(
                1,
                "Which organization is India's national space agency?",
                "NASA",
                "ESA",
                "ISRO",
                "SpaceX",
                'C',
                "Aerospace",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                2,
                "Which force keeps planets in orbit around the Sun?",
                "Magnetism",
                "Gravity",
                "Electric Force",
                "Friction",
                'B',
                "Aerospace",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                3,
                "Which layer of Earth's atmosphere do most commercial aircraft fly in?",
                "Troposphere",
                "Mesosphere",
                "Stratosphere",
                "Thermosphere",
                'C',
                "Aerospace",
                "Medium"
        ));

        quiz.addQuestion(new Question(
                4,
                "Which planet is known as the Red Planet?",
                "Mars",
                "Venus",
                "Mercury",
                "Jupiter",
                'A',
                "Aerospace",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                5,
                "Which fuel is commonly used in modern commercial jet aircraft?",
                "Diesel",
                "Petrol",
                "Jet A-1",
                "Kerosene Lamp Oil",
                'C',
                "Aerospace",
                "Medium"
        ));

        quiz.addQuestion(new Question(
                6,
                "What is the primary purpose of an aircraft wing?",
                "Increase Weight",
                "Generate Lift",
                "Reduce Speed",
                "Store Fuel Only",
                'B',
                "Aerospace",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                7,
                "Who was the first human to travel into space?",
                "Neil Armstrong",
                "Buzz Aldrin",
                "Yuri Gagarin",
                "Alan Shepard",
                'C',
                "Aerospace",
                "Medium"
        ));

        quiz.addQuestion(new Question(
                8,
                "Which spacecraft first landed humans on the Moon?",
                "Apollo 11",
                "Apollo 13",
                "Voyager 1",
                "Chandrayaan-3",
                'A',
                "Aerospace",
                "Medium"
        ));

        quiz.addQuestion(new Question(
                9,
                "What does GPS stand for?",
                "Global Positioning System",
                "General Positioning Satellite",
                "Global Program System",
                "Geo Position Service",
                'A',
                "Technology",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                10,
                "Which company developed the Falcon 9 rocket?",
                "Blue Origin",
                "NASA",
                "SpaceX",
                "Boeing",
                'C',
                "Aerospace",
                "Easy"
        ));

        return quiz;
    }
}