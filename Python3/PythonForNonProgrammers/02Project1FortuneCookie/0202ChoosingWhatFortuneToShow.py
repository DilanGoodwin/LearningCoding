import random

luckyNumber=random.randint(1,100)

fortuneNumber=random.randint(1,3)

fortuneText=""

if fortuneNumber==1:
    fortuneText="You will have a greadt day!"
elif fortuneNumber==2:
    fortuneText="Today will be tough but worth it."
else:
    fortuneText="You will get married this year!"

print(f"{fortuneText} Your lucky number is: {luckyNumber}")