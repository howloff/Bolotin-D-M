# -- coding: utf-8 --
""" Дано число n. С начала суток прошло n минут. 
Определите, сколько часов и минут будут показывать электронные часы в этот момент. 
Программа должна вывести два числа: количество часов (от 0 до 23) 
и количество минут (от 0 до 59). Следует предусмотреть случай, когда количество 
введенных минут больше чем кол-во минут в сутках."""

nMin = int(input("Прошло минут =  ")) 
Min = (nMin % 60)
Hr = ((nMin // 60)%24)
print (str(Hr)+":"+str(Min)         )
