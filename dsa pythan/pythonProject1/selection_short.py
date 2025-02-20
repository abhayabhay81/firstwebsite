def selection_short(list1):
    n = len(list1)
    for i in range(n-1):
        min_index = i
        for j in range(i+1,n):
            if list1[j] < list1[min_index]:
                min_index = j
        list1[i],list1[min_index] = list1[min_index],list1[i]

l = [34,77,44,66,55,999,12,45,73,88]
selection_short(l)
print(l)