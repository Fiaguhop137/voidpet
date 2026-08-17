package p380v2;

import R1.InterfaceC1350j;
import R1.r;
import U1.F;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public interface O {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f55986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f55987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f55988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f55989d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f55986a = i10;
            this.f55987b = bArr;
            this.f55988c = i11;
            this.f55989d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f55986a == aVar.f55986a && this.f55988c == aVar.f55988c && this.f55989d == aVar.f55989d && Arrays.equals(this.f55987b, aVar.f55987b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f55986a * 31) + Arrays.hashCode(this.f55987b)) * 31) + this.f55988c) * 31) + this.f55989d;
        }
    }

    default int a(InterfaceC1350j interfaceC1350j, int i10, boolean z10) {
        return g(interfaceC1350j, i10, z10, 0);
    }

    void b(r rVar);

    void c(long j10, int i10, int i11, int i12, a aVar);

    default void d(long j10) {
    }

    void e(F f10, int i10, int i11);

    default void f(F f10, int i10) {
        e(f10, i10, 0);
    }

    int g(InterfaceC1350j interfaceC1350j, int i10, boolean z10, int i11);
}
