package Assignment3.Course_Grade;

public class FinalExam extends GradedActivity{
    
    private int numQuestion;
    private int numMissed;

    public FinalExam(int questions, int missed){
        numQuestion = questions;
        numMissed = missed;
    }

    public int getNumQuestions(){
        return numQuestion;
    }

    public int getNumMissed(){
        return numMissed;
    }

    public double getPointsEach(){
        return (numQuestion - numMissed) / numQuestion * 100;
    }
}
