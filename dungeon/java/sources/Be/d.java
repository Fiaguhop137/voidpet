package Be;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f710a = new o(new byte[0]);

    public interface a extends Iterator {
        byte e();
    }

    public static final class b extends OutputStream {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f711f = new byte[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList f713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f715d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f716e;

        b(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f712a = i10;
            this.f713b = new ArrayList();
            this.f715d = new byte[i10];
        }

        private byte[] a(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        private void b(int i10) {
            this.f713b.add(new o(this.f715d));
            int length = this.f714c + this.f715d.length;
            this.f714c = length;
            this.f715d = new byte[Math.max(this.f712a, Math.max(i10, length >>> 1))];
            this.f716e = 0;
        }

        private void c() {
            int i10 = this.f716e;
            byte[] bArr = this.f715d;
            if (i10 >= bArr.length) {
                this.f713b.add(new o(this.f715d));
                this.f715d = f711f;
            } else if (i10 > 0) {
                this.f713b.add(new o(a(bArr, i10)));
            }
            this.f714c += this.f716e;
            this.f716e = 0;
        }

        public synchronized d d() {
            c();
            return d.e(this.f713b);
        }

        public synchronized int size() {
            return this.f714c + this.f716e;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            try {
                if (this.f716e == this.f715d.length) {
                    b(1);
                }
                byte[] bArr = this.f715d;
                int i11 = this.f716e;
                this.f716e = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.f715d;
                int length = bArr2.length;
                int i12 = this.f716e;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f716e += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    b(i13);
                    System.arraycopy(bArr, i10 + length2, this.f715d, 0, i13);
                    this.f716e = i13;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    d() {
    }

    private static d a(Iterator it, int i10) {
        if (i10 == 1) {
            return (d) it.next();
        }
        int i11 = i10 >>> 1;
        return a(it, i11).c(a(it, i10 - i11));
    }

    public static d e(Iterable iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add((d) it.next());
            }
        }
        return arrayList.isEmpty() ? f710a : a(arrayList.iterator(), arrayList.size());
    }

    public static d g(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    public static d h(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new o(bArr2);
    }

    public static d i(String str) {
        try {
            return new o(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public static b p() {
        return new b(128);
    }

    abstract void A(OutputStream outputStream, int i10, int i11);

    public d c(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return t.E(this, dVar);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void j(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i12 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i13);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i14 = i11 + i12;
        if (i14 <= bArr.length) {
            if (i12 > 0) {
                k(bArr, i10, i11, i12);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i14);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    protected abstract void k(byte[] bArr, int i10, int i11, int i12);

    protected abstract int l();

    protected abstract boolean n();

    public abstract boolean o();

    protected abstract int q(int i10, int i11, int i12);

    protected abstract int s(int i10, int i11, int i12);

    public abstract int size();

    protected abstract int t();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public byte[] v() {
        int size = size();
        if (size == 0) {
            return j.f765a;
        }
        byte[] bArr = new byte[size];
        k(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String w(String str);

    public String x() {
        try {
            return w("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    void y(OutputStream outputStream, int i10, int i11) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i12 = i10 + i11;
        if (i12 <= size()) {
            if (i11 > 0) {
                A(outputStream, i10, i11);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }
}
