package Java;

public class Java {
    public static void main(String[] args) {
        String[] data = {"식초", "식용유"};
        String[] res = Algo.box(data);
        System.out.println(res[0] + "," + res[1]);
        System.out.printf("%s,%s",res[0],res[1]);

    }

}

class Algo {
    static String[] box(String[] d) {


        String temp = d[0];
        d[0] = d[1];
        d[1] = temp;
        return d;

    }
}
