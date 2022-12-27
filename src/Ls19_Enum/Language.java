package Ls19_Enum;

public enum Language implements MyInterface{
    KYRGYZ("KG"),     // Language KYRGYZ = new Language();
    ENGLISH("EN"),
    RUSSIAN("RUS"),
    TURKISH("TR");
    private String country;

    Language(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
