package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1950f implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1950f f23435b = new i(AbstractC1964u.f23653d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final InterfaceC0286f f23436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator f23437d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23438a = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$a */
    class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23439a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23440b;

        a() {
            this.f23440b = AbstractC1950f.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1950f.g
        public byte e() {
            int i10 = this.f23439a;
            if (i10 >= this.f23440b) {
                throw new NoSuchElementException();
            }
            this.f23439a = i10 + 1;
            return AbstractC1950f.this.l(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23439a < this.f23440b;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$b */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC1950f abstractC1950f, AbstractC1950f abstractC1950f2) {
            g gVarN = abstractC1950f.n();
            g gVarN2 = abstractC1950f2.n();
            while (gVarN.hasNext() && gVarN2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC1950f.t(gVarN.e())).compareTo(Integer.valueOf(AbstractC1950f.t(gVarN2.e())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC1950f.size()).compareTo(Integer.valueOf(abstractC1950f2.size()));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$c */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(e());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$d */
    private static final class d implements InterfaceC0286f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1950f.InterfaceC0286f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$e */
    private static final class e extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f23442f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f23443g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC1950f.g(i10, i10 + i11, bArr.length);
            this.f23442f = i10;
            this.f23443g = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1950f.i
        protected int B() {
            return this.f23442f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1950f.i, androidx.datastore.preferences.protobuf.AbstractC1950f
        public byte c(int i10) {
            AbstractC1950f.e(i10, size());
            return this.f23444e[this.f23442f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1950f.i, androidx.datastore.preferences.protobuf.AbstractC1950f
        protected void k(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f23444e, B() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1950f.i, androidx.datastore.preferences.protobuf.AbstractC1950f
        byte l(int i10) {
            return this.f23444e[this.f23442f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1950f.i, androidx.datastore.preferences.protobuf.AbstractC1950f
        public int size() {
            return this.f23443g;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$f, reason: collision with other inner class name */
    private interface InterfaceC0286f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$g */
    public interface g extends Iterator {
        byte e();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$h */
    static abstract class h extends AbstractC1950f {
        private h() {
        }

        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.n();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$i */
    private static class i extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final byte[] f23444e;

        i(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f23444e = bArr;
        }

        final boolean A(AbstractC1950f abstractC1950f, int i10, int i11) {
            if (i11 > abstractC1950f.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC1950f.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC1950f.size());
            }
            if (!(abstractC1950f instanceof i)) {
                return abstractC1950f.q(i10, i12).equals(q(0, i11));
            }
            i iVar = (i) abstractC1950f;
            byte[] bArr = this.f23444e;
            byte[] bArr2 = iVar.f23444e;
            int iB = B() + i11;
            int iB2 = B();
            int iB3 = iVar.B() + i10;
            while (iB2 < iB) {
                if (bArr[iB2] != bArr2[iB3]) {
                    return false;
                }
                iB2++;
                iB3++;
            }
            return true;
        }

        protected int B() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1950f
        public byte c(int i10) {
            return this.f23444e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1950f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC1950f) || size() != ((AbstractC1950f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int iP = p();
            int iP2 = iVar.p();
            if (iP == 0 || iP2 == 0 || iP == iP2) {
                return A(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1950f
        protected void k(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f23444e, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1950f
        byte l(int i10) {
            return this.f23444e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1950f
        protected final int o(int i10, int i11, int i12) {
            return AbstractC1964u.g(i10, this.f23444e, B() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1950f
        public final AbstractC1950f q(int i10, int i11) {
            int iG = AbstractC1950f.g(i10, i11, size());
            return iG == 0 ? AbstractC1950f.f23435b : new e(this.f23444e, B() + i10, iG);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1950f
        public int size() {
            return this.f23444e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1950f
        final void y(AbstractC1949e abstractC1949e) {
            abstractC1949e.a(this.f23444e, B(), size());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$j */
    private static final class j implements InterfaceC0286f {
        private j() {
        }

        /* synthetic */ j(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1950f.InterfaceC0286f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f23436c = AbstractC1948d.c() ? new j(null) : new d(null);
        f23437d = new b();
    }

    AbstractC1950f() {
    }

    static void e(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int g(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static AbstractC1950f h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC1950f i(byte[] bArr, int i10, int i11) {
        g(i10, i10 + i11, bArr.length);
        return new i(f23436c.a(bArr, i10, i11));
    }

    public static AbstractC1950f j(String str) {
        return new i(str.getBytes(AbstractC1964u.f23651b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int t(byte b10) {
        return b10 & 255;
    }

    private String v() {
        if (size() <= 50) {
            return f0.a(this);
        }
        return f0.a(q(0, 47)) + "...";
    }

    static AbstractC1950f w(byte[] bArr) {
        return new i(bArr);
    }

    static AbstractC1950f x(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    public abstract byte c(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iO = this.f23438a;
        if (iO == 0) {
            int size = size();
            iO = o(size, 0, size);
            if (iO == 0) {
                iO = 1;
            }
            this.f23438a = iO;
        }
        return iO;
    }

    protected abstract void k(byte[] bArr, int i10, int i11, int i12);

    abstract byte l(int i10);

    public g n() {
        return new a();
    }

    protected abstract int o(int i10, int i11, int i12);

    protected final int p() {
        return this.f23438a;
    }

    public abstract AbstractC1950f q(int i10, int i11);

    public final byte[] s() {
        int size = size();
        if (size == 0) {
            return AbstractC1964u.f23653d;
        }
        byte[] bArr = new byte[size];
        k(bArr, 0, 0, size);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), v());
    }

    abstract void y(AbstractC1949e abstractC1949e);
}
