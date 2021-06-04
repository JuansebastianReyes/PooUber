from payment import Payment


class Card(Payment):
    cardNumber = int
    ccv = str
    dateCard = str

    def __init__(self, id, cardNumber, ccv, dateCard):
        super().__init__(id)
        self.cardNumber = cardNumber
        self.ccv = ccv 
        self.dateCard = dateCard