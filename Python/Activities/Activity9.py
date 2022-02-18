odd_list = [1, 2, 3, 4]
even_list = [5, 6, 7, 8]

list = []

for n in odd_list:
    if (n % 2) != 0:
        list.append(n)
for n in even_list:
    if (n % 2) == 0:
        list.append(n)
print(list)