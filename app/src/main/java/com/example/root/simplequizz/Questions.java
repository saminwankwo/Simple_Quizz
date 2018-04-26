package com.example.root.simplequizz;

public class Questions {

    public String mQuestions[] = {
            "What is the name of the first planet on our solar system?",
            "What is the name of the second planet on our solar system?",
            "What is the name of the third planet on our solar system?",
            "What is the name of the fourth planet on our solar system?",
            "What is the name of the fifth planet on our solar system?",
            "What is the name of the sixth planet on our solar system?",
            "What is the name of the seventh planet on our solar system?",
            "What is the name of the eight planet on our solar system?",
            "What is the name of the ninth planet on our solar system?",

    };

    private String mChoices[][] = {
            {"Pluto", "Mercury", "Earth", "Jupitar"},
            {"Pluto", "Venus", "Uranus", "Mars"},
            {"Venus", "Saturn", "Earth", "Jupitar"},
            {"Mars", "Venus", "Saturn", "Pluto"},
            {"Uranus", "Pluto", "Mars", "Jupitar"},
            {"Mercury", "Earth", "Saturn", "Jupitar"},
            {"Venus", "Uranus", "Pluto", "Saturn"},
            {"Mars", "Venus", "Jupitar", "Neptune"},
            {"Pluto", "Mercury", "Saturn", "Earth"},

    };

    private String mCorrectAnswers[] = {
            "Mercury", "Venus", "Earth", "Mars", "Jupitar", "Saturn", "Uranus", "Neptune", "Pluto"
    };

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String Choice = mChoices[a][0];
        return Choice;
    }

    public String getChoice2(int a) {
        String Choice = mChoices[a][1];
        return Choice;
    }

    public String getChoice3(int a) {
        String Choice = mChoices[a][2];
        return Choice;
    }

    public String getChoice4(int a) {
        String Choice = mChoices[a][3];
        return Choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }


}
