package N2;

import U1.F;
import p380v2.InterfaceC4254q;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f7296a = new F(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7297b;

    private long a(InterfaceC4254q interfaceC4254q) {
        int i10 = 0;
        interfaceC4254q.o(this.f7296a.f(), 0, 1);
        int i11 = this.f7296a.f()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        interfaceC4254q.o(this.f7296a.f(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f7296a.f()[i10] & 255) + (i14 << 8);
        }
        this.f7297b += i13 + 1;
        return i14;
    }

    public boolean b(InterfaceC4254q interfaceC4254q) {
        long length = interfaceC4254q.getLength();
        long j10 = 1024;
        if (length != -1 && length <= 1024) {
            j10 = length;
        }
        int i10 = (int) j10;
        interfaceC4254q.o(this.f7296a.f(), 0, 4);
        long jN = this.f7296a.N();
        this.f7297b = 4;
        while (jN != 440786851) {
            int i11 = this.f7297b + 1;
            this.f7297b = i11;
            if (i11 == i10) {
                return false;
            }
            interfaceC4254q.o(this.f7296a.f(), 0, 1);
            jN = ((jN << 8) & (-256)) | ((long) (this.f7296a.f()[0] & 255));
        }
        long jA = a(interfaceC4254q);
        long j11 = this.f7297b;
        if (jA != Long.MIN_VALUE && (length == -1 || j11 + jA < length)) {
            while (true) {
                int i12 = this.f7297b;
                long j12 = j11 + jA;
                if (i12 < j12) {
                    if (a(interfaceC4254q) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jA2 = a(interfaceC4254q);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        return false;
                    }
                    if (jA2 != 0) {
                        int i13 = (int) jA2;
                        interfaceC4254q.i(i13);
                        this.f7297b += i13;
                    }
                } else if (i12 == j12) {
                    return true;
                }
            }
        }
        return false;
    }
}
