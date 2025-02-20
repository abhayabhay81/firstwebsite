# def bubble_short(n):
#     for r in range(1,len(n)):
#         for i in range(len(n)-r):
#             if n[i] > n[i+1]:
#                 temp = n[i]
#                 n[i] = n[i+1]
#                 n[i+1] = temp

# def bubble_short(n):
#     for r in range(1,len(n)):
#         for i in range(len(n)-r):
#             if n[i] > n[i+1]:
#                 n[i],n[i+1] = n[i+1],n[i]
def bubble_short(n):
    flag = False
    for r in range(1,len(n)):
        flag = False
        for i in range(len(n)-r):
            if n[i] > n[i+1]:
                n[i],n[i+1] = n[i+1],n[i]
                flag = False
            if not flag:
                break

l = [67,23,78,99,11,34,77,93,98,33]
bubble_short(l)
print(l)