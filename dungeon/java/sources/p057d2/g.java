package p057d2;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f39679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f39680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f39681e;

    public g(String str, long j10, List list, List list2) {
        this(str, j10, list, list2, null);
    }

    public g(String str, long j10, List list, List list2, e eVar) {
        this.f39677a = str;
        this.f39678b = j10;
        this.f39679c = Collections.unmodifiableList(list);
        this.f39680d = Collections.unmodifiableList(list2);
        this.f39681e = eVar;
    }

    public int a(int i10) {
        int size = this.f39679c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((a) this.f39679c.get(i11)).f39632b == i10) {
                return i11;
            }
        }
        return -1;
    }
}
