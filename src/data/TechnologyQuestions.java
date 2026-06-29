package data;

import model.Question;
import model.Quiz;

/**
 * Provides Technology-related quiz questions.
 */
public class TechnologyQuestions {

    public static Quiz getQuiz() {

        Quiz quiz = new Quiz("🌐 Technology Fundamentals");

        quiz.addQuestion(new Question(
                1,
                "What does AI stand for?",
                "Automated Internet",
                "Artificial Intelligence",
                "Advanced Integration",
                "Application Interface",
                'B',
                "Technology",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                2,
                "Which cloud provider developed AWS?",
                "Microsoft",
                "Google",
                "Amazon",
                "Oracle",
                'C',
                "Technology",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                3,
                "Which protocol is primarily used for secure web browsing?",
                "HTTP",
                "FTP",
                "HTTPS",
                "SMTP",
                'C',
                "Technology",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                4,
                "Which database language is used to retrieve and manage relational data?",
                "HTML",
                "CSS",
                "SQL",
                "XML",
                'C',
                "Technology",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                5,
                "Which device forwards data packets between computer networks?",
                "Monitor",
                "Router",
                "Printer",
                "Scanner",
                'B',
                "Technology",
                "Medium"
        ));

        quiz.addQuestion(new Question(
                6,
                "Git is primarily used for:",
                "Graphic Design",
                "Version Control",
                "Database Management",
                "Operating Systems",
                'B',
                "Technology",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                7,
                "Which operating system is open-source?",
                "Windows",
                "macOS",
                "Linux",
                "iOS",
                'C',
                "Technology",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                8,
                "Which cybersecurity attack attempts to trick users into revealing sensitive information?",
                "DDoS",
                "Phishing",
                "Brute Force",
                "SQL Join",
                'B',
                "Technology",
                "Medium"
        ));

        quiz.addQuestion(new Question(
                9,
                "Which layer of the OSI model is responsible for routing?",
                "Application Layer",
                "Transport Layer",
                "Network Layer",
                "Presentation Layer",
                'C',
                "Technology",
                "Hard"
        ));

        quiz.addQuestion(new Question(
                10,
                "Which software development methodology is based on iterative development and continuous feedback?",
                "Waterfall",
                "Agile",
                "V-Model",
                "Spiral",
                'B',
                "Technology",
                "Medium"
        ));

        return quiz;
    }
}