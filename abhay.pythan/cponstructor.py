"""
class person:
    name = "abhay"
    occupation = "software dewaloper"
    def info(self):
        print(f"{self.name} is a {self.occupation}")
        
a=person()
a.name = "pankaj"   
a.occupation = "hr"
a.info()   """

 # constructor  
class Person:

  def __init__(self, name, occ):
    print("Hey I am a person")
    self.name = name
    self.occ = occ

  def info(self):
    print(f"{self.name} is a {self.occ}")


a = Person("Harry", "Developer")
b = Person("Divya", "HR") 
a.info()
b.info()
print(a.name)
print(a.occ)