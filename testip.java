import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class testip {
    public static void main(String[] args) throws UnknownHostException, IOException {
        String ipAdresse = "127.0.0.1";
        InetAddress inet = InetAddress.getByName(ipAdresse);
    
        System.out.println("Envoi d'une requête ping à l'adresse " + ipAdresse);
        System.out.println(inet.isReachable(5000) ? "L'hôte est accessible" : "L'hôte n'est pas accessible");
    }
}

