class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class circularlinkedlist:
    def __init__(self):
        self.head = None

    def prepend(self,data):
        new_node = Node(data)
        cur = self.head
        new_node.next = self.head
        if not self.head:
            new_node.next = new_node
        else:
            while cur.next != self.head:
                cur = cur.next
            cur.next = new_node
        self.head = new_node


    def append(self,data):
        if not self.head:
            self.head =Node(data)
            self.head.next = self.head
        else:
            new_node = Node(data)
            cur = self.head
            while cur.next != self.head:
                cur = cur.next
            cur.next = new_node
            new_node.next = self.head

    def print_list(self):
        cur = self.head

        while cur:
            print(cur.data)
            cur = cur.next
            if cur == self.head:
                break

    def print_list(self):
        cur = self.head
        while cur:
            print(cur.data)
            cur = cur.next
            if cur == self.head:
                break

    def remove(self, key):
        if self.head.next == self.head and self.head.data == key:
            self.head = None
            return
        if self.head.data == key:
            cur = self.head
            while cur.next != self.head:
                cur = cur.next
            cur.next = self.head.next
            self.head = self.head.next
        else:
            cur = self.head
            prev = None
            while cur.next != self.head:
                prev = cur
                cur = cur.next
                if cur.data == key:
                    prev.next = cur.next
                    cur = cur.next

    def split_list(self):
        size = len(self)

        if size == 0:
            return None
        if size == 1:
            return self.head

        mid = size // 2
        count = 0

        prev = None
        cur = self.head

        while cur and count < mid:
            count += 1
            prev = cur
            cur = cur.next
        prev.next = self.head

        split_cllist = circularlinkedlist()
        while cur.next != self.head:
            split_cllist.append(cur.data)
            cur = cur.next
        split_cllist.append(cur.data)

        self.print_list()
        print("\n")
        split_cllist.print_list()


list = circularlinkedlist()

print("before the deletion of list")
list.append(1)
list.append(2)
list.append(3)
list.append(4)
list.print_list()
print("before the removing the list")
list.remove(3)
list.print_list()

