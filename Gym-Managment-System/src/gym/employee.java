
package gym;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Arbirt
 */
public class employee extends stakeHolder{
        Scanner input = new Scanner (System.in);
    private String username;
    private String password;
    private client i;
    private card c;
    private sport s;

    public employee(String username, String password, String firstName, String lastName, int phone, String gender) {
        super(firstName, lastName, phone, gender);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public void addSport(ArrayList<sport> sp,sport ss)
    { 
        sp.add(ss);
    }
    public void addClient(ArrayList<client> ip,client ii)
    { 
        ip.add(ii);
    }
    public void creatCard(ArrayList<card> cc ,client i, card c){
        i.setC(c);
        cc.add(c);
    }
    public void goldClients(ArrayList<client>Clients){
        for(client cc : Clients){
            if(cc.getC().getType() != null){
                if (cc.getC().getType().equals("Gold")){
                System.out.print(cc);
            }
            }
        }
    }
    public void silverClients(ArrayList<client>Clients){
        for(client cc : Clients){
            if(cc.getC().getType() != null){
            if (cc.getC().getType().equals("Silver")){
                System.out.print(cc);
            }
            }
        }
    }
    
}
