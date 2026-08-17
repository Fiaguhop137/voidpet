package Bf;

import If.InterfaceC1108j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1042a = a.f1044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f1043b = new a.C0023a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f1044a = new a();

        /* JADX INFO: renamed from: Bf.l$a$a, reason: collision with other inner class name */
        private static final class C0023a implements l {
            @Override // Bf.l
            public void a(int i10, b errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }

            @Override // Bf.l
            public boolean b(int i10, InterfaceC1108j source, int i11, boolean z10) {
                Intrinsics.checkNotNullParameter(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // Bf.l
            public boolean c(int i10, List requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // Bf.l
            public boolean d(int i10, List responseHeaders, boolean z10) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }
        }

        private a() {
        }
    }

    void a(int i10, b bVar);

    boolean b(int i10, InterfaceC1108j interfaceC1108j, int i11, boolean z10);

    boolean c(int i10, List list);

    boolean d(int i10, List list, boolean z10);
}
