public class Wine {
    String titleWine;
    String brandNameWine;
    String country;
    String dateBottling;
    String description;

    public Wine(String titleWine, String brandNameWine, String country, String dateBottling, String description) {
        this.titleWine = titleWine;
        this.brandNameWine = brandNameWine;
        this.country = country;
        this.dateBottling = dateBottling;
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

    public String getDateBottling() {
        return dateBottling;
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

    public void setDateBottling(String dateBottling) {
        this.dateBottling = dateBottling;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
