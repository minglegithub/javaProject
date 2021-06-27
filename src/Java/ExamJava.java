package Java;

public class ExamJava {

    public static void main(String[] args) {
        int[] score = {70, 80, 90, 100};

        int[] res = new Calc(score).HelloFun();
        System.out.println("총점은 " + res[0] + "이고 평균은 " + res[1] + "입니다.");
        System.out.printf("총점은 %d이고 평균은 %d입니다.",res[0],res[1]);

    }


}





class Calc {
    int[] score;


    public Calc(int[] score) {
        this.score = score;



    }
    int[] HelloFun() {
        int[] tmp = new int[2];
        for(int i : score){
            tmp[0] += i;
        }
        tmp[1] = tmp[0]/score.length;
        return tmp;

    }
}

