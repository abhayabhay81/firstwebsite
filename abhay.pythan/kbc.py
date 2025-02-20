j=1
while(j<4):
   
  for i in range(2):
    print(f" \n Q:{i+j} you favourit programing language in your life")
    print("  1-java    2-python ")
    print("  3-c++     4-html ")
    a = input("you choose this option\t")
    c=(i+1)*j
    if a == '3':
     print("you wone this question",c*1000)
    else:
     print("you lost your math your balace is ",c*1000)
  b=input("you want to play so you input 1 or you want to exit \t")
  if b =='0':
   print("your blance is ",c*1000)
   break
  else:
   print(" \n1 best for luck")
   j=j+2 
    