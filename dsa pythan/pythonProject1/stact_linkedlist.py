class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.head = None

    def push(self,data):
        node = Node(data)
        if self.head == None:
            self.head = node
            return
        cur = self.head
        self.head = node
        self.head.next = cur

    def pop(self):
        if self.head == None:
            return
        if self.head.next == None:
            self.head = None
            return
        cur = self.head.next
        del self.head
        self.head = cur


    def peek(self):
        return self.head.data

    def isempty(self):
        return self.length == 0

    def size(self):
        return self.length

    def printstack(self):
        print("\n")
        node = self.head
        while node != None:
            print(node.data)
            node = node.next



st = Stack()

st.push(1)
st.push(2)
st.push(3)
st.push(4)
st.push(5)
st.printstack()

st.pop()
st.printstack()