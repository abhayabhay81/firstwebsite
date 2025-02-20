#dir
"""
x=(1,2,3)
print(dir(x))
print(x.__add__)"""

# dict 
class person:
    def __init__(self,name,age):
        self.name = name
        self.age = age
        self.version = 1
        
        
        
per = person("abhay",76)
print(per.__dict__)

#help

print(help(person))