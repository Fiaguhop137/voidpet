package p166j4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Comparator f46817e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f46818a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f46819b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46820c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f46821d;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public c(int i10) {
        this.f46821d = i10;
    }

    private synchronized void c() {
        while (this.f46820c > this.f46821d) {
            byte[] bArr = (byte[]) this.f46818a.remove(0);
            this.f46819b.remove(bArr);
            this.f46820c -= bArr.length;
        }
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f46819b.size(); i11++) {
            byte[] bArr = (byte[]) this.f46819b.get(i11);
            if (bArr.length >= i10) {
                this.f46820c -= bArr.length;
                this.f46819b.remove(i11);
                this.f46818a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f46821d) {
                this.f46818a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f46819b, bArr, f46817e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f46819b.add(iBinarySearch, bArr);
                this.f46820c += bArr.length;
                c();
            }
        }
    }
}
