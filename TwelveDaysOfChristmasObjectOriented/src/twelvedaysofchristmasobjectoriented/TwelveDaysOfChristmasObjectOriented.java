package twelvedaysofchristmasobjectoriented;

import java.util.Scanner;

public class TwelveDaysOfChristmasObjectOriented {

    public static void main(String[] args) {

        Question[] questions = setUpQuestions();

        runQuiz(questions);

    }

    private static Question[] setUpQuestions() {

        Question[] questions = new Question[12];
        String textNumber[] = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eight", "ninth", "tenth", "eleventh", "twelveth"};
        String answers[] = {"a partridge in a pear tree", "2 turtle doves", "3 french hens", "4 calling birds", "5 golden rings", "6 ladies dancing", "seven swans a-swimming", "8 maids a-milking", "9 ladies dacning", "10 lords a-leaping", "11 pipers piping", "12 drummer dumming"};

        for (int i = 0; i < questions.length; i++) {
            questions[i] = new Question();
            questions[i].setText(textNumber[i]);
            questions[i].setAnswer(answers[i]);

        }

        return questions;
    }

    private static void runQuiz(Question[] questions) {
        Scanner input = new Scanner(System.in);
        String userInput;

        for (int i = 0; i < questions.length; i++) {

            do {
                System.out.println(questions[i]);
                userInput = input.nextLine();

                if (questions[i].isCorrect(userInput)) {
                    System.out.println("Correct");
                } else {
                    System.out.println("Incorrect");
                }
            } while (questions[i].isCorrect(userInput) == false);
        }

    }

}

