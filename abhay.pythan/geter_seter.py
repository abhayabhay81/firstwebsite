class person:
    def __init__(self,value):
        self._value = value
        
    def show (self):
        print(f"value is {self._value}")
        
    @property    #getter
    def values(self):
        return self._value*10
    
    @values.setter
    def values(self, new_value):
        self._value = new_value/10
    
obj = person(10)
obj.show()
print(obj.values)
obj.show()