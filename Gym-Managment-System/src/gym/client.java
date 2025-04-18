
package gym;



/**
 *
 * @author Arbirt
 */
public class client extends stakeHolder{
    private int age;
    private int height;
    private int weight;
    private card c;

    public client(int age, int height, int weight, String firstName, String lastName, int phone, String gender) {
        super(firstName, lastName, phone, gender);
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public card getC() {
    return c;
    }

    public void setC(card c) {
        
        this.c = c;
    }
     public String toString(){
        return String.format("age :%d, height :%d,weight :%d, firstName : %s,lastName :%s,phone :%d,gender :%s",age, height, weight, firstName, lastName, phone, gender);
    }
    
}
