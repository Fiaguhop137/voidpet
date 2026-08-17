package p198l0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.o;
import p324s0.G0;
import p324s0.H0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    static final class a extends o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f48577a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(E e10) {
            super(1);
            this.f48577a = e10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(G0 g10) {
            boolean z10;
            if (g10.k0().D1()) {
                this.f48577a.f48338a = g10;
                z10 = false;
            } else {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 b(G0 g10) {
        E e10 = new E();
        H0.d(g10, new a(e10));
        return (G0) e10.f48338a;
    }
}
