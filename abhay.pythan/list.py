"""
num=[1,2,3,4,5,6,7]
print(num)
print(num[0])
print(num[1])
print(num[2])
print(num[-2])
print(num[-4])
print(num[-6])
print("second type is ")
for i in num:
  print(i)
animals=["cat","abhay","pankaj","aman","arun","lion","dog","rat"]
print(animals[3:5])
print(animals[-4:-2])
print(animals[4:])
print(animals[-4:])
print(animals[:6])
print(animals[:-3])
print(animals[::2])
print(animals[-4:-1:4])
print(animals[5:1:4])

color=["red","blue","yellow"]
color.append("green")
print(color)

color.insert(2, "white")
print(color) 

man=["abhay","aman","amit"]
woman=["rajat","asmita"]

man.extend(woman)
print(man) 

print(man+woman) 

colors=["red","aman","Recursion","reffg","hihvh","jvjjhjnj"]

color.pop(1)
print(colors)

color.remove("red")
print(colors)

del colors[2]
print(colors) 

colors.clear()
print(colors)

colors[1]="white"
print(colors) 

colors[2:4]=["abhay","aman"]
print(colors) 

colorswith_o=[item for item in color if "o" in item]
print(colorswith_o) """

num=["abhay","zebra","pankaj","brijesh","choti","dog"]
'''num.sort()
print(num)'''

num2=[4,6,3,6,2,13,5,78,4]
'''num2.sort()
print(num2)'''
'''
num.sort(reverse=True)
print(num)

num2.sort(reverse=True)
print(num2)

num.reverse()
print(num)

num2.reverse()
print(num2)

print(num.index("pankaj"))
print(num2.index(13)) 

print(num.count("pankaj"))
print(num2.count(4))'''

num1=num2.copy()
print(num2)
print(num1)
