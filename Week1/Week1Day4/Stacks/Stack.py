# DSAA Week 1 Day 4, 7/17/2024

class Stack:

    def __init__(self):
        self.count = 0
        self.maximum_size = 4
        self.current_size = 0
        self.list = []
        # first index that is available
        self.index_available = 0
    
    # see if stack is full 
    def is_stack_full(self):
        if self.current_size == self.maximum_size:
            return True
        
        else:
            return False
    
    # see if stack is empty 
    def is_stack_empty(self):
        if self.current_size == 0:
            return True
        
        else:
            return False
    
    # pushing a new item into the list 
    def push(self, item):
        # if stack full
        if self.is_stack_full():
            print ("Stack is full")
            return 
        
        # if stack is not full, increment size and index
        self.list[self.index_available] = item
        self.index_available += 1
        self.current_size += 1
    
    # popping out a item from the list 
    def pop(self, item):
        # you can't pop anything if the stack is empty 
        if self.is_stack_empty():
            print ("Stack is empty. Cannot pop")
        
        # if something is there decrease the index 
        else:
            item_to_pop = self.list[self.index_available-1]
            self.index_available -= 1
            return item_to_pop
        