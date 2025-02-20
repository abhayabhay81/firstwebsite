#write a program to clear the clutter inside a folder on your computer
import os
os.rename("C:\Users\abhay\Downloads\abhay.pythan/1.jpg","C:\Users\abhay\Downloads\abhay.pythan/abhay1.jpg")

"""
files = os.listdir("screenshot")
i=1
for file in files:
    if file.endswith(".jpg"):
     print(file)
     os.rename(f"screenshot/{file}",f"screenshot/{i}.jpg")
     i = i+1
     """