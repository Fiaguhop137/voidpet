package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2446c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2437b f32876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C2437b f32877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f32878c;

    public C2446c() {
        this.f32876a = new C2437b("", 0L, null);
        this.f32877b = new C2437b("", 0L, null);
        this.f32878c = new ArrayList();
    }

    public C2446c(C2437b c2437b) {
        this.f32876a = c2437b;
        this.f32877b = c2437b.clone();
        this.f32878c = new ArrayList();
    }

    public final C2437b a() {
        return this.f32876a;
    }

    public final void b(C2437b c2437b) {
        this.f32876a = c2437b;
        this.f32877b = c2437b.clone();
        this.f32878c.clear();
    }

    public final C2437b c() {
        return this.f32877b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C2446c c2446c = new C2446c(this.f32876a.clone());
        Iterator it = this.f32878c.iterator();
        while (it.hasNext()) {
            c2446c.f32878c.add(((C2437b) it.next()).clone());
        }
        return c2446c;
    }

    public final void d(C2437b c2437b) {
        this.f32877b = c2437b;
    }

    public final void e(String str, long j10, Map map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, C2437b.h(str2, this.f32876a.e(str2), map.get(str2)));
        }
        this.f32878c.add(new C2437b(str, j10, map2));
    }

    public final List f() {
        return this.f32878c;
    }
}
