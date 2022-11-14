package Unit3;
import java.util.ArrayList;

public class TestResults
{
    private ArrayList<StudentAnswerSheet> sheets;
    
    public TestResults( ArrayList<StudentAnswerSheet> s )
    {
        sheets = s;
    }
    /**
     * Precondition:  sheets.size() > 0 
     *                all answer sheets in sheets have the same number of answers
     * @param  key  the list of correct answer represented as Strings of length one
     *         Precondition: key.size() is equal to the number of answers
     *                       in each of the answer sheets in sheets
     * @return  the name of the student with the highest score
     */
    public String highestScoringStudent( ArrayList<String> key )
    {
        int greatest = 0;
        for(int i = 0; i < key.size(); i++)
        {
            if(sheets.get(i).getScore(key) > sheets.get(greatest).getScore(key))
                greatest = i;                          
        }
        System.out.println(sheets.get(greatest).getName());
        return sheets.get(greatest).getName();
    }
}