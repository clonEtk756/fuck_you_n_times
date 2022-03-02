#import
import time
from colorama import init
from colorama import Fore, Back
init()
import random

#banwords for names
sw = ["govno", "hui", "pizda", "pidor", "eblan", "dolbaeb", "pidaras", "pidaraz", 
 "uebok", "pizdabol","blyat", "blyad","blyadina", "lox", "loh", "suka", "shluha", 
 "sobaka","huilan", "pizduk", "obosrysh", "huesos", "psina", "shalava", "negr", 
 "nigger", "nigga","huilo", "zalupa", "ueban"]

#check validity of name
while True:
    a = False
    name = input("Кого послать нахуй: ")                      #name
    name = name.lower()
    for char in name:
        if char.isdigit():
            a = True
    if a:
        print(Back.RED + Fore.BLACK + "НИКАКИХ БЛЯТЬ ЦИФР!" + Back.BLACK + Fore.WHITE)
        continue    
    if "you" in name:                                     # You case
        print("по хуЮ")
        continue
    elif name in sw:                                 #ban word case
        print("Самокритично")
        continue
    elif ("vlada" in name):                            #Vlada case
        print("Владу не трогать!")
        continue
    elif ("tebya" in name) or ("teba" in name):
        print("иди нахуй") 
        continue                                                    
    elif ("mat'" in name) or ("mam" in name) or ("mam" in name) or ("mom" in name) or ("mum" in name): 
        sr = input("Извинись\n").lower()
        i = 1                                                      #mom case
        while ("sorry" not in sr) and ("izvini" not in sr):                                
            sr = input("Извинись\n").lower()
            i += 1
            if i%3 == 0:
                print("\nГде мать?")
                print(Fore.BLUE + "Мать в канаве")
                print(Fore.RED + "Ты пидор\n" + Fore.WHITE)
                time.sleep(2)
        continue
    name = name.capitalize()
    break

#if name Kirill
if ("Kir" in name) or ("Mark" in name):     
    print("Иди нахуй, Yerkin")
    name = "Yerkin"                             #Yerkin
elif ("Ker" in name):
    print("Иди нахуй, Lena")
    name = "Lena"                              #Lena

#common names
if "Yerkin" in name:                                               #Yerkin
    print(Fore.BLUE + "Душнила" + Fore.WHITE)
elif "Egor" in name:                                               #Egor
    print(Fore.RED + "Чисти мандарины" + Fore.WHITE)
elif ("Dasha" in name) or ("Daria" in name):                     #Dasha
    print(Fore.BLUE + "Слава Украине")
    print(Fore.YELLOW + "Героям Слава" + Fore.WHITE)
    time.sleep(3)
elif ("Lena" in name) or ("Elena" in name):                     #Lena 
    print(Fore.MAGENTA + "Гони ашку" + Fore.WHITE)
elif ("Masha" in name) or ("Mariia" in name) or ("Maria" in name):    #Masha
    print(Fore.GREEN + "Сбер заблокирован" + Fore.WHITE)
elif ("Vova" in name) or ("Vladimir" in name):                       #Vova
    print("Лох, cел за донат")
elif ("Misha" in name) or("Mikhail" in name) or ("Mihail" in name):
    print(Fore.RED + "БЫДЛО" + Fore.WHITE)
elif "Putin" in name:                                           #Putin
    print("Huilo")
elif "Kloun" in name:                                       #Kloun
    print("{}, опять ты".format("Yerkin"))
    name = "Yerkin"
elif "Denis" in name:                                       #Denis
    print("Ваш убер прибыл")

#IQ check
while True:
    try:
        iq = round(float(input("IQ: ")))
    except:
        print(Back.RED + Fore.BLACK +"ЧИСЛО БЛЯТЬ!" + Back.BLACK + Fore.WHITE)                  
        continue
    if iq == 100:
        print("Как курс доллара")                                  #dollar
    if iq == 0:
        print("Ебать ты пень, -100 нахуй")                   #0 IQ
        iq = -100
    elif ("Vova" in name) or ("Vladimir" in name):                #Vova IQ
        print("Вова, кому ты пиздишь, IQ: 1")
        iq = 1
    else:
        iq = round(iq - abs(iq*(9/10)))
        print("Пиздишь, {} максимум".format(iq))
    fix = abs(round(iq*(25/100)))
    break

