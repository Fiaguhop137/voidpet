package io.sentry.clientreport;

import io.sentry.util.w;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45765b;

    d(String str, String str2) {
        this.f45764a = str;
        this.f45765b = str2;
    }

    public String a() {
        return this.f45765b;
    }

    public String b() {
        return this.f45764a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return w.a(b(), dVar.b()) && w.a(a(), dVar.a());
    }

    public int hashCode() {
        return w.b(b(), a());
    }
}
