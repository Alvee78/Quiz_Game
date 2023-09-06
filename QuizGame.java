//package Project.QuizGame;
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        QuestionBank questionBank = new QuestionBank();
        questionBank.addQuestion(new Question("What is the capital of France?", new String[]{"A) Paris", "B) London", "C) Rome", "D) Berlin"}, "A"));
        questionBank.addQuestion(new Question("What is the largest planet in our solar system?", new String[]{"A) Earth", "B) Mars", "C) Jupiter", "D) Venus"}, "C"));
        questionBank.addQuestion(new Question("Which gas do plants primarily use for photosynthesis?", new String[]{"A) Oxygen", "B) Nitrogen", "C) Carbon dioxide", "D) Hydrogen"}, "C"));
        questionBank.addQuestion(new Question("What is the chemical symbol for gold?", new String[]{"A) Au", "B) Ag", "C) Cu", "D) Fe"}, "A"));
        questionBank.addQuestion(new Question("Which scientist formulated the theory of relativity?", new String[]{"A) Isaac Newton", "B) Galileo Galilei", "C) Albert Einstein", "D) Nikola Tesla"}, "C"));
        questionBank.addQuestion(new Question("What is the main function of the heart?", new String[]{"A) Digestion", "B) Respiration", "C) Circulation", "D) Excretion"}, "C"));
        questionBank.addQuestion(new Question("What is the largest mammal?", new String[]{"A) Elephant", "B) Blue whale", "C) Giraffe", "D) Lion"}, "B"));
        questionBank.addQuestion(new Question("Which planet is known as the Red Planet?", new String[]{"A) Mars", "B) Venus", "C) Mercury", "D) Jupiter"}, "A"));
        questionBank.addQuestion(new Question("What is the chemical symbol for water?", new String[]{"A) H2O", "B) CO2", "C) O2", "D) N2"}, "A"));
        questionBank.addQuestion(new Question("What is the smallest prime number?", new String[]{"A) 1", "B) 2", "C) 3", "D) 5"}, "B"));

        int score = 0;

        System.out.println("Welcome to the Quiz Game!");

        for (int i = 0; i < questionBank.getQuestions().size(); i++) {
            Question question = questionBank.getQuestions().get(i);
            System.out.println("Question " + (i + 1) + ":");
            System.out.println(question.getPrompt());
            for (String choice : question.getChoices()) {
                System.out.println(choice);
            }

            System.out.print("Your answer (A/B/C/D): ");
            String userChoice = scanner.next().toUpperCase(); // Convert to uppercase for case-insensitivity

            if (userChoice.equals(question.getCorrectChoice())) {
                System.out.println("Correct! " + question.getCorrectChoice() + " is the right answer.");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + question.getCorrectChoice() + ".");
            }
            System.out.println();
        }

        System.out.println("Congratulations! You've completed the quiz.");
        System.out.println("Your final score: " + score + " out of " + questionBank.getQuestions().size());
        if (score >= questionBank.getQuestions().size() / 2) {
            System.out.println("Well done! You have a good grasp of the quiz material.");
        } else {
            System.out.println("Keep practicing to improve your score.");
        }
    }
}

