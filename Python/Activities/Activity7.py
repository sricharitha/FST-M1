list = list(input("Enter the nums to add: ").split(","))
sum = 0
for n in list:
    sum += int(n)
print(sum)