info={'name': 'karan','age':'56','eligible':'true'}
"""
print(info)

print(info['name'])

print(info.get('age'))

print(info.values())

print(info.keys())

print(info.items())

info["dob"]=2008
print(info)

info.update({'age': 18})
print(info)

info.clear()
print(info)

info.pop('eligible')
print(info)

info.popitem()
print(info)

del  info['age']
print(info)

del.info  #this show's error 
print(info)

newinfo=info.copy()
print(newinfo)"""

newdicit=dict(info)
print(newdicit)



