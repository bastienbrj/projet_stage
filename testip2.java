import java.io.BufferedReader;
import java.io.InputStreamReader;

public class testip2 
{
  
    public static void main(String[] args) 
    {

        String ip = "192.168.1.1 -n 10";
        String pingResult = "";

        String pingCmd = "ping " + ip;
    
        try
        {
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(pingCmd);

            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) 
            {
                System.out.println(inputLine);
                pingResult += inputLine;
            }
            in.close();
            pingResult = pingResult.substring(pingResult.indexOf("time=")).substring(0, pingResult.indexOf("TTL"));
        }
        catch(Exception e) 
        {
            System.out.println(e);
        }
    }
}