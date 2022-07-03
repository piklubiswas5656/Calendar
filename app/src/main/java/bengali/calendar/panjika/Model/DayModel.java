package bengali.calendar.panjika.Model;

public class DayModel {
    String englishday, bengaliday, festival;

    public DayModel() {
    }

    public DayModel(String englishday, String bengaliday, String festival) {
        this.englishday = englishday;
        this.bengaliday = bengaliday;
        this.festival = festival;
    }

    public String getEnglishday() {
        return englishday;
    }

    public void setEnglishday(String englishday) {
        this.englishday = englishday;
    }

    public String getBengaliday() {
        return bengaliday;
    }

    public void setBengaliday(String bengaliday) {
        this.bengaliday = bengaliday;
    }

    public String getFestival() {
        return festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }
}
