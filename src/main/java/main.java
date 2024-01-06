public class main {

    public static void main(String[] args) {

        for (Gezegen g : Gezegen.values()) {
            System.out.println(g + " Sira Numarasi " + g.getSiraNumarasi() + ", Uzaklık : " + g.getUzaklik() + ", Yaricap: " +g.getYaricap()
            +", Donme Suresi: " + g.getDonmeSuresi());
        }

    }
}
