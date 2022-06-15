userText=input("Enter some text: ")

print(userText.upper())

userNumber=input("What do you want to double: ")

print(int(userNumber)*2)

#First ask for some text and then prompt "Enter 1 to uppercase and 2 to lowercase: " and then either upper or lowercase it

text=input("Please enter some text: ")
variable=int(input("Enter 1 to upercase and 2 to lowercase: "))

if variable==1:
    print(text.upper())
else:
    print(text.lower())