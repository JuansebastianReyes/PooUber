from car import Car
from account import Account

if __name__ == "__main__":
    
    car = Car("ARS123", Account("Juan Reyes","ASDA1241"))
    print(vars(car))
    print(vars(car.driver))