from LinkedList import LinkedList
from Node import Node

def main():

    """ FLOWER LIST
    flowers = LinkedList()
    flowers.insert(Node("Rose"))
    flowers.insert(Node("Sun Flower"))
    flowers.insert(Node("Tulip"))
    flowers.display() # should display 3 flowers above
    flowers.insert(Node("Orchid"))
    flowers.insert(Node("Lily"))
    flowers.insert(Node("Daisy"))
    flowers.display() # should display all 6 flowers above
    flowers.insert(Node("Cherry Blossom"))
    flowers.insert(Node("Iris"))
    flowers.insert(Node("Peony"))
    flowers.insert(Node("Marigold"))
    flowers.display() # should display all 10 flowers above
    """
    # SONGS LIST
    """
    songs = LinkedList()
    songs.insert(Node("How to go"))
    songs.insert(Node("To hell and back"))
    songs.insert(Node("My way"))
    songs.insert(Node("Say my name"))

    songs.display
    """

    songs = LinkedList()
    user_choice = ""
    FINISHED = False
    while(not(FINISHED)):

        print("1. Add a song")
        print("2. Display the list of songs")
        print("3. Display the number of songs")
        print("4. Delete a song")
        print("9. Exit")

        user_choice = int(input("Enter a menu choice: "))

        if user_choice == 1:
            song_title = input("Enter the title of the new song to add: ")
            new_song_object = Node(song_title)
            songs.insert(new_song_object)

        elif user_choice == 2:
            songs.display()

        elif user_choice == 3:
            print("You have ", songs.item_counts(), " songs in your album")

        elif user_choice == 4:
            title_to_delete = input("Enter the title of the song to delete: ")
            title_to_delete = title_to_delete.lower()
            songs.delete(title_to_delete)

            #######################

        elif user_choice == 9:
            print("You are exiting the program. byebye")
            FINISHED = True

        else:
            print("We can't find that choice on the menu")

main()
