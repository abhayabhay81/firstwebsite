class Stact:
    def __init__(self):
        self.items = []

    def push(self,item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def is_empty(self):
        return self.items ==[]

    def peek(self):
        if not self.is_empty():
            return self.items[-1]

    def get_stack(self):
        return  self.items

st = Stact()

st.push(1)
st.push(2)
st.push(3)
st.push(4)
st.push(5)
st.push(6)
print("display  function",st.get_stack())
print("is empy function",st.is_empty())
print("p function",st.peek())
# st.pop(1)  this is throw error
st.pop()
print(st.get_stack())