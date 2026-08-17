package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class l0 implements Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f37983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f37985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f37986d;

    l0(T t10, String str, Object[] objArr) {
        this.f37983a = t10;
        this.f37984b = str;
        this.f37985c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f37986d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f37986d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.protobuf.Q
    public boolean a() {
        return (this.f37986d & 2) == 2;
    }

    @Override // com.google.protobuf.Q
    public T b() {
        return this.f37983a;
    }

    @Override // com.google.protobuf.Q
    public i0 c() {
        int i10 = this.f37986d;
        if ((i10 & 1) != 0) {
            return i0.PROTO2;
        }
        return (i10 & 4) == 4 ? i0.EDITIONS : i0.PROTO3;
    }

    Object[] d() {
        return this.f37985c;
    }

    String e() {
        return this.f37984b;
    }
}
