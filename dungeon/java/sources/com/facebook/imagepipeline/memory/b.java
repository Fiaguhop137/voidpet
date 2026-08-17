package com.facebook.imagepipeline.memory;

import V4.k;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Queue f28936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f28937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28938e;

    public b(int i10, int i11, int i12, boolean z10) {
        k.i(i10 > 0);
        k.i(i11 >= 0);
        k.i(i12 >= 0);
        this.f28934a = i10;
        this.f28935b = i11;
        this.f28936c = new LinkedList();
        this.f28938e = i12;
        this.f28937d = z10;
    }

    void a(Object obj) {
        this.f28936c.add(obj);
    }

    public void b() {
        k.i(this.f28938e > 0);
        this.f28938e--;
    }

    public Object c() {
        Object objG = g();
        if (objG != null) {
            this.f28938e++;
        }
        return objG;
    }

    int d() {
        return this.f28936c.size();
    }

    public void e() {
        this.f28938e++;
    }

    public boolean f() {
        return this.f28938e + d() > this.f28935b;
    }

    public Object g() {
        return this.f28936c.poll();
    }

    public void h(Object obj) {
        k.g(obj);
        if (this.f28937d) {
            k.i(this.f28938e > 0);
            this.f28938e--;
            a(obj);
        } else {
            int i10 = this.f28938e;
            if (i10 <= 0) {
                W4.a.o("BUCKET", "Tried to release value %s from an empty bucket!", obj);
            } else {
                this.f28938e = i10 - 1;
                a(obj);
            }
        }
    }
}
