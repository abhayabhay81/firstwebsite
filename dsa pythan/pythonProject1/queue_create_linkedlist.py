class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.front = None
        self.rear = None
        self.item_count = 0

    def is_empty(self):
        return self.front == None

    def print_list(self):
        cur_node = self.front
        while cur_node:
            print(cur_node.data)
            cur_node = cur_node.next

    def inp_queue(self, data):
        new_node = Node(data)
        if self.is_empty():
            self.front = new_node
            self.rear = new_node
        else:
            self.rear.next = new_node
        self.rear  = new_node
        self.item_count += 1

    def del_queue(self):
        if self.is_empty():
            raise  IndexError("empty queue")
        elif self.front ==  self.rear:
            self.front = None
            self.rear = None
        else:
            self.front = self.front.next
        self.item_count -= 1

    def get_front(self):
        if self.is_empty():
            raise IndexError("no data in the queue")
        else:
            return self.front.data

    def get_rear(self):
        if self.is_empty():
            raise IndexError("no data in the queue")
        else:
            return self.rear.data

    def size(self):
        return  self.item_count



list = LinkedList()

list.inp_queue(1)
list.inp_queue(2)
list.inp_queue(3)
list.inp_queue(4)
list.inp_queue(5)
list.print_list()
print(list.is_empty())
print(list.size())
# list.del_queue()
# list.print_list()
print(list.get_rear())
print(list.get_front())
