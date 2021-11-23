# -- coding: utf-8 --

x = -1
y = 0
z = 0
element = int(input())
while element != 0:
    if x == element:
        y += 1
    else:
        x = element
        z = max(z, y)
        y = 1
    element = int(input())
z = max(z, y)
print(z)