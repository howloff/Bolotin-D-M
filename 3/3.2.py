# -- coding: utf-8 --
"""Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания, если A < B, 
или в порядке убывания в противном случае."""

a=int(input())
b=int(input())
if a<b :
    for i in range(a, b+1): print(i)
else :
    while a>=b:
        print(a)
        a-=1