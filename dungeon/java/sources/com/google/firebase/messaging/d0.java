package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;
import p170j8.AbstractC3851p;

/* JADX INFO: loaded from: classes2.dex */
final class d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f37584d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37587c;

    private d0(String str, String str2) {
        this.f37585a = d(str2, str);
        this.f37586b = str;
        this.f37587c = str + "!" + str2;
    }

    static d0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new d0(strArrSplit[0], strArrSplit[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f37584d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String b() {
        return this.f37586b;
    }

    public String c() {
        return this.f37585a;
    }

    public String e() {
        return this.f37587c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f37585a.equals(d0Var.f37585a) && this.f37586b.equals(d0Var.f37586b);
    }

    public int hashCode() {
        return AbstractC3851p.b(this.f37586b, this.f37585a);
    }
}
