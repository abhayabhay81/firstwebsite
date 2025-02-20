class Node:
    def __init__(self,data):
        self.data = data
        self.prev = None
        self.next = None

class Deque:
    def __init__(self):
        self.front = None
        self.rear = None
        self.item_count = 0

    def is_empty(self):
        return self.item_count == 0

    def insert_front(self,item):
        new_node = Node(item)
        if self.is_empty():
            self.rear = new_node
        else:
            self.rear = new_node
        self.front = new_node
        self.item_count += 1

    def insert_rear(self,item):
        new_node = Node(item)
        if self.is_empty():
            self.front = new_node
        else:
            self.rear.next = new_node
        self.rear = new_node
        self.item_count += 1

    def delete_front(self):
        if self.is_empty():
            raise IndexError("deque is empty")
        if self.front == self.rear:
            self.front = None
            self.rear = None
        else:
            self.front = self.front.next
            self.front.prev = None
        self.item_count -= 1

    def delete_rear(self):
        if self.is_empty():
            raise IndexError("deque is empty")
        if self.front == self.rear:
            self.front = None
            self.rear = None
        else:
            self.front = self.front.next
            self.rear.next = None
        self.item_count -= 1

    def get_front(self):
        if self.is_empty():
            raise IndexError("deqque is empty")
        return self.front.data

    def get_rear(self):
        if self.is_empty():
            raise IndexError("deqque is empty")
        return self.rear.data

    def size(self):
        return self.item_count


list = Deque()

list.insert_rear(1)
list.insert_rear(2)
list.insert_rear(3)

list.insert_front(11)
print(list.get_front(),list.get_rear())
list.insert_front(12)
print(list.get_front(),list.get_rear())
list.insert_front(13)
print(list.get_front(),list.get_rear())


