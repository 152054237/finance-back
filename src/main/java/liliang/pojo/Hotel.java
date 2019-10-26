package liliang.pojo;

public class Hotel {

    private Integer userid;
    private String time;
    private String platform;
    private Integer romno;
    private String name;
    private String romtype;
    private Integer paymoney;
    private Integer money;
    private String brokerage;
    private String day;
    private String classes;
    private String person;


    public Integer getUserid() {
        return userid;
    }
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public Integer getRomno() {
        return romno;
    }
    public void setRomno(Integer romno) {
        this.romno = romno;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRomtype() {
        return romtype;
    }
    public void setRomtype(String romtype) {
        this.romtype = romtype == null ? null : romtype.trim();
    }

    public Integer getPaymoney() {
        return paymoney;
    }
    public Integer getMoney() {
        return money;
    }

    public void setPaymoney(Integer paymoney) {
        this.paymoney = paymoney;
    }
    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getBrokerage() {
        return brokerage;
    }
    public void setBrokerage(String brokerage) {
        this.brokerage = brokerage;
    }

    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public String getClasses() {
        return classes;
    }
    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getPerson() {
        return person;
    }
    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }
}