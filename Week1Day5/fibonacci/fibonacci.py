# DSAA Week 1 Day 5, 7/18/2024

# fibonacci sequence 

# this program is bugged its not workign idk why
def fibonacci(n):
    if n == 0 or 1:
        if n == 0:
            return 0

        else:
            return 1
    
    else:
        return fibonacci(n-1) + fibonacci(n-2)

s = fibonacci(5)
print (s)