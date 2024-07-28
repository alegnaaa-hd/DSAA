# DSAA Week 2 Day 5, 7/25/2024

from Node import Node

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
        
        # check if root is none
        if self.root == None:
            self.root = Node(new_key)
            return
        
        temp_node = self.root
        found_location = False
        while not(found_location):
            if temp_node == None:
                print ("Never supposed to happen")
                break

            elif temp_node.key == new_key:
                print ("Cannot insert duplicate key")
                break

            elif new_key < temp_node.key:
                # check that temp_node.left is None
                # if it is, we insert to left of node
                if temp_node.left == None:
                    temp_node.left = Node(new_key)
                    found_location = True
                    break

                else:
                    temp_node = temp_node.left

            elif new_key > temp_node.key:
                if temp_node.right == None:
                    temp_node.right = Node(new_key)
                    found_location = True
                    break

                else:
                    temp_node = temp_node.right
                



    def insert(self, node, new_key):

        if node == None:
            node = Node(new_key)
            return node
        
        else:
            if new_key < node.key:
                node.left = self.insert(node.left, new_key)
            elif new_key > node.key:
                node.right = self.insert(node.right, new_key)
        