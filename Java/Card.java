package Java;

import java.sql.Date;

public class Card extends Payment{

    Integer cardNumber;
    String ccv;
    Date dateCard;


    public Card(Integer id, Integer cardNumber, String ccv, Date dateCard) {
        super(id);   
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.dateCard = dateCard;

    }
}
