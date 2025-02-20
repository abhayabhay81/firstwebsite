"""a = False
print(a:=False)

numbers = [1,2,3,4,5]
while (n := len(numbers) > 0):
    print(numbers.pop())
   
foods = list()
while True :
   food = input("what food do you lije ")
   if(food == "quit"):
        break
   foods.append(food)"""
   
foods = list() 
while (food := input("what food you want to eat ")) != "quit":
    foods.append(food)