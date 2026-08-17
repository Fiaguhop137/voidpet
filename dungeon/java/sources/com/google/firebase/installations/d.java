package com.google.firebase.installations;

import H9.j;

/* JADX INFO: loaded from: classes2.dex */
public class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f37439a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f37439a = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f37439a = aVar;
    }
}
