print("Welcome to Rock-Paper-Scissors!!!")

Player1 = input("Enter your name:")
Player2 = input("Enter your name:")
while True:

    Player1_input = input("Choose between Rock Paper Scissors:").lower()
    Player2_input = input("Choose between Rock Paper Scissors:").lower()

    if Player1_input == Player2_input:
        print("Its a tie.")
    elif Player1_input == "rock":
        if Player2_input == "scissors":
            print(Player1 + " wins")
        else:
            print(Player2 + " wins")
    elif Player1_input == "paper":
        if Player2_input == "rock":
            print(Player1 + " wins")
        else:
            print(Player2 + " wins")
    elif Player1_input == "scissors":
        if Player2_input == "rock":
            print(Player2 + " wins")
        else:
            print(Player1 + " wins")

    repeat = input("Do you want to continue the game. Please provide yes/no:").lower()
    if repeat == "yes":
        pass
    elif repeat == "no":
        SystemExit
    else:
        print("Invalid input")
        SystemExit
