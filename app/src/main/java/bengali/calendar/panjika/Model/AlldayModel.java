package bengali.calendar.panjika.Model;

public class AlldayModel {
/*
"englishdate": "15-4-2022",
        "bangladate": "১ বৈশাখ ১৪২৯",
        "bar":"শুক্রবার",
        "festival":"বহাগ বিহু ( আসাম )",
            "tithi":"শুক্ল চতুর্দশী",
            "nakotro": "উত্তরফাল্গুনী নক্ষত্র",
            "janmorasi": "কন্যা",
            "jog": "ধ্রুবযোগ",
            "kron": "গরকরণ",
            "bdate":"১ ",
            "monthnumber": "1"*/

    private String englishdate, bangladate, bar, festival, tithi, nakotro, janmorasi, jog, kron, bdate, monthnumber;


    public AlldayModel(String englishdate, String bangladate, String bar, String festival, String tithi, String nakotro, String janmorasi, String jog, String kron, String bdate, String monthnumber) {
        this.englishdate = englishdate;
        this.bangladate = bangladate;
        this.bar = bar;
        this.festival = festival;
        this.tithi = tithi;
        this.nakotro = nakotro;
        this.janmorasi = janmorasi;
        this.jog = jog;
        this.kron = kron;
        this.bdate = bdate;
        this.monthnumber = monthnumber;
    }

    public AlldayModel() {
    }

    public String getEnglishdate() {
        return englishdate;
    }

    public void setEnglishdate(String englishdate) {
        this.englishdate = englishdate;
    }

    public String getBangladate() {
        return bangladate;
    }

    public void setBangladate(String bangladate) {
        this.bangladate = bangladate;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public String getFestival() {
        return festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }

    public String getTithi() {
        return tithi;
    }

    public void setTithi(String tithi) {
        this.tithi = tithi;
    }

    public String getNakotro() {
        return nakotro;
    }

    public void setNakotro(String nakotro) {
        this.nakotro = nakotro;
    }

    public String getJanmorasi() {
        return janmorasi;
    }

    public void setJanmorasi(String janmorasi) {
        this.janmorasi = janmorasi;
    }

    public String getJog() {
        return jog;
    }

    public void setJog(String jog) {
        this.jog = jog;
    }

    public String getKron() {
        return kron;
    }

    public void setKron(String kron) {
        this.kron = kron;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getMonthnumber() {
        return monthnumber;
    }

    public void setMonthnumber(String monthnumber) {
        this.monthnumber = monthnumber;
    }
}
