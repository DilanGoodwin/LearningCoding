import random

print("Hi! Welcome to the guessing game. Please guess a number between 1 and 100.")
guess=int(input("What is your guess: "))
correctNumber=random.randint(1,100)
guessCount=1

while guess!=correctNumber:
    guessCount+=1

    if guess<correctNumber:
        guess=int(input("Wrong. You need to guess higher. What is your guess: "))
    else:
        guess=int(input("Wrong. You need to guess lower. What is your guess: "))

print(f"Congrats! The right answer was {correctNumber}. It took you {guessCount} guesses.")