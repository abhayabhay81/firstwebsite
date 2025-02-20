#write a library class with no of books as two instance variable 
#write a program to create library class how to print add book vlue is increase

class library:
    def __init__(self):
        self.nobooks = 0
        self.books = []
        
    def addbook(self,book):
        self.books.append(book)  #append is use to pop the element
        self.nobooks = len(self.books)
        
    def show(self):
        print(f"the library has {self.nobooks} books")
        for book in self.books:
         print(book)
        
li = library()
li.addbook("abhay book")
li.addbook("abhay book")
li.addbook("abhay book")
li.addbook("abhay book")
li.show()