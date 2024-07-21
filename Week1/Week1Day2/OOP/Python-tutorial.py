# DSAA Week 1 Day 2, 7/15/2024

# basic OOP python tutorial by Franklin
class Animal:

    def __init__ (self, newName):
        # self.name = "Franklin"
        self.name = newName
    
    def runs (self):
        print("My name is ", self.name, " and I run")


d = Animal("Dog")
print(d.name)
d.runs()

#####################################################################

class Person: 
    
    def __init__ (self): 
        self.fname = ""
        self.lastname = ""
        self.ssn = 0
        self.height = 0

    def grows (self):
        self.height = self.height + 7

    def show_off(self):
        print("My name is ", self.fname, " ", self.lastname)
        print ("My ssn is ", self.ssn)
        print ("My height is ", self.height)

angela = Person()
angela.fname = "Angela"
angela.lastname = "Wang"
angela.ssn = "0000"
angela.height = "1"
angela.show_off()
