# -- coding: utf-8 --

n=input()
a=n[:n.find('h')]
b=n[n.find('h'):n.rfind('h')+1] 
c=n[n.rfind('h')+1:]
n=a+b[::-1]+c
print(n)

