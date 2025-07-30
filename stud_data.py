name=input("Enter student name:")
roll=int(input("Enter roll no:"))
j2ee=int(input("Enter marks of J2EE :"))
python=int(input("Enter marks of PYTHON :"))
cs=int(input("Enter marks of CS :"))

total = j2ee + python + cs
per = (total/300) * 100 #every subject 100marks
print("Total marks:",total)
print("Percentage:",per)

if(per>=70 and per<=100):
    print("Distiction")
elif(per>=60 andper<=69):
    print("First Class")
elif(per>=50 and per<=59):
    print("Second Class")
elif(per>=40 and per<=49):
    print("Pass class")
else:
    print("FAIL")
