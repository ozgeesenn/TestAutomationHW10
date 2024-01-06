public enum Gezegen {

    MERKUR(1,58,2439,58),
    VENUS(2,108,6051,243),
    DUNYA(3,150,6371,24),
    MARS(4,230,3389,25),
    JUPITER(5,750,69911,9),
    SATURN(6,14,3243,13242),
    URANUS(7,4353,3423,34234),
    NEPTUN(8,3453,23423,23423);

    private final int siraNumarasi;
    private final int uzaklik;
    private final int yaricap;
    private final int donmeSuresi;

    Gezegen(int siraNumarasi, int uzaklik, int yaricap,int donmeSuresi) {
        this.siraNumarasi = siraNumarasi;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    public int getSiraNumarasi() {
        return siraNumarasi;
    }

    public int getUzaklik() {
        return uzaklik;
    }

    public int getYaricap() {
        return yaricap;
    }

    public int getDonmeSuresi() {
        return donmeSuresi;
    }
}
