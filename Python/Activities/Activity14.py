length = int(input("Enter number of fib numbers: "))

def Fib(num):
    if num <=1:
        return num
    else:
        return Fib(num-1) + Fib(num-2)

for i in range(1,length+1):
    print(Fib(i))

