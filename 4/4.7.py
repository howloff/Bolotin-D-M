# -- coding: utf-8 --

n=input()
n=n[:n.find('h')]+n[n.rfind('h')+1:]
print(n)