package testping;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Poller {
    
    private String ip;
    private int intervalle;

    public Poller(String ip, int intervalle) {
        this.ip = ip;
        this.intervalle = intervalle;
    }


    public void Ping() {
        String ip = null;
        String pingResult = ""; 

        String pingCmd = "ping" + ip;
    
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
            // Affichage du résultat du ping
            pingResult = pingResult.substring(pingResult.indexOf("time=")).substring(0, pingResult.indexOf("TTL"));
        }
        catch(Exception e) 
        {
            System.out.println(e);
            System.out.println("Le ping n'a pas fonctionné");
        }  
    }              
}
