# DSAA Week 2 Day 5, 7/25/2024

class Node:
    # every node has data/content/key value
    # the key saves the actual data of the node
    # every node also needs a field to keep track
        # of its left and right nodes in the tree
    
    def __init__(self, number):
        self.key = number
        self.left = None
        self.right = None

    def display (self):
        print("I am a node. My key is: ", self.key, 
              " My left is: ", self.left, 
              " my right is: ", self.right)
