package ca.nuchange.springboot.aws.models;

public class Bar {
    private String value;

    Bar() {
    }

    public Bar(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
