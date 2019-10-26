package liliang.pojo;

public class Unit {

    private Integer id;

    private String counit;

    private String unitphone;

    private Integer resmoney;

    private String bigbed;

    private String twobed;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCounit() {
        return counit;
    }
    public void setCounit(String counit) {
        this.counit = counit == null ? null : counit.trim();
    }

    public String getUnitphone() {
        return unitphone;
    }
    public void setUnitphone(String unitphone) {
        this.unitphone = unitphone == null ? null : unitphone.trim();
    }

    public Integer getResmoney() {
        return resmoney;
    }
    public void setResmoney(Integer resmoney) {
        this.resmoney = resmoney;
    }

    public String getBigbed() {
        return bigbed;
    }
    public void setBigbed(String bigbed) {
        this.bigbed = bigbed == null ? null : bigbed.trim();
    }

    public String getTwobed() {
        return twobed;
    }
    public void setTwobed(String twobed) {
        this.twobed = twobed == null ? null : twobed.trim();
    }
}
