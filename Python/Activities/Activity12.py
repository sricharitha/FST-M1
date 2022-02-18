
def add_recursive(n):
    if n:
        return n + add_recursive(n-1)
    else:
        return 0

sum = add_recursive(11)
print(sum)