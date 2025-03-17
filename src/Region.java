public enum Region {
    OSH("Sulaiman-Too"),
    ISSYKOL("Issyk-Kul"),
    NARYN("Too"),
    BATKEN("Aigul gul"),
    JALALABAD("Jangak Bak"),
    CHUI("Burana"),
    TALAS("Manas");

    private String osoben;
    Region (String osoben){
        this.osoben = osoben;
    }

    public String getOsoben() {
        return osoben;
    }

    public void setOsoben(String osoben) {
        this.osoben = osoben;
    }
}
