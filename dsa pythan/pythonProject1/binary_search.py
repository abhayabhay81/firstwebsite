def binary_search(list1,n):
    left = 0
    right =len(list1)-1
    mid = 0
    while left <= right:
        mid = (left+right)//2
        if list1[mid] == n:
            return mid
        if list1[mid] < n:
            left = mid+1
        else:
            right = mid-1
    return -1

l = [11,22,33,44,55,66,77,88,99]
print(binary_search(l,19))

