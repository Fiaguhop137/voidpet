package com.reactnativegooglesignin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38646b;

    public a(Exception e10, String str) {
        String strA;
        Intrinsics.checkNotNullParameter(e10, "e");
        String localizedMessage = e10.getLocalizedMessage();
        localizedMessage = localizedMessage == null ? e10.getMessage() : localizedMessage;
        if (!(e10 instanceof p135h8.b)) {
            if (!(e10 instanceof p135h8.l)) {
                this.f38645a = str;
                this.f38646b = localizedMessage;
                return;
            }
            this.f38645a = str;
            this.f38646b = localizedMessage + " Make sure you have the latest version of Google Play Services installed.";
            return;
        }
        p135h8.b bVar = (p135h8.b) e10;
        int iB = bVar.b();
        if (localizedMessage == null || localizedMessage.length() <= 10 || localizedMessage == null) {
            strA = p063d8.c.a(iB);
            Intrinsics.checkNotNullExpressionValue(strA, "getStatusCodeString(...)");
        } else {
            strA = new Regex(iB + ": ").f(localizedMessage, "");
        }
        this.f38645a = String.valueOf((iB == 12501 || bVar.a().f4()) ? 12501 : iB);
        this.f38646b = strA;
    }

    public final String a() {
        return this.f38645a;
    }

    public final String b() {
        return this.f38646b;
    }
}
