"""
class employee:
    def __init__(self,name):
        self.name = name
        
    def show(self):
        print(f"the name is {self.name}")
        
class dancer:
    def __init__(self,dance):
        self.dance = dance
        
    def show(self):
        print(f"the dancer is {self.dance}")
        
class danceremployee(employee,dancer):
    def __init__(self,dance, name):
        self.dance = dance
        self.name = name
        
        
o = danceremployee("kathak","abhay")
print(o.name)
print(o.dance)
o.show()
print(danceremployee.mro())
o.show()

"""
# mulilevel inheritance
       
class Animal:
    def __init__(self, name, species):
        self.name = name
        self.species = species
        
    def show_details(self):
        print(f"Name: {self.name}")
        print(f"Species: {self.species}")
        
class Dog(Animal):
    def __init__(self, name, breed):
        Animal.__init__(self, name, species="Dog")
        self.breed = breed
        
    def show_details(self):
        Animal.show_details(self)
        print(f"Breed: {self.breed}")
        
class GoldenRetriever(Dog):
    def __init__(self, name, color):
        Dog.__init__(self, name, breed="Golden Retriever")
        self.color = color
        
    def show_details(self):
        Dog.show_details(self)
        print(f"Color: {self.color}")

o = Dog("tommy", "Black")
o.show_details()
        
print(GoldenRetriever.mro())


