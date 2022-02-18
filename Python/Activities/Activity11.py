fruits = {"apple": 25,
            "mango": 30,
            "grapes": 15,
            "banana": 10}
check = input("Enter a fruit:").lower()
if check in fruits.keys():
    print("Available")
else:
    print("Not Available")