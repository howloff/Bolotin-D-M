# -- coding: utf-8 --

""" Переменная seconds хранит в себе некоторое количество секунд. 
Переведите это число в дни:часы:минуты:секунды."""

seconds = int(input("Секунд = "))
minutes = (seconds // 60)
hours = (minutes // 60)
days = (hours // 24)

h1 = (hours % 24)
m1 = (minutes % 60)
s1 = (seconds % 60)

print('Дней:' + str(days) + ' Часов:' + str(h1) + ' Минут:' + str(m1) + ' Секунд:' + str(s1)         )