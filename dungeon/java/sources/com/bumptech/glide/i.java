package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p310r4.t;
import p310r4.v;
import p382v4.o;
import p382v4.p;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f28584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G4.a f28585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G4.e f28586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G4.f f28587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f28588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final D4.f f28589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final G4.b f28590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final G4.d f28591h = new G4.d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final G4.c f28592i = new G4.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p199l1.e f28593j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public c(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }
    }

    public static class d extends a {
        public d(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public i() {
        p199l1.e eVarE = M4.a.e();
        this.f28593j = eVarE;
        this.f28584a = new p(eVarE);
        this.f28585b = new G4.a();
        this.f28586c = new G4.e();
        this.f28587d = new G4.f();
        this.f28588e = new com.bumptech.glide.load.data.f();
        this.f28589f = new D4.f();
        this.f28590g = new G4.b();
        v(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    private List f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f28586c.d(cls, cls2)) {
            for (Class cls5 : this.f28589f.b(cls4, cls3)) {
                arrayList.add(new p310r4.i(cls, cls4, cls5, this.f28586c.b(cls, cls4), this.f28589f.a(cls4, cls5), this.f28593j));
            }
        }
        return arrayList;
    }

    public i a(Class cls, Class cls2, p274p4.j jVar) {
        e("legacy_append", cls, cls2, jVar);
        return this;
    }

    public i b(Class cls, Class cls2, o oVar) {
        this.f28584a.a(cls, cls2, oVar);
        return this;
    }

    public i c(Class cls, p274p4.d dVar) {
        this.f28585b.a(cls, dVar);
        return this;
    }

    public i d(Class cls, p274p4.k kVar) {
        this.f28587d.a(cls, kVar);
        return this;
    }

    public i e(String str, Class cls, Class cls2, p274p4.j jVar) {
        this.f28586c.a(str, jVar, cls, cls2);
        return this;
    }

    public List g() {
        List listB = this.f28590g.b();
        if (listB.isEmpty()) {
            throw new b();
        }
        return listB;
    }

    public t h(Class cls, Class cls2, Class cls3) {
        Class cls4;
        Class cls5;
        Class cls6;
        t tVarA = this.f28592i.a(cls, cls2, cls3);
        t tVar = null;
        if (this.f28592i.c(tVarA)) {
            return null;
        }
        if (tVarA != null) {
            return tVarA;
        }
        List listF = f(cls, cls2, cls3);
        if (listF.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            tVar = new t(cls4, cls5, cls6, listF, this.f28593j);
        }
        this.f28592i.d(cls4, cls5, cls6, tVar);
        return tVar;
    }

    public List i(Object obj) {
        return this.f28584a.d(obj);
    }

    public List j(Class cls, Class cls2, Class cls3) {
        List listA = this.f28591h.a(cls, cls2, cls3);
        if (listA == null) {
            listA = new ArrayList();
            Iterator it = this.f28584a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f28586c.d((Class) it.next(), cls2)) {
                    if (!this.f28589f.b(cls4, cls3).isEmpty() && !listA.contains(cls4)) {
                        listA.add(cls4);
                    }
                }
            }
            this.f28591h.b(cls, cls2, cls3, Collections.unmodifiableList(listA));
        }
        return listA;
    }

    public p274p4.k k(v vVar) {
        p274p4.k kVarB = this.f28587d.b(vVar.b());
        if (kVarB != null) {
            return kVarB;
        }
        throw new d(vVar.b());
    }

    public com.bumptech.glide.load.data.e l(Object obj) {
        return this.f28588e.a(obj);
    }

    public p274p4.d m(Object obj) {
        p274p4.d dVarB = this.f28585b.b(obj.getClass());
        if (dVarB != null) {
            return dVarB;
        }
        throw new e(obj.getClass());
    }

    public boolean n(v vVar) {
        return this.f28587d.b(vVar.b()) != null;
    }

    public i o(Class cls, Class cls2, p274p4.j jVar) {
        q("legacy_prepend_all", cls, cls2, jVar);
        return this;
    }

    public i p(Class cls, Class cls2, o oVar) {
        this.f28584a.f(cls, cls2, oVar);
        return this;
    }

    public i q(String str, Class cls, Class cls2, p274p4.j jVar) {
        this.f28586c.e(str, jVar, cls, cls2);
        return this;
    }

    public i r(ImageHeaderParser imageHeaderParser) {
        this.f28590g.a(imageHeaderParser);
        return this;
    }

    public i s(com.bumptech.glide.load.data.e.a aVar) {
        this.f28588e.b(aVar);
        return this;
    }

    public i t(Class cls, Class cls2, D4.e eVar) {
        this.f28589f.c(cls, cls2, eVar);
        return this;
    }

    public i u(Class cls, Class cls2, o oVar) {
        this.f28584a.g(cls, cls2, oVar);
        return this;
    }

    public final i v(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f28586c.f(arrayList);
        return this;
    }
}
