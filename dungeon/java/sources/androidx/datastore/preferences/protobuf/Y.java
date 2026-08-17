package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class Y implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f23405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f23407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23408d;

    Y(K k10, String str, Object[] objArr) {
        this.f23405a = k10;
        this.f23406b = str;
        this.f23407c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f23408d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f23408d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public boolean a() {
        return (this.f23408d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public K b() {
        return this.f23405a;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public V c() {
        int i10 = this.f23408d;
        if ((i10 & 1) != 0) {
            return V.PROTO2;
        }
        return (i10 & 4) == 4 ? V.EDITIONS : V.PROTO3;
    }

    Object[] d() {
        return this.f23407c;
    }

    String e() {
        return this.f23406b;
    }
}
