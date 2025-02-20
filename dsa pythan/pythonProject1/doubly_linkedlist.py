# YouTube Video: https://www.youtube.com/watch?v=8kptHdreaTA
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None


class DoublyLinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        if self.head is None:
            new_node = Node(data)
            new_node.prev = None
            self.head = new_node
        else:
            new_node = Node(data)
            cur = self.head
            while cur.next:
                cur = cur.next
            cur.next = new_node
            new_node.prev = cur
            new_node.next = None

    def prepend(self, data):
        if self.head is None:
            new_node = Node(data)
            new_node.prev = None
            self.head = new_node
        else:
            new_node = Node(data)
            self.head.prev = new_node
            new_node.next = self.head
            self.head = new_node
            new_node.prev = None

    def print_list(self):
        cur = self.head
        while cur:
            print(cur.data)
            cur = cur.next

    def add_after_node(self,key,data):
        cur = self.head
        while cur:
            if cur.next is None and cur.data == key:
                self.append(data)
                return
            elif cur.data == key:
                new_node = Node(data)
                nxt = cur.next
                cur.next = new_node
                new_node.next = nxt
                new_node.prev = cur
                nxt.prev = new_node
            cur = cur.next


    def add_before_node(self,key,data):
        cur = self.head
        while cur:
            if cur.prev is None and cur.data == key:
                self.prepend(data)
                return
            elif cur.data == key:
                new_node = Node(data)
                prev = cur.prev
                prev.next = new_node
                cur.prev = new_node
                new_node.next = cur
                new_node.prev = prev
            cur = cur.next

    def delete(self,key):
        cur = self.head
        while cur:
            if cur.data == key and cur == self.head:
            # case1
                if not cur.next:
                    cur = None
                    self.head = None
                    return
             # case2
                else:
                    nxt = cur.next
                    cur.next = None
                    cur.prev = None
                    cur = None
                    self.head = nxt
                    return

            elif cur.data == key:
                # case3
                if cur.next:
                    nxt = cur.next
                    prev = cur.prev
                    prev.next = nxt
                    nxt.prev = prev
                    cur.next = None
                    cur.prev = None
                    cur = None
                    return
                else:
                    prev = cur.prev
                    prev.next = None
                    cur.prev = None
                    cur = None
                    return
            cur = cur.next

    def reversed(self):
        tmp = None
        cur = self.head
        while cur:
            tmp = cur.prev
            cur.prev = cur.next
            cur.next = tmp
            cur = cur.prev
        if tmp:
            self.head = tmp.prev

    def delete_node(self, node):
        cur = self.head
        while cur:
            if cur == node and cur == self.head:
                # Case 1:
                if not cur.next:
                    cur = None
                    self.head = None
                    return

                # Case 2:
                else:
                    nxt = cur.next
                    cur.next = None
                    nxt.prev = None
                    cur = None
                    self.head = nxt
                    return

            elif cur == node:
                # Case 3:
                if cur.next:
                    nxt = cur.next
                    prev = cur.prev
                    prev.next = nxt
                    nxt.prev = prev
                    cur.next = None
                    cur.prev = None
                    cur = None
                    return

                # Case 4:
                else:
                    prev = cur.prev
                    prev.next = None
                    cur.prev = None
                    cur = None
                    return
            cur = cur.next

    def remove_duplicates(self):
        cur = self.head
        seen = dict()
        while cur:
            if cur.data not in seen:
                seen[cur.data] = 1
                cur = cur.next
            else:
                nxt = cur.next
                self.delete_node(cur)
                cur = nxt



    def pairs_with_sum(self, sum_val):
        pairs = list()
        p = self.head
        q = None
        while p:
            q = p.next
            while q:
                if p.data + q.data == sum_val:
                    pairs.append("(" + str(p.data) + "," + str(q.data) + ")")
                q = q.next
            p = p.next
        return pairs

# (1,2),(1,3),(1,4),(1,5)
# (2,3),(2.4),(2,5)
# (3,4),(3,5)
# (4,5)





dllist = DoublyLinkedList()

# dllist.append(1)
# dllist.append(2)
# dllist.append(3)
# dllist.append(4)
# dllist.print_list()

# dllist.prepend(1)
# dllist.prepend(2)
# dllist.prepend(3)
# dllist.prepend(4)
# dllist.print_list()

# dllist.append(1)
# dllist.append(2)
# dllist.append(3)
# dllist.append(4)
# dllist.add_after_node(1,11)
# dllist.add_after_node(2,12)
# dllist.add_after_node(4,13)
# dllist.print_list()

# dllist.append(1)
# dllist.append(2)
# dllist.append(3)
# dllist.append(4)
# dllist.add_before_node(1,11)
# dllist.add_before_node(2,12)
# dllist.print_list()

# dllist.append(1)
# dllist.append(2)
# dllist.append(3)
# dllist.append(4)
# dllist.append(5)
# dllist.append(6)
# dllist.delete(3)
# dllist.delete(1)
# dllist.delete(6)
# dllist.print_list()

# print("before the reverse the list")
# dllist.append(1)
# dllist.append(2)
# dllist.append(3)
# dllist.append(4)
# dllist.print_list()
# print("after reverse the list")
# dllist.reversed()
# dllist.print_list()

# print("before the reverse the list")
# dllist.prepend(1)
# dllist.prepend(2)
# dllist.prepend(3)
# dllist.prepend(4)
# dllist.print_list()
# print("after the reverse the list")
# dllist.reversed()
# dllist.print_list()

# dllist.append(1)
# dllist.append(2)
# dllist.append(2)
# dllist.append(3)
# dllist.append(3)
# dllist.append(4)
# dllist.append(5)
# dllist.append(6)
# dllist.append(6)
# dllist.append(7)
# dllist.append(8)
# dllist.append(9)
# dllist.append(9)
# dllist.append(10)
# dllist.print_list()
# print("after the remove dupllicat element")
# dllist.remove_duplicates()
# dllist.print_list()

dllist.append(1)
dllist.append(2)
dllist.append(3)
dllist.append(4)
dllist.append(5)
print(dllist.pairs_with_sum(1))
print(dllist.pairs_with_sum(2))
print(dllist.pairs_with_sum(3))
print(dllist.pairs_with_sum(4))
print(dllist.pairs_with_sum(5))
