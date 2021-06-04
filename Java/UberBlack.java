package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car {

    Map<String, Map<String, Integer>> typeCarAcepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String licence, Account driver, Map<String, Map<String, Integer>> typeCarAcepted, ArrayList<String> seatsMaterial) {
        super(licence, driver);
        
        this.typeCarAcepted = typeCarAcepted;
        this.seatsMaterial = seatsMaterial;
    }
    
}
