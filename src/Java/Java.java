package Java;

public class Java {
    public static void main(String[] args) {
        String[] data = {"식초", "식용유"};
        int[] score = {70, 80, 90, 100};
        Algo res = new Algo(data, score);
        res.box();
        System.out.println(res.d[0] + "," + res.d[1]);
        res.HelloFun();
        System.out.println(res.tmp[0] + "," + res.tmp[1]);


    }

}

class Algo {
    String[] d;
    int[] score;
    int[] tmp = new int[2];
    Algo(String[] d, int[] score) {
        this.d = d;
        this.score = score;
    }
    String[] box() {


        String temp = d[0];
        d[0] = d[1];
        d[1] = temp;
        return d;

    }

    int[] HelloFun() {

        for(int i : score){
            tmp[0] += i;
        }
        tmp[1] = tmp[0]/score.length;
        return tmp;

    }
}
