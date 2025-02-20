"""class math:
    def __init__(self, num):
        self.num = num
        
    def addtonum(self, n):
        self.num = self.num + n
        
    @staticmethod
    def add(a, b):
        return a+b
    
a=math(5)
print(a.num)
a.addtonum(7)
print(a.num)

print(math.add(7,4))"""

class employee:
    companyname = "apple"
    def __init__(self, name):
        self.name = name
        self.riseamount = 98
        
    def show(self):
        print(f"the name of the employee id {self.name} and amount is {self.riseamount} and company name is {self.companyname}")
        
emp1 = employee("abhay")
#employee.show(emp1)
emp1.riseamount = 64.66
emp1.companyname = "apple india"
emp1.show()
emp2 = employee("rohan")
emp2.show()