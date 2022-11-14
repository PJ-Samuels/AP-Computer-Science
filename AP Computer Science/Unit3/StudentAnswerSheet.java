package Unit3;
import java.util.ArrayList;

public class StudentAnswerSheet
{
    private ArrayList<String> answers;
    private String name;
    
    public StudentAnswerSheet(String n ,ArrayList<String> a )
    {
        name = n;
        answers = a;
    }
    
    
    /**
     * @param key  the list of correct answers, represented as Strings of length one
     *      precondition: key.size() is equal to the number of answers in this answer sheet
     * @return  this student's test score
     */
    public double getScore( ArrayList<String> key )
    {
        double score = 0;
        for(int i = 0; i < key.size(); i++)
        {
            if(answers.get(i) == key.get(i))
                score +=1;
            else if((answers.get(i) == key.get(i)))
                score +=.25;
            else
                score+=0;
                
        }
        return score;
    }
    
    /** 
     * @return the name of the student
     */
    public String getName()
    {
        return name;
    }
    
}
