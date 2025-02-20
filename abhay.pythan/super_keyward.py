"""
class parent:
    def parent_method(self):
        print("this is the parent method")
        
class childclass(parent):
    def parentmethod(self):
            print("harry")
            super().parent_method()
            
    def child_method(self):
        print("this is the child method")
        super().parent_method()
        
child_object = childclass()
child_object.child_method() 
child_object.parent_method()"""

class employee:
    def __init__(self,name,id):
        self.name = name
        self.id = id
        
class progremmer(employee):
    def __init__(self,name,id,lang):
        super().__init__(name,id)
        self.lang = lang
        
abhay = employee("abhay", 765)
rohan = progremmer("rohan", 654,"ptthan")        
