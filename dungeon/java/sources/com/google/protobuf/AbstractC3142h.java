package com.google.protobuf;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3142h implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3142h f37908b = new j(A.f37678d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f37909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator f37910d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37911a = 0;

    /* JADX INFO: renamed from: com.google.protobuf.h$a */
    class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f37912a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f37913b;

        a() {
            this.f37913b = AbstractC3142h.this.size();
        }

        @Override // com.google.protobuf.AbstractC3142h.g
        public byte e() {
            int i10 = this.f37912a;
            if (i10 >= this.f37913b) {
                throw new NoSuchElementException();
            }
            this.f37912a = i10 + 1;
            return AbstractC3142h.this.n(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37912a < this.f37913b;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$b */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3142h abstractC3142h, AbstractC3142h abstractC3142h2) {
            g gVarP = abstractC3142h.p();
            g gVarP2 = abstractC3142h2.p();
            while (gVarP.hasNext() && gVarP2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC3142h.y(gVarP.e())).compareTo(Integer.valueOf(AbstractC3142h.y(gVarP2.e())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC3142h.size()).compareTo(Integer.valueOf(abstractC3142h2.size()));
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$c */
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

    /* JADX INFO: renamed from: com.google.protobuf.h$d */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.protobuf.AbstractC3142h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$e */
    private static final class e extends j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f37915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f37916g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC3142h.h(i10, i10 + i11, bArr.length);
            this.f37915f = i10;
            this.f37916g = i11;
        }

        @Override // com.google.protobuf.AbstractC3142h.j
        protected int J() {
            return this.f37915f;
        }

        @Override // com.google.protobuf.AbstractC3142h.j, com.google.protobuf.AbstractC3142h
        public byte e(int i10) {
            AbstractC3142h.g(i10, size());
            return this.f37919e[this.f37915f + i10];
        }

        @Override // com.google.protobuf.AbstractC3142h.j, com.google.protobuf.AbstractC3142h
        protected void l(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f37919e, J() + i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.AbstractC3142h.j, com.google.protobuf.AbstractC3142h
        byte n(int i10) {
            return this.f37919e[this.f37915f + i10];
        }

        @Override // com.google.protobuf.AbstractC3142h.j, com.google.protobuf.AbstractC3142h
        public int size() {
            return this.f37916g;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$g */
    public interface g extends Iterator {
        byte e();
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$h, reason: collision with other inner class name */
    static final class C0415h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC3145k f37917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f37918b;

        private C0415h(int i10) {
            byte[] bArr = new byte[i10];
            this.f37918b = bArr;
            this.f37917a = AbstractC3145k.d0(bArr);
        }

        /* synthetic */ C0415h(int i10, a aVar) {
            this(i10);
        }

        public AbstractC3142h a() {
            this.f37917a.d();
            return new j(this.f37918b);
        }

        public AbstractC3145k b() {
            return this.f37917a;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$i */
    static abstract class i extends AbstractC3142h {
        i() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.p();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$j */
    private static class j extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final byte[] f37919e;

        j(byte[] bArr) {
            bArr.getClass();
            this.f37919e = bArr;
        }

        @Override // com.google.protobuf.AbstractC3142h
        protected final String B(Charset charset) {
            return new String(this.f37919e, J(), size(), charset);
        }

        @Override // com.google.protobuf.AbstractC3142h
        final void H(AbstractC3141g abstractC3141g) {
            abstractC3141g.b(this.f37919e, J(), size());
        }

        final boolean I(AbstractC3142h abstractC3142h, int i10, int i11) {
            if (i11 > abstractC3142h.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC3142h.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC3142h.size());
            }
            if (!(abstractC3142h instanceof j)) {
                return abstractC3142h.w(i10, i12).equals(w(0, i11));
            }
            j jVar = (j) abstractC3142h;
            byte[] bArr = this.f37919e;
            byte[] bArr2 = jVar.f37919e;
            int iJ = J() + i11;
            int iJ2 = J();
            int iJ3 = jVar.J() + i10;
            while (iJ2 < iJ) {
                if (bArr[iJ2] != bArr2[iJ3]) {
                    return false;
                }
                iJ2++;
                iJ3++;
            }
            return true;
        }

        protected int J() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC3142h
        public final ByteBuffer c() {
            return ByteBuffer.wrap(this.f37919e, J(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.AbstractC3142h
        public byte e(int i10) {
            return this.f37919e[i10];
        }

        @Override // com.google.protobuf.AbstractC3142h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC3142h) || size() != ((AbstractC3142h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iV = v();
            int iV2 = jVar.v();
            if (iV == 0 || iV2 == 0 || iV == iV2) {
                return I(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC3142h
        protected void l(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f37919e, i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.AbstractC3142h
        byte n(int i10) {
            return this.f37919e[i10];
        }

        @Override // com.google.protobuf.AbstractC3142h
        public final boolean o() {
            int iJ = J();
            return A0.t(this.f37919e, iJ, size() + iJ);
        }

        @Override // com.google.protobuf.AbstractC3142h
        public final AbstractC3143i s() {
            return AbstractC3143i.n(this.f37919e, J(), size(), true);
        }

        @Override // com.google.protobuf.AbstractC3142h
        public int size() {
            return this.f37919e.length;
        }

        @Override // com.google.protobuf.AbstractC3142h
        protected final int t(int i10, int i11, int i12) {
            return A.i(i10, this.f37919e, J() + i11, i12);
        }

        @Override // com.google.protobuf.AbstractC3142h
        public final AbstractC3142h w(int i10, int i11) {
            int iH = AbstractC3142h.h(i10, i11, size());
            return iH == 0 ? AbstractC3142h.f37908b : new e(this.f37919e, J() + i10, iH);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.h$k */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.protobuf.AbstractC3142h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f37909c = AbstractC3137d.c() ? new k(null) : new d(null);
        f37910d = new b();
    }

    AbstractC3142h() {
    }

    private String D() {
        if (size() <= 50) {
            return t0.a(this);
        }
        return t0.a(w(0, 47)) + "...";
    }

    static AbstractC3142h E(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new C3138d0(byteBuffer);
        }
        return G(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    static AbstractC3142h F(byte[] bArr) {
        return new j(bArr);
    }

    static AbstractC3142h G(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    static void g(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int h(int i10, int i11, int i12) {
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

    public static AbstractC3142h i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static AbstractC3142h j(byte[] bArr, int i10, int i11) {
        h(i10, i10 + i11, bArr.length);
        return new j(f37909c.a(bArr, i10, i11));
    }

    public static AbstractC3142h k(String str) {
        return new j(str.getBytes(A.f37676b));
    }

    static C0415h q(int i10) {
        return new C0415h(i10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int y(byte b10) {
        return b10 & 255;
    }

    public final String A(Charset charset) {
        return size() == 0 ? "" : B(charset);
    }

    protected abstract String B(Charset charset);

    public final String C() {
        return A(A.f37676b);
    }

    abstract void H(AbstractC3141g abstractC3141g);

    public abstract ByteBuffer c();

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iT = this.f37911a;
        if (iT == 0) {
            int size = size();
            iT = t(size, 0, size);
            if (iT == 0) {
                iT = 1;
            }
            this.f37911a = iT;
        }
        return iT;
    }

    protected abstract void l(byte[] bArr, int i10, int i11, int i12);

    abstract byte n(int i10);

    public abstract boolean o();

    public g p() {
        return new a();
    }

    public abstract AbstractC3143i s();

    public abstract int size();

    protected abstract int t(int i10, int i11, int i12);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), D());
    }

    protected final int v() {
        return this.f37911a;
    }

    public abstract AbstractC3142h w(int i10, int i11);

    public final byte[] x() {
        int size = size();
        if (size == 0) {
            return A.f37678d;
        }
        byte[] bArr = new byte[size];
        l(bArr, 0, 0, size);
        return bArr;
    }
}
