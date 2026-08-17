package Pf;

/* JADX INFO: renamed from: Pf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1303f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final InterfaceC1301e[] f9121d = new InterfaceC1301e[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC1301e[] f9122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9124c;

    public C1303f() {
        this(10);
    }

    public C1303f(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.f9122a = i10 == 0 ? f9121d : new InterfaceC1301e[i10];
        this.f9123b = 0;
        this.f9124c = false;
    }

    static InterfaceC1301e[] b(InterfaceC1301e[] interfaceC1301eArr) {
        return interfaceC1301eArr.length < 1 ? f9121d : (InterfaceC1301e[]) interfaceC1301eArr.clone();
    }

    private void e(int i10) {
        InterfaceC1301e[] interfaceC1301eArr = new InterfaceC1301e[Math.max(this.f9122a.length, i10 + (i10 >> 1))];
        System.arraycopy(this.f9122a, 0, interfaceC1301eArr, 0, this.f9123b);
        this.f9122a = interfaceC1301eArr;
        this.f9124c = false;
    }

    public void a(InterfaceC1301e interfaceC1301e) {
        if (interfaceC1301e == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        int length = this.f9122a.length;
        int i10 = this.f9123b + 1;
        if (this.f9124c | (i10 > length)) {
            e(i10);
        }
        this.f9122a[this.f9123b] = interfaceC1301e;
        this.f9123b = i10;
    }

    InterfaceC1301e[] c() {
        int i10 = this.f9123b;
        if (i10 == 0) {
            return f9121d;
        }
        InterfaceC1301e[] interfaceC1301eArr = new InterfaceC1301e[i10];
        System.arraycopy(this.f9122a, 0, interfaceC1301eArr, 0, i10);
        return interfaceC1301eArr;
    }

    public InterfaceC1301e d(int i10) {
        if (i10 < this.f9123b) {
            return this.f9122a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10 + " >= " + this.f9123b);
    }

    public int f() {
        return this.f9123b;
    }

    InterfaceC1301e[] g() {
        int i10 = this.f9123b;
        if (i10 == 0) {
            return f9121d;
        }
        InterfaceC1301e[] interfaceC1301eArr = this.f9122a;
        if (interfaceC1301eArr.length == i10) {
            this.f9124c = true;
            return interfaceC1301eArr;
        }
        InterfaceC1301e[] interfaceC1301eArr2 = new InterfaceC1301e[i10];
        System.arraycopy(interfaceC1301eArr, 0, interfaceC1301eArr2, 0, i10);
        return interfaceC1301eArr2;
    }
}
