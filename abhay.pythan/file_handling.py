"""
a=open('myfile.py','r')   # open('myfile.py')
print(a)             
text = a.read()
print(text)
a.close()

#a=open('myfile2.py','w')  # this function use to create new file
        # file function is not exiext if this function is exiest so this is shown and all conteent of
        # file is deleted
        
        # rb = this is use for open binary content
        
     #   writing mode
f= open('myfile2.py','w')
f= open('myfile2.py','a')
f.write("my name is pankaj")
f.close()  
    
with open('myfile.py','a') as f:
   f.write("hey ia m bj")   
   
f=open('myfile2.py','r')
while(True):
    line = f.readline()
    print(line)
    if not line:
      #print(line,type(line))
      break
      print(line)  
      
f=open('myfile2.py','w')
lines= ['line 1/n','line 1/n','line 1/n']    
f.writelines(lines)
f.close()  
     
      
#seek() and tell()  

with open('myfile2.py','r') as f:
    print(type(f))
    f.seek(10)  #move to the 10th byte in the file
    data=f.read(5)  # read the  next 5 byte
    print(data)
    print(f.tell()) #this is show the value the function is seek the value 
      """
with open('myfile2.py','w') as f:
    f.write('hello world')
    f.truncate(7)
    
with open('myfile2.py','r') as f:
    print(f.read())
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      

