package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo implements IFoo {

    private IBaz baz;
    private List<IBar> bars = new ArrayList<IBar>();
    private IQux qux;
    private ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
    }

    public void doSomethingLikeAFoo() {
        
    }

    public IBaz getBaz() {
        return baz;
    }

    public List<IBar> getBars() {
        return bars;
    }
    
    public IQux getQux() {
        return qux;
    }

    public void setCorge(ICorge corge) {
        this.corge = corge;
    }

    public ICorge getCorge() {
        return corge;
    }

    public void addBar(IBar bar) {
        this.bars.add(bar);
    }
}
