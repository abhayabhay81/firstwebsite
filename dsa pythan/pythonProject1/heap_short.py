class Heap:
    def __init__(self):
        self.heap = []

    def create_heap(self,list1):
        for e in list1:
            self.insert(e)

    def insert(self,e):
        index = len(self.heap)
        parentindex = (index -1)//2
        while index > 0 and self.heap[parentindex] < e:
            if index == len(self.heap):
                self.heap.append(self.heap[parentindex])
            else:
                self.heap[index] =self.heap[parentindex]
            index = parentindex
            parentindex = (index -1)//2
        if index == len(self.heap):
            self.heap.append(e)
        else:
            self.heap[index] = e

    def Top(self):
        if len(self.heap) == 0:
            raise Emptyheapexception()
        return self.heap[0]

    def delete(self):
        if len(self.heap) == 0:
            raise Emptyheapexception
        if len(self.heap) == 1:
            return self.heap.pop()
        max_value = self.heap[0]
        temp = self.heap.pop()
        index = 0
        leftchildindex = 2*index+1
        rightchildindex = 2*index+2

        while leftchildindex < len(self.heap):
            if rightchildindex < len(self.heap):
                if self.heap[leftchildindex] > self.heap[rightchildindex]:
                    if self.heap[leftchildindex] > temp:
                        self.heap[index] = self.heap[leftchildindex]
                        index = leftchildindex
                    else:
                        break
                else:
                    if self.heap[rightchildindex] > temp:
                        self.heap[index] = self.heap[rightchildindex]
                        index = rightchildindex
                    else:
                        break
            else: # no right child index
                if self.heap[leftchildindex] > temp:
                    self.heap[index] = self.heap[leftchildindex]
                    index = leftchildindex
                else:
                    break
            leftchildindex = 2*index+1
            rightchildindex = 2*index+2
        self.heap[index] = temp
        return max_value


    def heap_short(self,list1):
        self.create_heap(list1)
        list2 = []
        try:
            while True:
                list2.insert(0,self.delete())
        except Emptyheapexception:
            pass
        return list2


class Emptyheapexception(Exception):
    def __init__(self,msg = "Empty heap"):
        self.msg = msg

    def __str__(self):
        return self.msg


l = [88,44,22,11,99,33,77,55,100,66]
h = Heap()
l = h.heap_short(l)
print(l)


