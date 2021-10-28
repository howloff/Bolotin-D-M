# -- coding: utf-8 --
"""По данному натуральному n вычислите сумму 1^3+2^3+3^3+...+n^3."""
n=int(input())
s=0
for i in range(1,n+1):
    a=i**3
    s+=a
print(s)