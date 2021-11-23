# -- coding: utf-8 --

n = int(input())
StepenDva = 2
Stepen = 1
while StepenDva <= n:
    StepenDva *= 2
    Stepen += 1
print(Stepen - 1, StepenDva // 2)