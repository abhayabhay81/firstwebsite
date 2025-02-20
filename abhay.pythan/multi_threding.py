# run in replit

import threading
import time
from concurrent.futures import ThreadPoolExecutor
"""
def func(seconds):
   print(f"sleeping for {seconds} second")
   time.sleep(seconds)
   
time1 = time.perf_counter()   
   
func(4)
func(2)
func(1)

time2 = time.perf_counter()
print(time2-time1)

t1 = threading.Thread(target=func,args=[4])
t2 = threading.Thread(target=func,args=[2])
t3 = threading.Thread(target=func,args=[1])

time3 = time.perf_counter()

t1.start()
t2.start()
t3.start()

t1.join()
t2.join()
t3.join()
time4 = time.perf_counter()
print(time4-time3) """

def func(seconds):
   print(f"sleeping for {seconds} second")
   time.sleep(seconds)
   
def main():   
  time1 = time.perf_counter()   
   
  func(4)
  func(2)
  func(1)

  time2 = time.perf_counter()
  print(time2-time1)

t1 = threading.Thread(target=func,args=[4])
t2 = threading.Thread(target=func,args=[2])
t3 = threading.Thread(target=func,args=[1])

time3 = time.perf_counter()

t1.start()
t2.start()
t3.start()

t1.join()
t2.join()
t3.join()
time4 = time.perf_counter()
print(time4-time3)

def poolingDemo():
    with ThreadPoolExecutor(max_workers = 1) as executor:
        Future = executor.submit(func,3)
        print(Future.result())
        Future = executor.submit(func,2)
        print(Future.result())
        Future = executor.submit(func,1)
        print(Future.result())
        
poolingDemo()