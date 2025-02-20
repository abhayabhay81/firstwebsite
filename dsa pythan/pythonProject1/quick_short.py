def quick_short(list1):
    if len(list1) <= 1:
        return list1
    else:
        pivot = list1[0]
        lessor = [x for x in list1[1:] if x <= pivot]
        greater = [x for x in list1[1:] if x > pivot]
        return quick_short(lessor)+[pivot]+quick_short(greater)

l = [88,44,22,11,99,33,77,55,100,66]
b = quick_short(l)
print(b)