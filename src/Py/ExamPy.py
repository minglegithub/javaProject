class Calc:
    def __init__(self, s):
        self.s = s
        self.main()

    def main(self):
        self.tmp = [0, None]
        number = 0
        for x in self.s:
            self.tmp[0] += x
        self.tmp[1] = self.tmp[0]/len(self.s)



score = [70, 80, 90, 100]
res = Calc(score).tmp
print("총점은 {0}이고 평균은 {1}입니다".format(res[0], res[1]))




