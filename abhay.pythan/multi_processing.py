 #run in replit 
"""
import multiprocessing
import requests

def download(url,name):
    response = requests.get(url)
    open(f"file{name}.jpg","wb").write(response.content)

url = "https://picsum.photos/2000/3000"
for i in range(5):
    download(url, i)


def download(url, name):
  print(f"Started Downloading {name}")
  response = requests.get(url)
  open(f"file1{name}.jpg", "wb").write(response.content)
  print(f"Finished Downloading {name}")


url = "https://picsum.photos/2000/3000"
pros = []
for i in range(5):
  # downloadFile(url, i)
  p = multiprocessing.Process(target=download, args=[url, i])
  p.start()
  pros.append(p) """

import concurrent.futures
import requests


def download(url, name):
  print(f"Started Downloading {name}")
  response = requests.get(url)
  open(f"file2{name}.jpg", "wb").write(response.content)
  print(f"Finished Downloading {name}")


url = "https://picsum.photos/2000/3000"
with concurrent.futures.ProcessPoolExecutor() as executor:
  l1 = [url for i in range(6)]
  l2 = [i for i in range(6)]
  results = executor.map(download, l1, l2)
  for r in results:
    print(r)
