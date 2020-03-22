public class GrechkaAndStar {
    public static void main(String[] args) {
        int grechka = 100;
        int grechkaIn = 0;
        int mouth = 2;
        int eatVasya = 6;
        int arendaVMes = 100;
        int stoimost;
        int sum = 0;

        grechkaIn = grechka - (eatVasya * mouth);

        do {
            stoimost = grechkaIn * arendaVMes;
            sum = sum + stoimost;
            grechkaIn = grechkaIn - eatVasya;
        } while (grechkaIn > eatVasya);
        System.out.println("Для хранения гречки Василию понадобится " + sum + " рублей");
    }
}


