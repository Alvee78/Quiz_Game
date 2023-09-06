//package Project.QuizGame;
public class Question {
    private String prompt;
    private String[] choices;
    private String correctChoice;

    public Question(String prompt, String[] choices, String correctChoice) {
        this.prompt = prompt;
        this.choices = choices;
        this.correctChoice = correctChoice;
    }

    public String getPrompt() {
        return prompt;
    }

    public String[] getChoices() {
        return choices;
    }

    public String getCorrectChoice() {
        return correctChoice;
    }
}
