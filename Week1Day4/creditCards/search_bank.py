# DSAA Week 1 Day 4, 7/17/2024

from BenDavid_Bank import Bank
from credit_card import CreditCard

carlisle_PA_branch = Bank()

new_customer_answer = ""
loop = 0
while loop == 0:
    
    # ask user for input
    print ("Enter 'NC' for a new card")
    print ("Enter 'SC' to search credit card by customer's name")
    print ("Enter 'DS' to dislay all bank cards")
    print ("Enter 'TE' to terminate the system: ") 
    new_customer_answer = str(input("Your choice: "))


    if new_customer_answer == "TE":
        loop == 1
        break

    elif new_customer_answer[0:2] == "NC":

        carlisle_PA_branch.get_name_generate_card()

    elif new_customer_answer[0:2] == "SC":
        customer_name_to_search = str(input("Enter the customer's name to search for: "))
        card_found = carlisle_PA_branch.search_customer_name(customer_name=customer_name_to_search)
        if card_found != None:
            card_found.display_card_infos()

    elif new_customer_answer[0:2] == "DS":
        carlisle_PA_branch.display_all_cards()

    else:
        print ("That is not a valid input")