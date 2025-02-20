class Node:
    def __init__(self,item = None,priority = None,next = None):
        self.data = item
        self.priority = priority
        self.next = next

class Priority:
    def __init__(self):
        self.start = None
        self.item_count = 0

    def push(self,data,priority):
        new_node = Node(data,priority)
        if not self.start or priority < self.start.priority:
            new_node.next = self.start
            self.start = new_node
        else:
            temp = self.start
            while temp.next and temp.next.priority <= priority:
                temp = temp.next
            new_node.next = temp.next
            temp.next = new_node
        self.item_count += 1

    def is_empty(self):
        return self.start == None

    def pop(self):
        if self.is_empty():
            raise IndexError("perioty queue is empty")
        data = self.start.data
        self.start = self.start.next
        self.item_count -= 1
        return data

    def size(self):
        return self.item_count

p = Priority()
p.push("abhay",2)
p.push("amna",12)
p.push("amit",9)
p.push("arjun",18)
p.push("shiva",5)

while not p.is_empty():
    print(p.pop())
