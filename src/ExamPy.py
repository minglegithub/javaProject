class Calc:
    def main(self, score):
        tmp = [0, 0]
        number = 0
        for x in score:
            tmp[0] += x
        tmp[1] = tmp[0]/len(score)
        return tmp


score = [70, 80, 90, 100]
res = Calc().main(score)
print("총점은 {0}이고 평균은 {1}입니다".format(res[0], res[1]))




