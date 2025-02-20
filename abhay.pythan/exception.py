"""
# this is the program for multiplication
a=int(input("enter the number"))
for i in range(1,11):
 # print("{int (a)}x {i}={int(a)*i}")
  print(f"{int (a)}x {i}={int(a)*i}")
 
    
a=input("enter the value of a ")
print("the value of arry is ")
try:
    for i in range(1,11):
     print(f"{int (a)}x {i}={int(a)*i}")
except:
    print("envalid input try again : ",a) 
    
    
try:
    num=int(input("enter an integer"))
    a=[6,3]
    print(a[num])
except ValueError:
    print("entered number not an integers ")
except IndexError:
    print("index error") 

       
def fun():
    l=[1,8,4,6]
    i=int(input("enter the index"))
    print(l[i])
    return 1

x=fun()
print(x)


def fun1():
    try:
        l=[1,8,4,6]
        i=int(input("enter the index"))
        print(l[i])
        return 1
    except:
        print("some error accured")
        return 0
    finally:
        print("i  am always executed")
        
x=fun1()
print(x) 

#costum error
a=int(input("enter the value between 5 to 9"))
if(a<5 or a>9):
    raise ValueError("value should be between 5 to 9") """
    
def num1():
    a=input("enter data ")
    if (a=="quit"):
        print("quit is call")
    else  : 
     raise ValueError("invalid input",a)            
    
num1()    