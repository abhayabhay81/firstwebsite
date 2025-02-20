   # [1,2,3,4,5]
   # rear = (insertion) 5
   # front = (deletion) 1

class Deque:
    def __init__(self):
        self.items = []

    def is_empty(self):
        return len(self.items) == 0

    def insert_front(self,data):
        self.items.insert(0,data)

    def insert_rear(self,data):
        self.items.append(data)

    def delete_front(self):
        if self.is_empty():
            raise IndexError("deque is empty")
        else:
            self.items.pop(0)

    def delete_rear(self):
        if self.is_empty():
            raise IndexError("deque is empty")
        else:
            self.items.pop()

    def get_front(self):
        if self.is_empty():
            raise IndexError("deque is empty")
        else:
            return self.items[0]

    def get_rear(self):
        if self.is_empty():
            raise IndexError("deque is empty")
        else:
            return self.items[-1]

    def size(self):
        return  len(self.items)

    def printit(self):
        return self.items

list = Deque()
list.insert_front(1)
list.insert_front(2)
print(list.printit())

list.insert_rear(1)
list.insert_rear(2)
print(list.printit())
