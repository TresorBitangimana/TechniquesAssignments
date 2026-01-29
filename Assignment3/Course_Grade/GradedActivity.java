package Assignment3.Course_Grade;

public class GradedActivity extends CourseGrade{
    
    private double score;

    public GradedActivity(){
        this.score = 0;
    }

    public void setScore(double s){
        score = s;
    }

    public double getScore(){
        return score;
    }

    public char getGrade(){
        char grade = ' ';

        if(score >= 90){
            grade = 'A';
        }
        else if(score >= 80 &&  score < 90){
            grade = 'B';
        }
        else if (score >= 70 &&  score < 80 ){
            grade = 'C';
        }
        else{
            grade = 'F';
        }

        return grade;
    }

}
