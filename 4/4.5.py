# -- coding: utf-8 --

n=input()
if n.count('f') == 1:
    print(n.find('f'))
elif n.count('f') >= 2:
    print(str(n.find('f')) +" " +str(n.rfind('f')))   