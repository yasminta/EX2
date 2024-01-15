package QA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String EX2_1_B(int x) {
    	
    	if(x>=1 && x<=49)
    		return "F";
    	else if(x>=50 && x<= 59)
    		return "E";
    	else if(x>=60 && x<= 69)
    		return "D";
    	else if(x>=70 && x<= 79)
    		return "C";
    	else if(x>=80 && x<= 89)
    		return "B";
    	else if(x>=90 && x<= 100)
    		return "A";
    	else
    		return "Error";
    }
    public static void main( String[] args )
    {

    }
}
