print("abhhnn")
import time
import asyncio

async def fun1():
    await asyncio.sleep(1)
    print("finction1")

async def fun2():
    await asyncio.sleep(2)
    print("function 2")
          
async def fun3():
    await asyncio.sleep(3)
    print("funtion 3")

async def main():    
  l = await asyncio.gather(
        fun1(),
        fun2(),
        fun3(),
    )
  print(l) 