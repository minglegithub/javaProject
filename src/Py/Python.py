class Algo:
    def __init__(self, d):
        self.d = d
        self.box()


    def box(self):


        temp = self.d[0]
        self.d[0] = self.d[1]
        self.d[1] = temp
        return self.d

def func():
    print("hello")

data = [100, 200]
res = Algo(data)
print(res.d[0], res.d[1])

