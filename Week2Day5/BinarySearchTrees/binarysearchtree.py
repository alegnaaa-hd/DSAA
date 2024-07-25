# DSAA Week 2 Day 5, 7/25/2024

from Week2Day5.BinarySearchTrees.Node import Node

class BST:

    # a BST needs:
        # a root, methods / behaviors that help manage
        # the tree. for instance: a mthod to insert a 
            # new node into the tree 
        # - a method to search for the node within a 
            # particular key

    def __init__ (self):
        self.root = None
    
    def insert(self, new_key):
        
        self.root = self.insert(self.root, new_key)

    def insert(self, node, new_key):

        if node == None:
            node = Node(new_key)
            return node
        
        else:
            if new_key < node.key:
                node.left = self.insert(node.left, new_key)
            elif new_key > node.key:
                node.right = self.insert(node.right, new_key)
        