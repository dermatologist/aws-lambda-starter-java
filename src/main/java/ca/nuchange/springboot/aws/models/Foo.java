package ca.nuchange.springboot.aws.models;

public class Foo {
    private String value;

    Foo() {
    }

    Foo(String value) {
        this.value = value;
    }

    public String lowercase() {
        return this.value.toLowerCase();
    }

    public String uppercase() {
        return this.value.toUpperCase();
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
