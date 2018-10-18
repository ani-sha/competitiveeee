from collections import OrderedDict
D = OrderedDict()
for _ in range(int(input())):
    item, space, price = input().rpartition(' ')
    D[item] = D.get(item, 0) + int(price)
print(*[" ".join([item, str(price)]) for item, price in D.items()], sep="\n")
