maks=[12,13,14,15,16,17,18]
"""
index=0
for mak in maks:
    print(mak)
    if index==3:
        print("abhay you awesome")
    index += 1   """
    
for index,mak in enumerate(maks,start=1):
  print(mak)  
  if index==3 :
     print("abhay you awesome")