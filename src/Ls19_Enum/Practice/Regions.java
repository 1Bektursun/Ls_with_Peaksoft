package Ls19_Enum.Practice;

public enum Regions {
    CHUI("BISHKEK"),
    NARYN("AT-BASHY"),
    BATKEN("AIGUL GULJU"),
    TALAS("MANAS KUMBOZU"),
    YSSYK_KOL("KOL"),
    JALAL_ABAD("ARSTANBAP"),
    OSH("SULAIMAN TOO");

    private String ozgocholuk;

    Regions(String ozgocholuk) {
        this.ozgocholuk = ozgocholuk;
    }

    public String getOzgocholuk() {
        return ozgocholuk;
    }

    public void setOzgocholuk(String ozgocholuk) {
        this.ozgocholuk = ozgocholuk;
    }
}
