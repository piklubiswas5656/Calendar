package bengali.calendar.panjika;

import java.util.ArrayList;

import bengali.calendar.panjika.Model.AlldayModel;
import bengali.calendar.panjika.Model.DayModel;

public class Conn {
    //var
    public static String baseurl = "https://play.google.com/store/apps/details?id=";


    //key
    public static final String KEY = "key";
    public static final String Festival="festival";


    //function
    public static String monthDate(String englishdate) {
//        englishdate ="1-4-2023"
        String englishmonth = "";
        String monthname, day;
        String finaldate = "";
        String arr[] = englishdate.split("-");
        for (int i = 0; i < englishdate.length() - 1; i++) {
            englishmonth = arr[1];
        }
        if (englishmonth.equals("1")) {
            day = arr[0];
            monthname = "Jan";
            finaldate = day + " " + monthname;
        } else if (englishmonth.equals("2")) {
            day = arr[0];
            monthname = "Feb";
            finaldate = day + " " + monthname;
        } else if (englishmonth.equals("3")) {
            day = arr[0];
            monthname = "Mar";
            finaldate = day + " " + monthname;
        } else if (englishmonth.equals("4")) {
            day = arr[0];
            monthname = "Apr";
            finaldate = day + " " + monthname;
        }
        else if (englishmonth.equals("5")) {
            day = arr[0];
            monthname = "May";
            finaldate = day + " " + monthname;
        }else if (englishmonth.equals("6")) {
            day = arr[0];
            monthname = "Jun";
            finaldate = day + " " + monthname;
        }
        else if (englishmonth.equals("7")) {
            day = arr[0];
            monthname = "Jul";
            finaldate = day + " " + monthname;
        }
        else if (englishmonth.equals("8")) {
            day = arr[0];
            monthname = "Aug";
            finaldate = day + " " + monthname;
        }
        else if (englishmonth.equals("9")) {
            day = arr[0];
            monthname = "Sep";
            finaldate = day + " " + monthname;
        }
        else if (englishmonth.equals("10")) {
            day = arr[0];
            monthname = "Oct";
            finaldate = day + " " + monthname;
        }
        else if (englishmonth.equals("11")) {
            day = arr[0];
            monthname = "Nov";
            finaldate = day + " " + monthname;
        }
        else if (englishmonth.equals("12")) {
            day = arr[0];
            monthname = "Dec";
            finaldate = day + " " + monthname;
        }
        return finaldate;
    }

    //jaista
    public static ArrayList<DayModel> arrayStore() {
        ArrayList<DayModel> holder = new ArrayList<>();
        holder.add(new DayModel("", "", ""));
        holder.add(new DayModel("", "", ""));
        holder.add(new DayModel("", "", ""));
        holder.add(new DayModel("1 Jun", "২", "একাদশীর মাহাত্ম্য ২০২২ এর একাদশীর তালিকা"));
        holder.add(new DayModel("1 Jun", "৩", "lunch 20.00 | Dinner 60.00 | Travel 60.00 | Doctor 5000.00 | lunch 20.00 | Dinner 60.00 | Travel 60.00 | Doctor 5000.00"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী সরস্বতী সরস্বতী"));
        holder.add(new DayModel("1 Jun", "৩", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("1 Jun", "২", "সরস্বতী"));
        holder.add(new DayModel("", "", ""));
        holder.add(new DayModel("", "", ""));
        return holder;
    }

    //baishik
    public static ArrayList<AlldayModel> baishikArray() {
        ArrayList<AlldayModel> holder = new ArrayList<>();
        holder.add(new AlldayModel("", "", "", "", "", "", "", "", "", "", ""));
        holder.add(new AlldayModel("", "", "", "", "", "", "", "", "", "", ""));
        holder.add(new AlldayModel("", "", "", "", "", "", "", "", "", "", ""));
        holder.add(new AlldayModel("", "", "", "", "", "", "", "", "", "", ""));
        holder.add(new AlldayModel("", "", "", "", "", "", "", "", "", "", ""));
        holder.add(new AlldayModel("15-4-2022", "১ বৈশাখ ১৪২৯", "শুক্রবার", "", "শুক্ল চতুর্দশী", "উত্তরফাল্গুনী নক্ষত্র", "কন্যা", "ধ্রুবযোগ", "গরকরণ", "১ ", "1"));
        holder.add(new AlldayModel("16-4-2022", "২ বৈশাখ ১৪২৯", "শনিবার", "বাংলা নববর্ষ  গুড ফ্রাইডে লিওনার্দো দা ভিঞ্চি ( জন্মদিন ) মদনচতুর্দশী মদনপূজা শ্ৰীশ্ৰী ভগবতী পূজা বহাগ বিহু ( আসাম )", "পূর্ণিমা", "হস্তা নক্ষত্র", "কন্যা", "ব্যাঘাতযোগ", "বিষ্টিকরণ", "২", "1"));
        holder.add(new AlldayModel("17-4-2022", "৩ বৈশাখ ১৪২৯", "রবিবার", "", "কৃষ্ণ প্ৰতিপদ", "চিত্রা নক্ষত্র", "তুলা", "বজ্রযোগ", "বালবকরণ", "৩", "1"));
        return holder;
    }

}
