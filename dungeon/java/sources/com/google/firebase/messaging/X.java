package com.google.firebase.messaging;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class X extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37533a;

    X(String str) {
        super(str);
        this.f37533a = a(str);
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.getClass();
        switch (lowerCase) {
            case "service_not_available":
                return 3;
            case "toomanymessages":
                return 4;
            case "invalid_parameters":
            case "missing_to":
                return 1;
            case "messagetoobig":
                return 2;
            default:
                return 0;
        }
    }
}
