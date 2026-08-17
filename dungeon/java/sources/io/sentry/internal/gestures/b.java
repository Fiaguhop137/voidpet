package io.sentry.internal.gestures;

import io.sentry.util.w;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference f45903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f45904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f45905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f45906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final String f45907e;

    public enum a {
        CLICKABLE,
        SCROLLABLE
    }

    public b(Object obj, String str, String str2, String str3, String str4) {
        this.f45903a = new WeakReference(obj);
        this.f45904b = str;
        this.f45905c = str2;
        this.f45906d = str3;
        this.f45907e = str4;
    }

    public String a() {
        return this.f45904b;
    }

    public String b() {
        String str = this.f45905c;
        return str != null ? str : (String) w.c(this.f45906d, "UiElement.tag can't be null");
    }

    public String c() {
        return this.f45907e;
    }

    public String d() {
        return this.f45905c;
    }

    public String e() {
        return this.f45906d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (w.a(this.f45904b, bVar.f45904b) && w.a(this.f45905c, bVar.f45905c) && w.a(this.f45906d, bVar.f45906d)) {
                return true;
            }
        }
        return false;
    }

    public Object f() {
        return this.f45903a.get();
    }

    public int hashCode() {
        return w.b(this.f45903a, this.f45905c, this.f45906d);
    }
}
