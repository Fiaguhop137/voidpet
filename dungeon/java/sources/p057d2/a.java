package p057d2;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f39633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f39634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f39635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f39636f;

    public a(long j10, int i10, List list, List list2, List list3, List list4) {
        this.f39631a = j10;
        this.f39632b = i10;
        this.f39633c = Collections.unmodifiableList(list);
        this.f39634d = Collections.unmodifiableList(list2);
        this.f39635e = Collections.unmodifiableList(list3);
        this.f39636f = Collections.unmodifiableList(list4);
    }
}
