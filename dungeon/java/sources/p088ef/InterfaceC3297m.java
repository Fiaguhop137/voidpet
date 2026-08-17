package p088ef;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ef.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3297m extends P0 {

    /* JADX INFO: renamed from: ef.m$a */
    public static final class a implements InterfaceC3297m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Function1 f40855a;

        public a(Function1 function1) {
            this.f40855a = function1;
        }

        @Override // p088ef.InterfaceC3297m
        public void a(Throwable th) {
            this.f40855a.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + T.a(this.f40855a) + '@' + T.b(this) + ']';
        }
    }

    void a(Throwable th);
}
