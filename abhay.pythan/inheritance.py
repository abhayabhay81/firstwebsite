"""class employee:
    def __init__(self,Name,id):
        self.Name = Name
        self.id = id
        
    def show(self):
        print(f"the name of employee : {self.id} is {self.Name}")

class programer(employee):
    def language(self):
        print("the detail langauge is python")
        
        
a=employee("abhay", 676)
a.show()
b=programer("pankaj",767)
b.language()  """

class student:
    def __init__(self):
        self._name = "abhay"
        
    def _funname(self):
        return "codewithabhay"
    
class subject(student):
    pass

obj = student()
obj1 = subject()
print(dir(obj))

print(obj._name)
print(obj._funname())

print(obj1._name)
print(obj1._funname())
