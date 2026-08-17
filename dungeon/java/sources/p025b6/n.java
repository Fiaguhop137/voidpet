package p025b6;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f26313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f26314e;

    public n(int i10, int i11, int i12, p pVar, Map map) {
        this.f26310a = i10;
        this.f26311b = i11;
        this.f26312c = i12;
        this.f26313d = pVar;
        this.f26314e = map;
    }

    @Override // p025b6.l, H5.a
    public Map getExtras() {
        return this.f26314e;
    }

    @Override // p025b6.m
    public int getHeight() {
        return this.f26311b;
    }

    @Override // p025b6.m
    public int getWidth() {
        return this.f26310a;
    }
}
