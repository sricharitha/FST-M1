tup = tuple(input("Enter nums: ").split(","))
print(tup)
for n in tup:
    if int(n) % 5 == 0:
        print(n)