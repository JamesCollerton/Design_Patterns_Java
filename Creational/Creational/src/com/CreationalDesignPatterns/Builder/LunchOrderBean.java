package com.CreationalDesignPatterns.Builder;

public class LunchOrderBean {

    /**
     * Using just getters and setters we have
     *  - Not immutable
     *  - No definition of when a sandwich is valid (could have nothing set)
     */

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public void setCondiments(String condiments) {
        this.condiments = condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

}
