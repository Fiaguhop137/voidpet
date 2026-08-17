package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3682b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f45675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B0 f45676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable f45677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f45678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f45679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f45680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f45681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f45682h;

    public C3682b(B0 b10, String str, String str2, String str3, boolean z10) {
        this.f45675a = null;
        this.f45676b = b10;
        this.f45677c = null;
        this.f45679e = str;
        this.f45680f = str2;
        this.f45682h = str3;
        this.f45681g = z10;
    }

    public C3682b(Callable callable, String str, String str2, String str3, boolean z10) {
        this.f45675a = null;
        this.f45676b = null;
        this.f45677c = callable;
        this.f45679e = str;
        this.f45680f = str2;
        this.f45682h = str3;
        this.f45681g = z10;
    }

    public C3682b(byte[] bArr, String str, String str2, String str3, boolean z10) {
        this.f45675a = bArr;
        this.f45676b = null;
        this.f45677c = null;
        this.f45679e = str;
        this.f45680f = str2;
        this.f45682h = str3;
        this.f45681g = z10;
    }

    public C3682b(byte[] bArr, String str, String str2, boolean z10) {
        this(bArr, str, str2, "event.attachment", z10);
    }

    public static C3682b a(Callable callable, String str, String str2, boolean z10) {
        return new C3682b(callable, str, str2, "event.attachment", z10);
    }

    public static C3682b b(byte[] bArr) {
        return new C3682b(bArr, "thread-dump.txt", "text/plain", false);
    }

    public static C3682b c(io.sentry.protocol.J j10) {
        return new C3682b((B0) j10, "view-hierarchy.json", "application/json", "event.view_hierarchy", false);
    }

    public String d() {
        return this.f45682h;
    }

    public Callable e() {
        return this.f45677c;
    }

    public byte[] f() {
        return this.f45675a;
    }

    public String g() {
        return this.f45680f;
    }

    public String h() {
        return this.f45679e;
    }

    public String i() {
        return this.f45678d;
    }

    public B0 j() {
        return this.f45676b;
    }

    boolean k() {
        return this.f45681g;
    }
}
