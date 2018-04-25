import javax.swing.*;

public class QuizCard {
    String question1;
    String answer1;

    QuizCard(String a, String b){
        question1 = a;
        answer1 = b;
    }

    public String getQuestion(){
        return question1;
    }

    public String getAnswer(){
        return answer1;
    }

}
