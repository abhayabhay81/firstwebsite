# class Treenode:
#     def __init__(self, value):
#         self.left = None
#         self.right = None
#         self.value = value
#
#     def insert(self, value):
#         if value < self.value:
#             if self.left is None:
#                 self.left = Treenode(value)
#             else:
#                 self.left.insert(value)
#         else:
#             if self.right is None:
#                 self.right = Treenode(value)
#             else:
#                 self.right.insert(value)
#
#     def inorder_treversal(self):
#         if self.left:
#             self.left.inorder_treversal()
#         print(self.value)
#         if self.right:
#             self.right.inorder_treversal()
#     def preorder_treversal(self):
#         print(self.value)
#         if self.left:
#             self.left.preorder_treversal()
#         if self.right:
#             self.right.preorder_treversal()
#     def postorder_treversal(self):
#         if self.left:
#             self.left.postorder_treversal()
#         if self.right:
#             self.right.postorder_treversal()
#         print(self.value)
#
#     def find(self,value):
#         if value < self.value:
#             if self.left is None:
#                 return False
#             else:
#                 return self.left.find(value)
#         elif value > self.value:
#             if self.right is None:
#                 return False
#             else:
#                 return self.right.find(value)
#         else:
#             return True
#
# tree = Treenode(10)
# tree.insert(5)
# tree.insert(4)
# tree.insert(2)
# tree.insert(1)
# tree.insert(3)
# tree.insert(22)
# tree.insert(11)
# tree.insert(12)
# # print(tree.left.left.left.right.value)
# # tree.inorder_treversal()
# # tree.preorder_treversal()
# tree.postorder_treversal()
# print(tree.find(100))


class Treenode:
    def __init__(self, value):
        self.left = None
        self.right = None
        self.value = value
        self.content = None

    def insert(self, value,content = None):
        if value < self.value:
            if self.left is None:
                self.left = Treenode(value)
                self.left.content = content
            else:
                self.left.insert(value,content)
        else:
            if self.right is None:
                self.right = Treenode(value)
                self.right.content = content
            else:
                self.right.insert(value,content)

    def inorder_treversal(self):
        if self.left:
            self.left.inorder_treversal()
        print(self.value)
        if self.right:
            self.right.inorder_treversal()
    def preorder_treversal(self):
        print(self.value)
        if self.left:
            self.left.preorder_treversal()
        if self.right:
            self.right.preorder_treversal()
    def postorder_treversal(self):
        if self.left:
            self.left.postorder_treversal()
        if self.right:
            self.right.postorder_treversal()
        print(self.value)

    def find(self,value):
        if value < self.value:
            if self.left is None:
                return None
            else:
                return self.left.find(value)
        elif value > self.value:
            if self.right is None:
                return None
            else:
                return self.right.find(value)
        else:
            return self

tree = Treenode(10)
tree.insert(5)
tree.insert(4)
tree.insert(2)
tree.insert(1)
tree.insert(3)
tree.insert(22 ,{"data": "my name is  abhay"})
tree.insert(11)
tree.insert(12)
# print(tree.left.left.left.right.value)
# tree.inorder_treversal()
# tree.preorder_treversal()
tree.postorder_treversal()
print(tree.find(22).content['data'])
