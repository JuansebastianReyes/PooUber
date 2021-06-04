class Card extends Payment{
    constructor(id,cardNumber,ccv,dateCard){
        super(id);
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.dateCard = dateCard;
    }
}