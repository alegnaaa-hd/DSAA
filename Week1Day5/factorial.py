# DSAA Week 1 Day 5, 7/18/2024

# //////// factorials ////////
def fact(n):

    if n < 0:
        print ("Can't do it")
    
    elif n == 0 or n == 1:
        return 1
    
    else: 
        return n * fact(n-1)

# factorials but a for loop
def fact_f_loop(n):
    if n < 0:
        n = n * (-1)
    
    result = 1
    for i in range(2, n + 1):
        result = result * i
        
    return result

# //////// 1 + 2 + ... + n-1 + n ////////

""" Franklin's idea
def sum(n):
    if n < 0: 
        return sum(n * (-1))
    
    elif n == 0:
        return 0
    
    else:
        return n + sum(n-1)
"""

# Kaylin's idea
def sum(n):
    if n < 0:
        return n + sum(n + 1)

    elif n > 0:
        return n + sum(n - 1)
    
    else:
        return 0
    