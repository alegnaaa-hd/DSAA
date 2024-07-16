# DSAA Week 1 Day 3, 7/16/2024

from functions import *

(number1, number2)= get_two_Numbers()

# print options 
print ("Options: ")
print ("1. 'addition'")
print ("2. 'subtraction'")
print ("3. 'multiplication'")
print ("4. 'division'")
userInput = str(input("Enter operation name: "))

operation = ""
sign = ""

if userInput == "addition":
    operation = "a"
    sign = "+"

elif userInput == "subtraction":
    operation = "s"
    sign = "-"

elif userInput == "multiplication":
    operation = "m"
    sign = "*"

elif userInput == "division":
    operation = "d"
    sign = "/"

else:
    print ("That is not an option")

x = float(number1)
y = float(number2)

if operation == "a":
    result = add(x,y)

elif operation == "s":
    result = subtract(x,y)

elif operation == "m":
    result = multiply(x,y)

elif operation == "d":
    result = multiply(x,y)

print (number1, " ", sign, " ", number2, " = ", result)

