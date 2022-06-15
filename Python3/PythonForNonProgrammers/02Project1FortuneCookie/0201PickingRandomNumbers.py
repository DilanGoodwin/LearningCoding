import random

print(random.randint(1,10))
print(random.random())

#Challenge make your own magic 8 ball prints yes, no or maybe each time you ask it

randNum=random.randint(1,3)

if randNum==1:
    print("Yes")
elif randNum==2:
    print("No")
else:
    print("Maybe")