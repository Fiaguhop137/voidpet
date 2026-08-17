package com.applovin.impl;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class s1 implements Comparable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f28339i = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f28342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f28343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f28345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f28346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f28347h;

    public s1(r1 r1Var) {
        this.f28340a = r1Var.f28314a;
        this.f28341b = r1Var.f28315b;
        Map map = r1Var.f28316c;
        this.f28342c = map == null ? Collections.EMPTY_MAP : map;
        this.f28343d = r1Var.f28317d;
        this.f28344e = r1Var.f28318e;
        this.f28345f = r1Var.f28319f;
        this.f28346g = r1Var.f28320g;
        this.f28347h = f28339i.incrementAndGet();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f28347h - ((s1) obj).f28347h;
    }
}
