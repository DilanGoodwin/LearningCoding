guess=int(input("What is your guess: "))
correctNumber=5
guessCount=1

while guess!=correctNumber:
    guess=int(input("What is your guess: "))
    guessCount+=1

print(f"Congrats! The right answer was {correctNumber}. It took you {guessCount} guesses.")