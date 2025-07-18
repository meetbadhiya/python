a=[10,20,30,40,50]


a.append(60)
print("append: ",a)

b=a.copy()
print("copy: ",b)

print("count: ",a.count(40))

a.extend([55,65])
print("extend: ",a)

a.insert(4,45)
print("insert: ",a)


