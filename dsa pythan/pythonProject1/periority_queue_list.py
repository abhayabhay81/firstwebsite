class Periorityqueue:
    def __init__(self):
        self.items = []

    def push(self,data,priorty):
        index = 0
        while index < len(self.items) and self.items[index][1] <= priorty:
             index += 1
        self.items.insert(index,(data,priorty))

    def is_empty(self):
        return len(self.items) == 0

    def pop(self):
        if self.is_empty():
            raise IndexError("priority queeue is empty")
        return self.items.pop(0)[0]

    def size(self):
        return len(self.items)


p = Periorityqueue()
p.push("abhay",2)
p.push("amna",12)
p.push("amit",9)
p.push("arjun",1)
p.push("shiva",5)

while not p.is_empty():
    print(p.pop())