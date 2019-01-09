import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class testip {
    public static void main(String[] args) throws UnknownHostException, IOException {
        String ipAddress = "10.34.8.24";
        InetAddress inet = InetAddress.getByName(ipAddress);
    
        System.out.println("Sending Ping Request to " + ipAddress);
        System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");
    }
}

