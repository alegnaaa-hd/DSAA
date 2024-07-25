# DSAA Week 2 Day 5, 7/15/2024

from Week2Day5.BinarySearchTrees.Node import Node

my_root = None

twelve = Node(12)
thirty = Node(30)
my_root_left = twelve
my_root_right = thirty
tw1 = Node(21)
print (f"Node(12): {twelve}")
print (f"Node(30): {thirty}")
print (f"my_root_left: {my_root_left}")
print (f"my_root_right: {my_root_right}")
my_root = tw1
print (f"my_root: {my_root}")

"""
my_root = Node(6)
my_root.left = Node(3)
my_root.right = Node(9)

# insert 2
my_root.left.left = Node(2)

# newly inserted key 
print (my_root.left.left.key)

# insert 1
my_root.left.left.left = Node(1)

# insert 0
my_root.left.left.left.left = Node(0)
"""
