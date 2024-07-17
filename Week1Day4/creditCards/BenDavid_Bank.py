# DSAA Week 1 Day 4, 7/17/2024

from credit_card import CreditCard

import random
from datetime import datetime, timedelta

class Bank:
    def __init__ (self):
        self.firstcard = None
        self.card_issuers = ["VISA", "DISCOVER", "MASTERCARD", "CAPITAL ONE BANK"]
        
    def add_new_card(self, new_card):
        
        if self.firstcard == None:
            self.firstcard = new_card
            
        
        else:
            temp_card = self.firstcard
            
            while temp_card.next != None:
                temp_card = temp_card.next

            temp_card.next = new_card
            # (OPTIONAL): new_card.next = None  

    def search_customer_name (self, customer_name): 
        head_card = self.firstcard

        if head_card == None:
            print("Customer not found")
            return None
        
        else:
            customer_name = str(customer_name).lower()
            while head_card != None: 
                current_name = str(head_card.name).lower()
            
                if current_name == customer_name:
                    # customer is found
                    return head_card
                
                else: 
                    head_card = head_card.next

            print ("Could not find the customer")
            return None

    def get_name_generate_card (self):
        
        min_card_no = 1000000000
        max_card_no = 10000000000

        # adds a new customer to banking system
        customer_name = input("What is your name: ")

        card_no = random.randrange(min_card_no, max_card_no)
        todays_date = datetime.now()
        future_date_3yrs = todays_date + timedelta(days = 1095)
        exp_date = future_date_3yrs
        cvv = random.randrange(100, 1000)
        card_issuer_index = random.randrange(0, len(self.card_issuers))
        type = self.card_issuers[card_issuer_index]
        credit_limit = float(random.randrange(1000, 10001))

        # create new credit card 
        new_card = CreditCard()
        new_card.card_no = card_no
        new_card.name = customer_name
        new_card.exp_date = exp_date
        new_card.cvv = cvv
        new_card.type = type
        new_card.credit_limit = credit_limit

        self.add_new_card(new_card=new_card)
        return new_card
    
    def display_all_cards(self):
        card = self.firstcard
        if self.firstcard == None:
            print("Bank has no credit cards at the oment")
            return
        
        while card != None:
            card.display_card_infos()
            card = card.next