package H;

import I.InterfaceC1054m;
import p037c0.AbstractC2073b0;
import p037c0.Z;

/* JADX INFO: loaded from: classes.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4092a = a.f4093a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f4093a = new a();

        private a() {
        }

        public final f a(long j10, boolean z10) {
            if (z10) {
                return ((double) AbstractC2073b0.f(j10)) > 0.5d ? p.f4095b : p.f4096c;
            }
            return p.f4097d;
        }

        public final long b(long j10, boolean z10) {
            return (z10 || ((double) AbstractC2073b0.f(j10)) >= 0.5d) ? j10 : Z.f26696b.f();
        }
    }

    f a(InterfaceC1054m interfaceC1054m, int i10);

    long b(InterfaceC1054m interfaceC1054m, int i10);
}
