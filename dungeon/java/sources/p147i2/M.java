package p147i2;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class M implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N.f f43644a;

    public /* synthetic */ M(N.f fVar) {
        this.f43644a = fVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return N.a(this.f43644a, obj, obj2);
    }
}
