# -- coding: utf-8 --
"""Даны три целых числа. Определите, сколько среди них совпадающих. 
Программа должна вывести одно из чисел: 3 (если все совпадают),2 (если два совпадает) или 0 (если все числа различны)."""


a = int(input("Введите первое число: "))
b = int(input("Введите второе число: "))
c = int(input("Введите третье число: "))
if a==b and a==c :print(3)
elif a==b :print(2)
elif a==c :print(2)
elif b==c:print(2)
else:print(0)