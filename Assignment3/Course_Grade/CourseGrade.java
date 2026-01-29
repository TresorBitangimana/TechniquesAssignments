package Assignment3.Course_Grade;

public class CourseGrade implements Analyzable{
    
    private GradedActivity[] grades;
    private int NUM_GRADES = 3;
    
    
    public CourseGrade(){
        grades = new GradedActivity[NUM_GRADES];
    }

    public void setLab(GradedActivity aLab){
        grades[0] = aLab;
    }

    public void setPassFailExam(PassFailExam aPassFailExam){
        grades[1] = aPassFailExam;
    }

    public void setEssay(Essay anEssay){
        grades[2] = anEssay;
    }

    public void setFinalExam(FinalExam aFinalExam){
        grades[3] = aFinalExam;
    }

    @Override
    public String toString() {
        return "Lab: Score = "+ grades[0].getScore()+ " Grade = "+grades[0].getScore()+
                "\nPassFailExam: Score = "+ grades[1].getScore()+ " Grade = "+grades[1].getScore()+
                "\nEssay: Score = "+ grades[2].getScore()+ " Grade = "+grades[2].getScore()+
                "\nPassFailExam: Score = "+ grades[3].getScore()+ " Grade = "+grades[3].getScore();

    }

    @Override
    public double getAverage() {
        double average= 0;

        for(int i = 0; i < grades.length; i++){
            average += grades[i].getScore();
        }

        average = average / grades.length;

        return average;
    }

    @Override
    public GradedActivity getHighest() {
        double highestScore = 0;
        int index = 0;

        for(int i = 0; i < grades.length; i++){
            if(grades[i].getScore() > highestScore){
                index = i;
            }
        }

        return grades[index];
    }

    @Override
    public GradedActivity getLowest() {
        double LowestScore = 100;
        int index = 0;

        for(int i = 0; i < grades.length; i++){
            if(grades[i].getScore() < LowestScore){
                index = i;
            }
        }

        return grades[index];
    }


    public static void main(String[] args){
        //test


    }
}
