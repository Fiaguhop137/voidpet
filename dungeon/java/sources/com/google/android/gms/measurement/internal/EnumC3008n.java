package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC3008n {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f35694a;

    EnumC3008n(char c10) {
        this.f35694a = c10;
    }

    public static EnumC3008n e(char c10) {
        for (EnumC3008n enumC3008n : values()) {
            if (enumC3008n.f35694a == c10) {
                return enumC3008n;
            }
        }
        return UNSET;
    }

    final /* synthetic */ char g() {
        return this.f35694a;
    }
}
