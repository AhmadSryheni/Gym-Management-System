
package gym;
import java.time.LocalDate;

/**
 *
 * @author Arbirt
 */
public class card {
    private int carNum;
    private LocalDate startDate;
    private LocalDate endDate;
    private String type;

    public card(int carNum, LocalDate startDate, LocalDate endDate) {
        this.carNum = carNum;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getCarNum() {
        return carNum;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
