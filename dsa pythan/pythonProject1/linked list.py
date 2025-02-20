class Node:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

class LinkedList:
    def __init__(self):
        self.head = None

    def insert_at_begining(self, data):
        node = Node(data, self.head)
        self.head = node

    # def print(self):
    #     if self.head is None:
    #         print("Linked list is empty")
    #         return
    #     itr = self.head
    #     llstr = ''
    #     while itr:
    #         llstr += str(itr.data)+' --> ' if itr.next else str(itr.data)
    #         itr = itr.next
    #     print(llstr)
    #
    def print(self):
        itr = self.head
        llstr = ''
        while itr:
            suffix = ''
            if itr.next:
                suffix = '-->'
            llstr += str(itr.data) + suffix
            itr = itr.next
        print(llstr)


    def get_length(self):
        count = 0
        itr = self.head
        while itr:
            count += 1
            itr = itr.next
        return  count

    def insert_end(self,data):
        if self.head is None:
            self.head = Node(data,None)
            return

        itr = self.head
        while itr.next:
            itr = itr.next

        itr.next = Node(data)

    def insert_middle(self,index,data):
        if index < 0 or index > self.get_length():
            raise Exception ("envalid index please input aa valid index")

        if index ==0:
            self.insert_at_begining(data)
            return

        itr = self.head
        count = 0
        while itr:
            if count == index-1:
                node = Node(data,itr.next)
                itr.next = node
                break
            itr = itr.next
            count += 1

    def deliion_first(self,index):
        if index < 0 or index > self.get_length():
            raise  Exception ("invailid input")

        if index == 0:
            self.head = self.head.next
            return

        itr = self.head
        count = 0
        while itr :
            if count == index-1:
                itr.next = itr.next.next
                break

            itr = itr.next
            count += 1


    def insert_value(self,datalist):
        self.head = None
        for data in datalist:
            #self.insert_end(data)
            self.insert_at_begining(data)

if __name__ == '__main__':
    root = LinkedList()

    # root.insert_at_begining(2)
    # root.insert_at_begining(3)
    # root.insert_at_begining(4)
    # root.print()
    # print(root.get_length())

    # root.insert_end(122)
    # root.insert_end(123)
    # root.insert_end(124)
    # print(root.print())

    # root.insert_end(130)
    # root.insert_middle(1,122)
    # root.insert_middle(2,125)
    # root.insert_middle(3,128)
    # root.insert_end(120)
    # root.print()
    # root.deliion_first(3)
    # root.print()

    root.insert_value(["abhay","aman","ajay","arun","apple"])
    root.print()


    # YouTube link: https://www.youtube.com/watch?v=gXY_2wsQf3A
    class Node:
        def __init__(self, data):
            self.data = data
            self.next = None


    class LinkedList:
        def __init__(self):
            self.head = None

        def print_list(self):
            cur_node = self.head
            while cur_node:
                print(cur_node.data)
                cur_node = cur_node.next

        def append(self, data):
            new_node = Node(data)

            if self.head is None:
                self.head = new_node
                return

            last_node = self.head
            while last_node.next:
                last_node = last_node.next
            last_node.next = new_node

        def prepend(self, data):
            new_node = Node(data)

            new_node.next = self.head
            self.head = new_node

        def insert_after_node(self, prev_node, data):

            if not prev_node:
                print("Previous node is not in the list")
                return

            new_node = Node(data)

            new_node.next = prev_node.next
            prev_node.next = new_node

        def delete_node(self, key):

            cur_node = self.head

            if cur_node and cur_node.data == key:
                self.head = cur_node.next
                cur_node = None
                return

            prev = None
            while cur_node and cur_node.data != key:
                prev = cur_node
                cur_node = cur_node.next

            if cur_node is None:
                return

            prev.next = cur_node.next
            cur_node = None

        def delete_node_at_pos(self, pos):

            cur_node = self.head

            if pos == 0:
                self.head = cur_node.next
                cur_node = None
                return

            prev = None
            count = 0
            while cur_node and count != pos:
                prev = cur_node
                cur_node = cur_node.next
                count += 1

            if cur_node is None:
                return

            prev.next = cur_node.next
            cur_node = None


    llist = LinkedList()
    llist.append("A")
    llist.append("B")
    llist.append("C")
    llist.append("D")

    llist.delete_node("B")

    llist.print_list()


# YouTube link: https://www.youtube.com/watch?v=gXY_2wsQf3A
# class Node:
#     def __init__(self, data):
#         self.data = data
#         self.next = None
#
#
# class LinkedList:
#     def __init__(self):
#         self.head = None
#
#     def print_list(self):
#         cur_node = self.head
#         while cur_node:
#             print(cur_node.data)
#             cur_node = cur_node.next
#
#     def append(self, data):
#         new_node = Node(data)
#
#         if self.head is None:
#             self.head = new_node
#             return
#
#         last_node = self.head
#         while last_node.next:
#             last_node = last_node.next
#         last_node.next = new_node
#
#     def prepend(self, data):
#         new_node = Node(data)
#
#         new_node.next = self.head
#         self.head = new_node
#
#     def insert_after_node(self, prev_node, data):
#
#         if not prev_node:
#             print("Previous node is not in the list")
#             return
#
#         new_node = Node(data)
#
#         new_node.next = prev_node.next
#         prev_node.next = new_node
#
#     def delete_node(self, key):
#
#         cur_node = self.head
#
#         if cur_node and cur_node.data == key:
#             self.head = cur_node.next
#             cur_node = None
#             return
#
#         prev = None
#         while cur_node and cur_node.data != key:
#             prev = cur_node
#             cur_node = cur_node.next
#
#         if cur_node is None:
#             return
#
#         prev.next = cur_node.next
#         cur_node = None
#
#     def delete_node_at_pos(self, pos):
#
#         cur_node = self.head
#
#         if pos == 0:
#             self.head = cur_node.next
#             cur_node = None
#             return
#
#         prev = None
#         count = 0
#         while cur_node and count != pos:
#             prev = cur_node
#             cur_node = cur_node.next
#             count += 1
#
#         if cur_node is None:
#             return
#
#         prev.next = cur_node.next
#         cur_node = None
#
#
# llist = LinkedList()
# llist.append("A")
# llist.append("B")
# llist.append("C")
# llist.append("D")
#
# llist.delete_node("B")
#
# llist.print_list()
#
