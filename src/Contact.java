public class Contact {

    public String name;
    public String mobile;
    public String work;
    public String home;
    public String city;

    public Contact(String name, String mobile, String work, String home, String city) {
        this.name = name;
        this.mobile = mobile;
        this.work = work;
        this.home = home;
        this.city = city;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        String output = "<" + this.name + "> (mobile=" + this.mobile + "";
        if (!this.city.equals("")) {
            output += ", city=" + city;
        }
        if (!this.work.equals("")) {
            output += ", work=" + work;
        }
        if (!this.home.equals("")) {
            output += ", home=" + home;
        }
        return (" " + output + ")");
    }
}
