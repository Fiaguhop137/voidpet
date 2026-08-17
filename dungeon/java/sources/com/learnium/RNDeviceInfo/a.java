package com.learnium.RNDeviceInfo;

/* JADX INFO: loaded from: classes2.dex */
public enum a {
    HANDSET("Handset"),
    TABLET("Tablet"),
    TV("Tv"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38596a;

    a(String str) {
        this.f38596a = str;
    }

    public String g() {
        return this.f38596a;
    }
}
