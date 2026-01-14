package com.jad;

public enum EBaz implements IBaz {
    BAZ1("First Baz"),
    BAZ2("Second Baz"),
    BAZ3("Third Baz");

    private String name;

    private EBaz(String name) {
        this.name = name;
    }

    public void doSomethingLikeABaz() {
        
    }

    public String getName() {
        return name;
    }


}

