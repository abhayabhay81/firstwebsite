
"""def greet (fx):
    def mfx():
        print(" good mornning ")
        fx()
        print("thanks for using this function")
    return mfx

@greet
def Hello():
   print("hello world")

Hello()
@greet
def sum ():  
   print("my name is abhay")

sum()"""

def abhay(fx):
     def kabhay(*a,**b):
         print("hey good morning ")
         fx(*a,**b)
         print("thank for using this program")
     return kabhay

@abhay
def hello(a,b):
 print(a+b)    
 
 
hello(3,5)