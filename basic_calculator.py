# DSAA Week 1 Day 3, 7/16/2024

from calculatorPY.functions import add, subtract, multiply, divide

number1 = input("Enter the first number: ")
number2 = input("Enter the second number: ")
print ("Options: ")
print ("1. 'addition'")
print ("2. 'subtraction'")
print ("3. 'multiplication'")
print ("4. 'division'")
operation = str(input("Enter operation name: "))

a = "addition"
s = "subtraction"
m = "multiplication"
d = "division"

x = float(number1)
y = float(number2)

if operation == a:
    result = add(x,y)

elif operation == s:
    result = subtract(x,y)

elif operation == m:
    result = multiply(x,y)

elif operation == d:
    result = multiply(x,y)

else:
    print ("That is not an option")

print (number1, " ", operation, " ", number2, " = ", result)

