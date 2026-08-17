package p323s;

import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341t.d;

/* JADX INFO: renamed from: s.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4105e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f52690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52693d;

    public C4105e() {
        this(0, 1, null);
    }

    public C4105e(int i10) {
        if (!(i10 >= 1)) {
            d.a("capacity must be >= 1");
        }
        if (!(i10 <= 1073741824)) {
            d.a("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f52693d = i10 - 1;
        this.f52690a = new int[i10];
    }

    public /* synthetic */ C4105e(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }

    private final void c() {
        int[] iArr = this.f52690a;
        int length = iArr.length;
        int i10 = this.f52691b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        AbstractC3952n.j(iArr, iArr2, 0, i10, length);
        AbstractC3952n.j(this.f52690a, iArr2, i11, 0, this.f52691b);
        this.f52690a = iArr2;
        this.f52691b = 0;
        this.f52692c = length;
        this.f52693d = i12 - 1;
    }

    public final void a(int i10) {
        int[] iArr = this.f52690a;
        int i11 = this.f52692c;
        iArr[i11] = i10;
        int i12 = this.f52693d & (i11 + 1);
        this.f52692c = i12;
        if (i12 == this.f52691b) {
            c();
        }
    }

    public final void b() {
        this.f52692c = this.f52691b;
    }

    public final boolean d() {
        return this.f52691b == this.f52692c;
    }

    public final int e() {
        int i10 = this.f52691b;
        if (i10 == this.f52692c) {
            C4106f c4106f = C4106f.f52695a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f52690a[i10];
        this.f52691b = (i10 + 1) & this.f52693d;
        return i11;
    }
}
