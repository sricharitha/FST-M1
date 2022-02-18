def sum(list):
    s = 0
    for num in list:
        s += num
    return s

list = [2,3,4,5,6]
res = sum(list)
print(res)