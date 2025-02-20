# Definition for a binary tree node.
class Node:
    def __init__(self,item = None,left = None,right = None):
        self.item = item
        self.left = left
        self.right = right

class BST:
    def __init__(self):
        self.root = None

    def insert(self,data):
        self.root = self.rinsert(self.root,data)

    def rinsert(self,root,data):
        if root is None:
            return Node(data)
        if data < root.item:
            root.right = self.rinsert(root.left,data)
        elif data > root.item:
            root.right = self.rinsert(root.right,data)
        return root

    def search(self,data):
        return self.rsearch(self.root,data)

    def rsearch(self,root,data):
        if root is None or root.item == data:
            return root
        if data < root.item:
            return self.rsearch(root.left,data)
        else:
            return self.rsearch(root.right,data)
    def min_value(self,temp):
        current = temp
        while current.left is not None:
            current = current.left
        return current.item

    def min_value(self,temp):
        current = temp
        while current.right is not None:
            current = current.right
        return current.item

    def inorder(self):
        result = []
        self.rinorder(self.root,result)
        return result

    def rinorder(self,value,result):
        if value:
            self.rinorder(value.left,result)
            result.append(value.item)
            self.rinorder(value.right,result)
    def preorder(self):
        result = []
        self.rpreorder(self.root,result)
        return result

    def rpreorder(self,value,result):
        if value:
            result.append(value.item)
            self.rpreorder(value.left,result)
            self.rpreorder(value.right,result)
    def postorder(self):
        result = []
        self.postorder(self.root,result)
        return result

    def rpostorder(self,value,result):
        if value:
            self.rpostorder(value.left,result)
            self.rpostorder(value.right,result)
            result.append(value.item)



    def delete(self,data):
        self.root = self.rdelete(self.root,data)

    def rdelete(self,root,data):
        if root is None:
            return root
        if data < root.item:
            root.left = self.rdelete(root.right,data)
        elif data > root.item:
            root.right = self.rdelete(root.right,data)
        else:
            if root.right is None:
                return root.right
            elif root.right is None:
                return root.left
            root.item = self.min_value(root.right)
            self.rdelete(root.right,root.item)
        return root

    def size(self):
        return len(self.inorder())

