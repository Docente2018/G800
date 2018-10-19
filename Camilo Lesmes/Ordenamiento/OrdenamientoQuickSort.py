# -*- coding:utf-8 -*-
def quick_sort(A):
    quick_sort2(A, 0, len(A)-1)
    
def quick_sort2(A, bajo, alto):
    if alto-bajo < threshold and bajo < alto:
        quick_selection(A, bajo, alto)
    elif bajo < alto:
        p = partition(A, bajo, alto)
        quick_sort2(A, bajo, p - 1)
        quick_sort2(A, p + 1, alto)
    
def obternerPivote(A, bajo, alto):
    mid = (alto + bajo) // 2
    s = sorted([A[bajo], A[mid], A[alto]])
    if s[1] == A[bajo]:
        return bajo
    elif s[1] == A[mid]:
        return mid
    return alto
    
def partition(A, bajo, alto):
    pivotIndex = obternerPivote(A, bajo, alto)
    ValorPivote = A[pivotIndex]
    A[pivotIndex], A[bajo] = A[bajo], A[pivotIndex]
    border = bajo

    for i in range(bajo, alto+1):
        if A[i] < ValorPivote:
            border += 1
            A[i], A[border] = A[border], A[i]
    A[bajo], A[border] = A[border], A[bajo]

    return (border)
    
def quick_selection(x, primero, final):
    for i in range (primero, final):
        minIndex = i
        for j in range (i+1, final+1):
            if x[j] < x[minIndex]:
                minIndex = j
        if minIndex != i:
            x[i], x[minIndex] = x[minIndex], x[i]
            
A = [5,9,1,2,4,8,6,3,7]
print(A)
quick_sort(A)
print(A)
