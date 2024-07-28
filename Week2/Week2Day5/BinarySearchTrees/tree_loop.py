# DSAA Week 2 Day 5, 7/25/2024

from Node import Node

root = Node(6)
root.left = Node(4)

temp = root

foundLocation = False
new_key = 3
key_to_search = 4

while not(foundLocation):
    if temp == None:
        print ("We got to a left or right that is None")
        foundLocation = True
        break
    elif key_to_search < temp.key:
        print ("Checking node with key: ", temp.key)
        print ("and address: ", temp)
        print ("Going left at address: ", temp.left)
        temp = temp.left

    elif key_to_search > temp.key:
        print ("Checking node with key: ", temp.key)
        print ("and address: ", temp)
        print ("Going right at address: ", temp.right)
        temp = temp.right 
 
    else:
        print ("Found node with key: ", temp.key)
        print ("and address: ", temp)
        break