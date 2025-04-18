
package gym;



/**
 *
 * @author Arbirt
 */
public class sport {
    private static int counter = 0;
    private int id;
    private String name;
    private int roomNum;
    private int NoP;
    private int timing;
    private String couchName;
    private int subprice;
    private int numberOfSubs = 0;

    public sport(String name, int roomNum, int NoP, int timing, String couchName, int subprice) {
        this.id = ++counter;
        this.name = name;
        this.roomNum = roomNum;
        this.NoP = NoP;
        this.timing = timing;
        this.couchName = couchName;
        this.subprice = subprice;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public int getNoP() {
        return NoP;
    }

    public int getTiming() {
        return timing;
    }

    public String getCouchName() {
        return couchName;
    }

    public int getSubprice() {
        return subprice;
    }

    public void setNoP(int NoP) {
        this.NoP = NoP;
    }

    public int getNumberOfSubs() {
        return numberOfSubs;
    }

    public void setNumberOfSubs(int numberOfSubs) {
        this.numberOfSubs = numberOfSubs;
    }
    public String toString(){
        return String.format("Id :%d, Name :%s, Room Number :%d, Number of Places :%d, Timing :%d, Couch Name :%s, Subscription Price :%d, Number of Subscribers :%d ",id,name,roomNum,NoP,timing,couchName,subprice,numberOfSubs);
    }
}
