import java.time.LocalDate;
import java.time.Period;

public class Wine {
    public String titleWine;
    private String brandNameWine;
    private String country;
    private LocalDate date;
    private String description;

    public Wine (){
    }

    public Wine(String titleWine, String brandNameWine, String country,
                LocalDate date, String description) {
        this.titleWine = titleWine;
        this.brandNameWine = brandNameWine;
        this.country = country;
        this.date = date;
        this.description = description;
    }

    public String getTitleWine() {
        return titleWine;
    }

    public String getBrandNameWine() {
        return brandNameWine;
    }

    public String getCountry() {
        return country;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setTitleWine(String titleWine) {
        this.titleWine = titleWine;
    }

    public void setBrandNameWine(String brandNameWine) {
        this.brandNameWine = brandNameWine;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void winePeriod(LocalDate now){
        int years = Period.between(date, now).getYears();
        System.out.println("Выдержка вина составляет " + years);

    }
}
