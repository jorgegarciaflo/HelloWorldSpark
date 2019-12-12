
import org.apache.spark.api.java.function.Function;

public class MyDataProcessingFunction implements Function<String, Integer>
{

    public Integer call(String aString)
    {
        return aString.length();
    }//end call

}//end class

