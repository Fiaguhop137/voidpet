package p017ag;

import Ug.a;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f19790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19791c;

    public e(byte[] bArr, int i10) {
        this(bArr, i10, -1);
    }

    public e(byte[] bArr, int i10, int i11) {
        this.f19790b = a.e(bArr);
        this.f19791c = i10;
        this.f19789a = i11;
    }

    public int a() {
        return this.f19791c;
    }

    public byte[] b() {
        return a.e(this.f19790b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (eVar.f19791c != this.f19791c) {
            return false;
        }
        return a.b(this.f19790b, eVar.f19790b);
    }

    public int hashCode() {
        return this.f19791c ^ a.n(this.f19790b);
    }
}
