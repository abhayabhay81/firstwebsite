"""class employee:
    company = "apple"
    def show(self):
        print(f"the name is {self.name} and company is {self.company}")
    
    @classmethod
    def chande(cls,newcompany):
        cls.company = newcompany
        
e1 = employee()
e1.name = "abhay"
e1.show()
e1.chande("tesala")
e1.show()
print(employee.company)"""

#class method of alternatave constructor
"""
class employee:
    def __init__(self,name,salary):
      self.name = name
      self.salary = salary
   
    @classmethod
    def fromStr(cls, string):
      return cls(string.split("-")[0], int(string.split("-")[1]))
   
string = "abhay-120000"
emp = employee.fromStr(string) 
print(emp.name)
print(emp.salary)     """

class person:
    def __init__(self,name,age):
        self.name = name
        self.age = age
        
    @classmethod   
    def formstr(stc,string):
        name,age = string.split(',')
        return stc(name, int(age))
    
per = person.formstr("abhay kumar,89")
print(per.name, per.age)