
userInput1=int(input("Please enter a number: "))
userInput2=int(input("Please enter a number: "))
userInput3=int(input("Please enter a number: "))

if userInput1>userInput2 and userInput1>userInput3:
  print("Greatest number is: ",userInput1)
elif userInput2>userInput1 and userInput2>userInput3:
  print("Greatest number is: ",userInput2)
elif userInput3>userInput1 and userInput3>userInput2:
  print("Greatest number is: ",userInput3)
else:
  print("There was an error")
