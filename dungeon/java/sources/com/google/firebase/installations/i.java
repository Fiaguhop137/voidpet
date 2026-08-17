package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f37447b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f37448c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static i f37449d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p011aa.a f37450a;

    private i(p011aa.a aVar) {
        this.f37450a = aVar;
    }

    public static i c() {
        return d(p011aa.b.b());
    }

    public static i d(p011aa.a aVar) {
        if (f37449d == null) {
            f37449d = new i(aVar);
        }
        return f37449d;
    }

    static boolean g(String str) {
        return f37448c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f37450a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(Y9.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f37447b;
    }
}
