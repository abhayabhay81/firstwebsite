class Queue:
    def __init__(self):
        self.items = []

    def is_empty(self):
        return len(self.items) == 0

    def inp_queue(self,data):
        self.items.append(data)

    def del_queue(self):
        if not self.is_empty():
            self.items.pop()
        else:
            raise IndexError("queue underflow")

    def get_front(self):
        if not self.is_empty():
            return self.items[0]
        else:
            raise IndexError("queue underflow")

    def get_rear(self):
        if not self.is_empty():
            return self.items[-1]
        else:
            raise IndexError("queue underflow")

    def size(self):
        return len(self.items)

    def get_stack(self):
        return  self.items


qu = Queue()
qu.inp_queue(1)
qu.inp_queue(2)
qu.inp_queue(3)
qu.inp_queue(4)
qu.inp_queue(5)
qu.inp_queue(6)
print(qu.get_stack())
print(qu.is_empty())
qu.del_queue()
print(qu.get_stack())
print(qu.get_front())
print(qu.get_rear())
print(qu.size())
