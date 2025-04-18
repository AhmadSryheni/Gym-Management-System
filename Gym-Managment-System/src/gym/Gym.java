

package gym;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author Arbirt
 */
public class Gym {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList<sport> Sports = new ArrayList<sport>();
        ArrayList<employee>Employees = new ArrayList<employee>();
        ArrayList<client>Clients = new ArrayList<client>();
        ArrayList<card>Cards = new ArrayList<card>();
        // The gym system is in the Array Lists above
        //Create new Employee
        employee e1 = new employee("Mr.Alex","1234","Alex","Muller",988,"male");
        Employees.add(e1);
        boolean q = false;
        //Check if the user is a fraud or not
        System.out.println("Please Enter the username and password"); 
        for(int i =0;i< 3;i++){
        if(check(Employees)){
          q = true;
          System.out.println("Do you want to add new sports ? Yes or No");
          String adds = input.next();
          if(adds.equals("Yes")){
         System.out.println("How many sports do you want to add ?");
         int count = input.nextInt();
         while(count != 0){
        //Create new Sports
        System.out.println("Enter these details about the new sport respectively : Name, Room number, Number of places, Timing, Couch name , Subscription price ");
        String name = input.next();
        int roomNum  = input.nextInt();
        int Nop = input.nextInt();
        int timing = input.nextInt();
        String couchName = input.next();
        int subprice = input.nextInt();        
          sport s1 = new sport(name,roomNum,Nop,timing,couchName,subprice);
          //Employee adds the Sports
          e1.addSport(Sports,s1);
          count--;
         }
         //View list of available sports and its available number of places
         System.out.println("The Sports that you added :");
         viewSport(Sports);
          }
         System.out.println("Do you want to add new clients ? Yes or No");
         String addc = input.next();
          if(addc.equals("Yes")){
           System.out.println("How many clients do you want to add ?");
           int count = input.nextInt();
           int cardnum = 1;
           while(count != 0){
           System.out.println("Enter these details about the new clients respectively : age, height, weight, firstName, lastName, phone, gender");
        //Create new Clients
        int age = input.nextInt();
        int height = input.nextInt();
        int weight = input.nextInt();
        String firstName = input.next();
        String lastName = input.next();
        int phone = input.nextInt(); 
        String gender = input.next();
        client i1 = new client(age,height,weight,firstName,lastName,phone,gender);
        //Employee adds the Clients
        e1.addClient(Clients, i1);
        //Create new card for clients who will subscribe in the gym
        card c1 = new card(cardnum,LocalDate.parse("2018-12-08"),LocalDate.parse("2025-12-08"));
        e1.creatCard(Cards, i1, c1);
        //Check availability of the card “expired or not + If you want to add sport to your card”
        subscribe s = new subscribe(Cards,Sports);
        s.card(cardnum);
        cardnum++;
        count--;
           }
           //View list of each client category (silver, gold)
        System.out.println("Silver Clients are : ");
        e1.silverClients(Clients);
        System.out.println("Gold Clients are : ");
        e1.goldClients(Clients);
        //View list of sport which subscribed less than 3
        System.out.println("Sports that which subscribed less than 3 clients :");
        sportLess3(Sports);
            }
          break;
      }
        else{
            System.out.println("The username or password is wrong, try again.");
                }
        }
        if(q == false) System.out.println("The System is blocked");
    }
    public static void sportLess3(ArrayList<sport> Sports){
        for (sport s : Sports){
            if (s.getNumberOfSubs() < 3){
                System.out.println(s);
            }
        }
    }
    public static void viewSport(ArrayList<sport> Sports){
        for(sport s : Sports){
            System.out.println(s);
        }
    }
    public static boolean check(ArrayList<employee> Employees){
     Scanner input = new Scanner (System.in);
     String n,p;
     n = input.nextLine();
     p = input.nextLine();
     for(employee e : Employees){
     if(e.getUsername().equals(n) && e.getPassword().equals(p)) return true;
     }
     return false;
    }
}
