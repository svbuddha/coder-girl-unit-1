import static java.lang.System.out;

public class Temperatures
{
    public static void main(String [] args)
    {
        int temp[][]  = {{68,70,76,70,68,71,75},{76,76,87,84,82,75,83},{73,72,81,78,76,73,77},{64,65,69,68,70,74,72}};
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday"};
        String times [] = { "7 AM", "3 PM", "7 PM", "3 AM"};
        out.println("Temperature Calculator");
        out.println("");
        out.println("The data provided are:"); 
        for (int r= 0; r < times.length; r++) 
        { 
            out.print(times[r] + ": "); 
            for (int c = 0; c < days.length; c++) 
            {
                if (c < (days.length -1))

                {
                    out.print(temp[r][c]+ ", "); 
                }
                else{ 
                    out.print(temp[r][c]);}
            }  
            out.println(""); 
        }
        out.println("");
        out.println("Based on that data, the following are the average tempuratures for the week.");
        out.println("");
        for(int c = 0; c < days.length; c++)
        { 
            out.print(days[c]);
            int columnSum = 0;
            for(int r = 0; r < times.length; r++)
            {
                columnSum+= temp[r][c];
            }
            double average = columnSum/(double)times.length;
            average = (double)Math.round(average * 100d)/100d;
            out.println(": " + average);
        }
        out.println("");
        for(int r = 0; r < times.length; r++)
        {
            out.print(times[r]);
            int rowSum = 0;
            for(int c = 0; c < days.length;c++)
            {
                rowSum+= temp[r][c];
            }
            double average = rowSum/(double)days.length;
            average = (double)Math.round(average* 100d)/100d;
            out.println(":" + average);
        }
        out.println("");
        out.println("The final average tempurature for the week was: ");
        out.println("");
        int totalSum = 0;
        for (int r = 0; r < times.length; r++)
        {   
            for (int c = 0; c < days.length; c++)
            {
                totalSum+= temp[r][c];
            }
        }
        double average = totalSum/(double)(days.length* times.length);
        average = (double)Math.round(average* 100d)/100d;
        out.println("Overall: " + average);
    }
}
