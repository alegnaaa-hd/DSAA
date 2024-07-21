# DSAA Week 1 Day 4, 7/17/2024

from BenDavid_Bank import Bank

carlisle_PA_branch = Bank()

new_customer_answer = ""
loop = 0
while loop == 0:
    
    # ask user for input
    print ("Do you want to add a new customer's card to the bank?")

    print ("Enter 'yes' to add a new card: ")
    print ("Enter 'no' to exit the system: ") 
    new_customer_answer = str(input("Your choice: "))

    if new_customer_answer == "no":
        loop == 1
        break

    elif new_customer_answer == "yes":
        # convert string to lowercase 
        new_customer_answer = new_customer_answer.lower()
        new_customer_answer = new_customer_answer[0]

        carlisle_PA_branch.get_name_generate_card()
        carlisle_PA_branch.display_all_cards()

    else:
        print ("That is not a valid input")