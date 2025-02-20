import time
def usingwhile():
    i = 0 
    while i<200:
        i = i + 1
        print(i)
        
def usingfor():
    for i in range(200):
        print(i)

#init = time.time()        
#usingfor()
#t1=time.time()-init
#print(t1)
#usingwhile()
#print(time.time()-init)

print(4)
time.sleep(3)
print("my name is abhay")

t= time.localtime()
#print(t)
formatted = time.strftime("%y-%m-%d %H:%M:%S",t)
print(formatted)
