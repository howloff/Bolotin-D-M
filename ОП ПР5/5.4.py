# -- coding: utf-8 --

a=int(input())
b=int(input())
z=1
while a<=b:
    if a==b:
        break
    a+=a/10
    z+=1
print(z)