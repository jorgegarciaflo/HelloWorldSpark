
import org.apache.spark.api.java.function.Function2;

public class MyResultIntegrationFunction implements Function2<Integer, Integer, Integer>
{

    public Integer call(Integer a, Integer b)
    {
        return a + b;
    }//end call

}//end class