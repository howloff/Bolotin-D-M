# -- coding: utf-8 --
"""Даны два целых числа A и В, A>B. Выведите все нечётные числа от A до B включительно, в порядке убывания. """

a=int(input())
b=int(input())
if b>a : print("Ошибка")
while a>=b:
    if a%2!=0:print(a)
    a=a-1