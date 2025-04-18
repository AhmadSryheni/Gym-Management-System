
package gym;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author Arbirt
 */
public class subscribe{
    private ArrayList<card> cards;
    private ArrayList<sport> sports;
    private card c;
    private LocalDate date;
    private double totAmount = 0;
    private ArrayList<sport> mySports = new ArrayList<sport>(); 
    Scanner input = new Scanner (System.in);
    public subscribe(ArrayList<card> cards, ArrayList<sport> sports) {
        this.cards = cards;
        this.sports = sports;
    }
    
    
    
    public void card(int num){
        String answer;
        boolean q = false;
        for (card card : cards) {
            if(card.getCarNum() == num){
                q = true;
                if(card.getEndDate().compareTo(java.time.LocalDate.now()) <= 0){
                    System.out.println("Expired");
                }
                else{
                    System.out.println("Valid card");
                    for(sport sport : sports){
                        System.out.printf("Sport Name : %s Sport available places : %d",sport.getName(),sport.getNoP());
                        System.out.println("");
                        
                    }
                    System.out.println("Do ou want to subscribe ? Yes or No ");
                    answer = input.nextLine();
                    if(answer.equals("Yes")){
                        submit(card);
                    }
                    else {
                        System.out.println("Thank you for using uur system");
                        break;
                    }
                }
            
            }
        }
        if(q == false) System.out.println("card not availabe...");
       
    }
    
    public void submit(card cc){
        String name;
        do{
            
            System.out.println("What Sport would you like to add ? end to end");
            name = input.nextLine();
            boolean q = false;
            for(sport sport: sports){
                if(sport.getName().equals(name)){
                    q = true;
                    if(sport.getNoP() > 0) {
                        System.out.println("Sport is addded");
                        sport.setNoP(sport.getNoP() - 1);
                        sport.setNumberOfSubs(sport.getNumberOfSubs() + 1);
                        addSportToCard(sport);
                    }
                    else{
                        System.out.println("No places in this sport");
                    }
                }
            }
            
           if(q == false &&!name.equals("end")) {
                    System.out.println("There is no such sport like that");
                }
        }while(!name.equals("end"));
        c = cc;
        date = java.time.LocalDate.now();
        discount(totAmount);
    } 
    public void addSportToCard(sport ss){
        mySports.add(ss);
        totAmount += ss.getSubprice();
        
    }
    public void discount(double disc) {
        if(mySports.size()==2){
            totAmount *= 0.9 ;
            c.setType("Silver");
        }
        else if (mySports.size()>=3){
            totAmount *= 0.85 ;
            c.setType("Gold");
        }
        else{
            c.setType("Normal");
        }
    }
}