#Gender check
while True:
    try:
        gen = round(float(input("Сосешь(1) или лижешь(2)? ")))
    except:
        print(Back.RED + Fore.BLACK +"ЧИСЛО БЛЯТЬ!" + Back.BLACK + Fore.WHITE)                  
        continue
    if "Lena" in name:                                          #Lena case
        print("Иди нахуй, у тебя Артемий")
        gen = 1
    if (gen != 1) and (gen != 2):
        while (gen != 1) and (gen != 2):                   #dolbaeb protection
            iq = round(iq - fix)
            print("Новый IQ: {}".format(iq))
            print("1 или 2")
            gen = round(float((input())))
    break

#go fuck yoursef loop
while True:
    try:
        num = int(input("Сколько раз хочешь пойти нахуй?(макс 1000 раз можно пойти нахуй) "))    #num of fucks
    except:
        print(Back.RED + Fore.BLACK + "ЧИСЛО БЛЯТЬ!" + Back.BLACK + Fore.WHITE)
        continue

    #special numbers
    s_num = abs(num)
    if s_num == 3:                                        #3
        for x in range(10):
            print("Я календарь")
            time.sleep(1)
        time.sleep(2)
    elif s_num == 69:                                    #69
        print("GO TO HORNY JAIL")
        time.sleep(2)
    elif s_num == 420:                                  #420
        print("Укурыш, за тобой уже едет Денис")
        time.sleep(2)
    elif s_num == 666:                                   #666
        print("Ебать ты чорт")
        time.sleep(2)
    elif s_num == 777:                                  #777
        for x in range(30):
            print("Азино 3 топора")
            print("Поднял бабла")
            print("Сатали другими дела\n")
            time.sleep(0.5)
        time.sleep(2)
    elif s_num == 667:                                  #667
        print("Дохуя казах? Иди за конями следи")
        time.sleep(2)
    elif s_num == 911:                                   #911
        rand = random.randint(0,1)
        if rand == 0:
            if gen == 1:
                print("{} мусорнулась".format(name))
            else:
                print("{} мусорнулся".format(name))
        elif rand == 1:
            if gen == 1:
                print("В дурку ее")
            else:
                print("В дурку его")
        time.sleep(2)
    elif s_num == 95:                                   #95
        print(Fore.RED + "KCHAU" + Fore.WHITE)
        time.sleep(1)

    if (num > 1000) or (num < -1000):                                     #if more than 1000
        if gen == 1:
            print("Пошла нахуй")
            continue
        else:
            print("Пошел нахуй")
            continue
    if num < 0:                                                   #if less than 0
        print("Чел ты")
        num = s_num
    while num == 0:                                          #if =0
        if gen == 1:
            print("Ты че самая умная, иди нахуй")
        else:
            print("Ты че самый умный, иди нахуй")
        try:
            num = int(input("Сколько раз хочешь пойти нахуй?(num) ")) 
        except:
            print(Back.RED + Fore.BLACK +"ЧИСЛО БЛЯТЬ!" + Back.BLACK + Fore.WHITE)         #if num not int
            continue
        if num < 0:
            print("Чел ты")
            num = abs(num)
    s_nums = [3, 69, 420, 666, 777, 667, 911, 95]
    if num not in s_nums:
        i = 0                                               #fuck loop
        while num > i:
            print("{}, иди нахуй".format(name))
            i+=1

    ans = "no"                                                      #ask if want more
    while ans != "yes":
        ans = input("Хочешь пойти нахуй?(yes/no) ")
        if ans != "yes":
            print("иди нахуй, {}".format(name))   