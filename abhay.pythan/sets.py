"""
info={"abhay",19,False,5.6,35}
print(info)
for i in info:
    print(i)
    
info.add("pankaj")
print(info)

citys={"tokoiyo","lamdon","berlin","delhhi"}
cityes2={"ahay","pankaj","amit","arun","kumar"}

citys.update(cityes2)
print(citys)

citys.remove("tokoiyo")
print(citys)

citys.discard("lamdon")
print(citys)

item=citys.pop()
print(item)
print(citys)

del citys
print(citys)     # it show's error 

citys.clear()
print(citys)

if "amit" in cityes2:
    print("amit is present")
else:
    print("amit not present")"""
    
list1={"abhay","pankaj","arun","ali","schin","vishal"}
list2={"pankaj","ali","asmit","arun","anupam"}
"""
list1.update(list2)
print(list1)   

list3=list1.union(list2)
print(list3)

list3=list1.intersection(list2)
print(list3)

list1.intersection_update(list2)
print(list1)

list1.symmetric_difference(list2)
print(list1)

list1.symmetric_difference_update(list2)
print(list1)

list3=list1.difference(list2)
print(list3)

print(list1.isdisjoint(list2))
print(list1.issuperset(list2))
print(list1.issubset(list2))"""

