package expo.modules.image.okhttp;

import Jb.b;
import Jb.c;
import Jb.d;
import R6.h;
import kotlin.jvm.internal.Intrinsics;
import p339sf.A;
import p339sf.E;
import p339sf.F;
import p339sf.v;
import p382v4.n;
import p382v4.o;
import p382v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f40988a;

    /* JADX INFO: renamed from: expo.modules.image.okhttp.a$a, reason: collision with other inner class name */
    public static final class C0458a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final A f40989a;

        public C0458a(A commonClient) {
            Intrinsics.checkNotNullParameter(commonClient, "commonClient");
            this.f40989a = commonClient;
        }

        @Override // p382v4.o
        public n d(r multiFactory) {
            Intrinsics.checkNotNullParameter(multiFactory, "multiFactory");
            return new a(this.f40989a);
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public a(A commonClient) {
        Intrinsics.checkNotNullParameter(commonClient, "commonClient");
        this.f40988a = commonClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E f(b bVar, v.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        E eA = chain.a(chain.L());
        E.a aVarZ = eA.z();
        F fE = eA.e();
        if (fE != null) {
            return aVarZ.b(new h(fE, new d(bVar))).c();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(b bVar, long j10, long j11, boolean z10) {
        Ib.b bVarB = bVar.b();
        if (bVarB != null) {
            bVarB.a(j10, j11, z10);
        }
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public n.a a(b model, int i10, int i11, p274p4.h options) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(options, "options");
        return new com.bumptech.glide.integration.okhttp3.a(this.f40988a.E().a(new c(model)).c()).a(model.a(), i10, i11, options);
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean b(b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return true;
    }
}
