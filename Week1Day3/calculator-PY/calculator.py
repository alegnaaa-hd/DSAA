# DSAA Week 1 Day 3, 7/16/2024

import math

class Calculator:

    def __init__(self):
        self.number1 = 0
        self.number2 = 0

    # addition
    def add(self):
        return self.number1 + self.number2

    # subtraction 
    def subtract(self): 
        return (self.number1 - self.number2)

    # multiplication
    def multiply(self): 
        return (self.number1 * self.number2)

    # division 
    def divide(self): 
        # check if second number is 0 
        if float(self.number2) != 0.0:
            return float(self.number1) / float(self.number2)
        return (self.number1 / self.number2)

    def get_two_Numbers (self):
        # get number1 and number2 from user
        number1 = 0.0
        number2 = 0.0
        number1 = float(input("Enter number1: "))
        number2 = float(input("Enter number2: "))
        self.number1 = number1
        self.number2 = number2
        return [number1, number2]

    def exponent (self):
        return self.number1 ** self.number2

    def sine (self):
        return math.sin(self.number)

    def cosine (self):
        return math.cos(self.number)

    def tangent (self):
        return math.tan(self.number)

"""
# specific demonstration with the exponents function 

basic_calculator = Calculator()

scientific_calculator = Calculator()

basic_calculator.get_two_Numbers()

scientific_calculator.number1 = basic_calculator.number1
scientific_calculator.number2 = basic_calculator.number2

# exp = basic_calculator.number1 raised to power of basic_calculator.number2
exp = scientific_calculator.exponent()
# basic_calculator.number1 + basic_calculator.number2

print("exp: ", exp)
"""