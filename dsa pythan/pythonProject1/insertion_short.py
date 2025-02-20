def insertion_short(list1):
    for i in range(1,len(list1)):
        temp = list1[i]
        j = i-1
        while j >= 0 and temp < list1[j]:
            list1[j+1] = list1[j]
            j -= 1
        list1[j+1] = temp

l = [34,77,44,66,55,999,12,45,73,88]
insertion_short(l)
print(l)