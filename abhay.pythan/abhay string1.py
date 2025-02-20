"""
str="my name is abhay"
print(str)
print(len(str))
print(str.upper())
print(str.lower())
print(str.capitalize())
print(str.casefold())
print(str.count(str,5,16))
print(str[6])
print(str[:8])
print(str[-4:-2])
print(str[2:6])
for i in str:
    print(i)
print(str.strip())

str3="hello !!!!!!"
print(str3)
print(str3.rstrip("!"))
print(str.replace("abhay","aman"))
print(str.split(" "))
print(str.center(50))
print(str.center(50,"."))
print(str.count("a"))
print(str.endswith("abhay"))
print(str.endswith("is",4,10))
print(str.find("is"))
print(str.index("abhay"))
print(str.isalnum())
print(str.isalpha())
print(str.islower())
print(str.isupper())
print(str.isprintable())
print(str.isspace())
print(str.istitle())
print(str.startswith("my"))
print(str.swapcase())    """

name="abhay"
age=67
statement="my name is {} and my age is {}"
print(statement.format(name, age))

quntity=76
fruit="banana"
cost="8700"
str2="the cost of {} fruit {} is and quantity is {}"
print(str2.format(cost,fruit,quntity))
print(str2.format(quntity,cost,fruit))

str4="this is an\t amezing \"project\" this is\b prepared\n by me \'without\' any other help and my collage\\ name is dr rizvi collge of engeenring "
print(str4)










