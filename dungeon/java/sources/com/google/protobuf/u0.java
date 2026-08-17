package com.google.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class u0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f38032a;

    public u0(T t10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f38032a = null;
    }

    public B a() {
        return new B(getMessage());
    }
}
