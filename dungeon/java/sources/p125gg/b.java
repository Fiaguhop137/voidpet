package p125gg;

import java.security.Permission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p071dg.a;

/* JADX INFO: loaded from: classes3.dex */
class b implements a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Permission f42485e = new p071dg.b("BC", "threadLocalEcImplicitlyCa");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Permission f42486f = new p071dg.b("BC", "ecImplicitlyCa");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Permission f42487g = new p071dg.b("BC", "threadLocalDhDefaultParams");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Permission f42488h = new p071dg.b("BC", "DhDefaultParams");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Permission f42489i = new p071dg.b("BC", "acceptableEcCurves");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Permission f42490j = new p071dg.b("BC", "additionalEcParameters");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ThreadLocal f42491a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ThreadLocal f42492b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Set f42493c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Map f42494d = new HashMap();

    b() {
    }
}
