# -- coding: utf-8 --

n=input()
wrd1 = n [:n.find(' ')]
wrd2 = n [n.find(' ') +1:]
print(wrd2 + ' ' + wrd1)