import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ipjava {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir une adresse ip : ");
        String ipAddress = sc.nextLine();
        InetAddress inet = InetAddress.getByName(ipAddress);
         
        System.out.println("Envoi d'un ping vers : " + ipAddress);
        System.out.println(inet.isReachable(5000) ? "Hote atteint" : "Hote n'a pas été atteint");   
    }
}