package com.android.volley;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.android.volley.b.a f27905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f27906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27907d;

    public interface a {
        void a(u uVar);
    }

    public interface b {
        void a(Object obj);
    }

    private p(u uVar) {
        this.f27907d = false;
        this.f27904a = null;
        this.f27905b = null;
        this.f27906c = uVar;
    }

    private p(Object obj, com.android.volley.b.a aVar) {
        this.f27907d = false;
        this.f27904a = obj;
        this.f27905b = aVar;
        this.f27906c = null;
    }

    public static p a(u uVar) {
        return new p(uVar);
    }

    public static p c(Object obj, com.android.volley.b.a aVar) {
        return new p(obj, aVar);
    }

    public boolean b() {
        return this.f27906c == null;
    }
}
