def withdrawMoney(currentBalance,amount):
    if(currentBalance>=amount):
        currentBalance=currentBalance-amount
        return currentBalance

balance=withdrawMoney(100,80)

if (balance<=50):
    print("We need to make a deposit")
else:
    print("Nothing to see here!")
