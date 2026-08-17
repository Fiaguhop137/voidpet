package Be;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
class c extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f706e;

    private class b implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f708b;

        private b() {
            int iC = c.this.C();
            this.f707a = iC;
            this.f708b = iC + c.this.size();
        }

        /* synthetic */ b(c cVar, a aVar) {
            this();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(e());
        }

        @Override // Be.d.a
        public byte e() {
            int i10 = this.f707a;
            if (i10 >= this.f708b) {
                throw new NoSuchElementException();
            }
            byte[] bArr = c.this.f771b;
            this.f707a = i10 + 1;
            return bArr[i10];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f707a < this.f708b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    c(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (((long) i10) + ((long) i11) <= bArr.length) {
            this.f705d = i10;
            this.f706e = i11;
            return;
        }
        StringBuilder sb4 = new StringBuilder(48);
        sb4.append("Offset+Length too large: ");
        sb4.append(i10);
        sb4.append("+");
        sb4.append(i11);
        throw new IllegalArgumentException(sb4.toString());
    }

    @Override // Be.o
    protected int C() {
        return this.f705d;
    }

    @Override // Be.o, java.lang.Iterable
    /* JADX INFO: renamed from: E */
    public d.a iterator() {
        return new b(this, null);
    }

    @Override // Be.o, Be.d
    protected void k(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f771b, C() + i10, bArr, i11, i12);
    }

    @Override // Be.o, Be.d
    public int size() {
        return this.f706e;
    }
}
