def Natural_number(n):
    if n == 1:
        return 1
    else:
        return n+Natural_number(n-1)

def odd_number_first(n):
    if n == 1:
        return 1
    else:
        return (2*n-1)+odd_number_first(n-1)
def even_number_first(n):
    if n == 1:
        return 2
    else:
        return 2*n + even_number_first(n-1)

def natureal_number(n):
    if n>0:
        natureal_number(n-1)
        print(n,end=" ")
def reverse_natureal(n):
    if n>0:
        print(n,end=" ")
        reverse_natureal(n-1)

def odd_number(n):
    if n>0:
        odd_number(n-1)
        print(2*n-1,end=" ")

def even_number(n):
    if n>0:
        odd_number(n-1)
        print(2*n,end=" ")

def odd_number_reverse(n):
    if n>0:
        print(2*n-1)
        odd_number_reverse(n-1)

def even_number_reverse(n):
    if n>0:
        print(2*n,end=' ')
        even_number_reverse(n-1)

def factorial(n):
    if n==0:
        return 1
    else:
        return n*factorial(n-1)

def squresum(n):
    if n==1 :
        return 1
    else:
        return n*n + squresum(n-1)

#print(Natural_number(5))
#odd_number_reverse(10)
#even_number_reverse(10)
print(odd_number_first(10))
print(even_number_first(10))
print(squresum(4))