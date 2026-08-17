package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f45117a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f45118b = new h();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        int iCompare = Long.compare(this.f45117a.u(), cVar.f45117a.u());
        return iCompare == 0 ? Long.compare(this.f45118b.u(), cVar.f45118b.u()) : iCompare;
    }

    public final h g() {
        return this.f45117a;
    }

    public final h h() {
        return this.f45118b;
    }
}
