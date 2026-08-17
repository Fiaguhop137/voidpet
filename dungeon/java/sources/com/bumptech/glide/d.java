package com.bumptech.glide;

import E4.o;
import android.content.Context;
import com.bumptech.glide.module.AppGlideModule;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p323s.C4101a;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p310r4.k f28545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p328s4.d f28546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p328s4.b f28547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p346t4.h f28548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p364u4.a f28549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p364u4.a f28550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p346t4.a.InterfaceC0675a f28551i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p346t4.i f28552j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private E4.c f28553k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o.b f28556n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private p364u4.a f28557o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f28558p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f28559q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f28543a = new C4101a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f.a f28544b = new f.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f28554l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.bumptech.glide.c.a f28555m = new a();

    class a implements com.bumptech.glide.c.a {
        a() {
        }

        @Override // com.bumptech.glide.c.a
        public H4.f build() {
            return new H4.f();
        }
    }

    static final class b {
    }

    public static final class c {
    }

    com.bumptech.glide.c a(Context context, List list, AppGlideModule appGlideModule) {
        if (this.f28549g == null) {
            this.f28549g = p364u4.a.i();
        }
        if (this.f28550h == null) {
            this.f28550h = p364u4.a.f();
        }
        if (this.f28557o == null) {
            this.f28557o = p364u4.a.d();
        }
        if (this.f28552j == null) {
            this.f28552j = new t4.i.a(context).a();
        }
        if (this.f28553k == null) {
            this.f28553k = new E4.e();
        }
        if (this.f28546d == null) {
            int iB = this.f28552j.b();
            if (iB > 0) {
                this.f28546d = new p328s4.j(iB);
            } else {
                this.f28546d = new p328s4.e();
            }
        }
        if (this.f28547e == null) {
            this.f28547e = new p328s4.i(this.f28552j.a());
        }
        if (this.f28548f == null) {
            this.f28548f = new p346t4.g(this.f28552j.d());
        }
        if (this.f28551i == null) {
            this.f28551i = new p346t4.f(context);
        }
        if (this.f28545c == null) {
            this.f28545c = new p310r4.k(this.f28548f, this.f28551i, this.f28550h, this.f28549g, p364u4.a.k(), this.f28557o, this.f28558p);
        }
        List list2 = this.f28559q;
        if (list2 == null) {
            this.f28559q = Collections.EMPTY_LIST;
        } else {
            this.f28559q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.c(context, this.f28545c, this.f28548f, this.f28546d, this.f28547e, new o(this.f28556n), this.f28553k, this.f28554l, this.f28555m, this.f28543a, this.f28559q, list, appGlideModule, this.f28544b.b());
    }

    public d b(int i10) {
        if (i10 < 2 || i10 > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.f28554l = i10;
        return this;
    }

    void c(o.b bVar) {
        this.f28556n = bVar;
    }
}
