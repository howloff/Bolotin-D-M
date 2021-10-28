# -- coding: utf-8 --
"""Даны два целых числа A и B (при этом A ≤ B). Выведите все числа от A до B включительно. """
A=int(input())
B=int(input())
if A>B: print("Ошибка")
for i in range(A, B+1): print (i)