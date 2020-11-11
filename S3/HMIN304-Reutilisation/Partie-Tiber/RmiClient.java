import java.rmi.Naming;
public class RmiClient { 
    public static void main(String args[]) throws Exception {
        RmiServerIntf obj = (RmiServerIntf)Naming.lookup("//localhost/RmiServer");
	Thread.sleep(10000);
        System.out.println(obj.getMessage());
    }
}
