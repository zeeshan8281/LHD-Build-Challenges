
n = int(input("Enter the size of number"))
print("Enter number one by one")
i=0
a = []

for i in range(0,n):

    x=int(input())
    a.append(x)


a.sort()
print(a)