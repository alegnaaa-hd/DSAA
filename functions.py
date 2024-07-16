# DSAA Week 1 Day 3, 7/16/2024

# addition
def add(number1: float, number2: float): 
    return (number1 + number2)

# subtraction 
def subtract(number1: float, number2: float): 
    return (number1 - number2)

# multiplication
def multiply(number1: float, number2: float): 
    return (number1 * number2)

# division 
def divide(number1: float, number2: float): 
    # check if second number is 0 
    if float(number2) != 0.0:
        return float(number1) / float(number2)
    return (number1 / number2)

"""
number1 = input("Enter the first number: ")
number2 = input("Enter the second number: ")
answer = str(input("Enter Y(es) to add: "))
answer = answer.lower()
yes = "Yes"
print ("You entered ", number1, " and ", number2)

if answer[0] == (yes.lower())[0]:
    summ = add(float(number1), float(number2))
    print("The addition of ", number1," to ", number2, " is: ", summ)
"""
