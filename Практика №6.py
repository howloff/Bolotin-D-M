# -- coding: utf-8 --
from tkinter import *

def func1 ():   
    z = z1.get()
    i = 1
    a = int(z)
    result = ""
    while i ** 2 <= a:
        print(i ** 2)
        i += 1
        result +=str(i)
    resultA.configure(text = result)
    

def func2 ():
    z = z2.get ()
    n = int(z)
    i = 2
    while n % i != 0:
        i += 1
    resultB.configure(text = i)
    

def func3 ():
    z = z3.get()
    i=2
    StepenDva = 2
    Stepen = 1
    n = int(z)
    while StepenDva * i < n:
        StepenDva *= i
        Stepen += 1
    result = str(StepenDva) + str(Stepen)
    resultC.configure(text=result)

def func4 ():
    a=int(z4_1.get())
    b=int(z4_2.get())
    c=1
    while a<=b:
        if a==b:
            break
        a+=a/10
        c+=1
    resultD.configure(text=c)
    
u0c1 = 0
def func5 ():
    global u0c1
    z = z5.get()
    print (z)
    if (z != "0"):
        u0c1 += 1       
    else: 
        resultE.configure(text=u0c1)
        length = 0
    z5.delete(0, END)
u0c2=0
u0c3=0
def func6 ():
    global u0c2
    z = z6.get()
    global u0c3 
    if z != "0":
        u0c2 += 1
        u0c3 += int(z)
    else:
        resultF.configure(text= u0c3 / u0c2)
        u0c2=0
        u0c3=0
    z6.delete(0,END)

u0c4=0
u0c5=100000
def func7 ():
    z = z7.get()
    global u0c4
    global u0c5       
    if (int(z)> u0c5):
        u0c4+=1
    u0c5= int(z)      
    if (z=="0"):
        resultG.configure(text=u0c4)
        u0c5=100000
        u0c4=0
    z7.delete(0, END)
        
u0c6=0
u0c7=0
def func8 ():
    z=z8.get()
    global u0c6
    global u0c5
    global u0c7
    
    element = int(z)
    if (element == u0c5):
        u0c6 +=1
    else: 
        if(u0c7<u0c6):
            u0c7 = u0c6
        u0c6=1
    u0c5=element
    if (element==0):   
        resultH.configure(text = (max (u0c7, u0c6)))
        u0c5 = 100000
    z8.delete(0, END)

window = Tk()
window.title("Задание №6")
window.geometry('900x500')
lbl1 = Label(window, text="Ввод числа:")
lbl1.grid(column=0, row=0)
z1 = Entry(window, width = 10 )
z1.grid(column=1, row=0)
btn = Button(window, text="Функция 1 ", bg="white", fg="black", command=func1)
btn.grid(column=2, row=0)  
resultA = Label(window, text = "")
resultA.grid(column=4, row = 0)

lbl2 = Label(window, text = "Ввод числа: ")
lbl2.grid(column=0, row = 1)
z2 = Entry(window, width = 10)
z2.grid(column=1, row = 1)
btn1 = Button(window, text = "Функция 2",command = func2)
btn1.grid(column=2, row = 1)
resultB = Label(window, text = "Результат: ")
resultB.grid(column = 3, row = 1)

lbl3 = Label(window, text = "Ввод числа: ")
lbl3.grid(column=0, row = 2)
z3 = Entry(window, width = 10)
z3.grid(column=1, row = 2)
btn2 = Button(window, text = "Функция 3", command = func3)
btn2.grid(column=2, row = 2)
resultC = Label(window, text = "Результат: ")
resultC.grid(column = 3, row = 2)

lbl4 = Label(window, text = "Ввод числа: ")
lbl4.grid(column=0, row = 3)
z4_1 = Entry(window, width = 10)
z4_1.grid(column=1, row = 3)
z4_2 = Entry(window, width = 10)
z4_2.grid(column=2, row = 3)
btn3 = Button(window, text = "Функция 4", command = func4)
btn3.grid(column=3, row = 3)
resultD = Label(window, text = "Результат: ")
resultD.grid(column = 4, row = 3)

lbl5 = Label(window, text = "Число 0 выведет результат: ")
lbl5.grid(column=0, row = 4)
z5 = Entry(window, width = 10)
z5.grid(column=1, row = 4)
btn4 = Button(window, text = "Функция 5", command = func5)
btn4.grid(column=2, row = 4)
resultE = Label(window, text = "Результат: ")
resultE.grid(column = 3, row = 4)

lbl6 = Label(window, text = "Число 0 выведет результат: ")
lbl6.grid(column=0, row = 5)
z6 = Entry(window, width = 10)
z6.grid(column=1, row = 5)
btn5 = Button(window, text = "Функция 6", command = func6)
btn5.grid(column=2, row = 5)
resultF = Label(window, text = "Результат: ")
resultF.grid(column = 3, row = 5)

lbl7 = Label(window, text = "Число 0 выведет результат: ")
lbl7.grid(column=0, row = 6)
z7 = Entry(window, width = 10)
z7.grid(column=1, row = 6)
btn6 = Button(window, text = "Функция 7", command = func7)
btn6.grid(column=2, row = 6)
resultG = Label(window, text = "Результат: ")
resultG.grid(column = 3, row = 6)

lbl8 = Label(window, text = "Число 0 выведет результат: ")
lbl8.grid(column=0, row = 7)
z8 = Entry(window, width = 10)
z8.grid(column=1, row = 7)
btn7 = Button(window, text = "Функция 8", command = func8)
btn7.grid(column=2, row = 7)
resultH = Label(window, text = "Результат: ")
resultH.grid(column = 3, row = 7)

window.mainloop()