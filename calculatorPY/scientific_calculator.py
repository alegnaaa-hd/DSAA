# DSAA Week 1 Day 3, 7/16/2024

from functions import *

(number1, number2)= get_two_Numbers()

# print options 
print ("Options: ")
print ("1. 'e' --> exponent (", number1, " to the power of ", number2, ")")
print ("2. 'c' --> cosine (of ", number1, ")")
print ("3. 's' --> sine (of ", number1, ")")
print ("4. 't' --> tangent (of ", number1, ")")

userInput = (str(input("Enter operation name: "))).lower()

operation = userInput
sign = ""

if userInput == "e":
    sign = "^"
    y = float(number2)

elif userInput == "s":
    sign = "sin"
    number2 = str(number2)
    number2 = ""

elif userInput == "c":
    sign = "cos"
    number2 = ""
    number2 = str(number2)
    number2 = ""

elif userInput == "t":
    sign = "tan"
    number2 = ""
    number2 = str(number2)
    number2 = ""

else:
    print ("That is not an option")

x = float(number1)

if operation == "e":
    result = exponent(x,y)

elif operation == "s":
    result = sine(x)

elif operation == "c":
    result = cosine(x)

elif operation == "t":
    result = tangent(x)

print (number1, " ", sign, " ", number2, " = ", result)

