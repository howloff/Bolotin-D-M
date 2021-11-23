# -- coding: utf-8 --

x = int(input())       #Послед. чисел
y = 0                #кол-во элементов
while x != 0:
    next = int(input())   
    if next != 0 and x < next:
        y += 1
    x = next
print(y)