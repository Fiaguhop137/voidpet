package p432y0;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o;
import p088ef.AbstractC3293k;
import p088ef.B0;
import p088ef.O;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    static final class a extends o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f57729a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CancellationSignal cancellationSignal) {
            super(1);
            this.f57729a = cancellationSignal;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f48228a;
        }

        public final void invoke(Throwable th) {
            if (th != null) {
                this.f57729a.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B0 c(O o10, CancellationSignal cancellationSignal, Function2 function2) {
        B0 b0D = AbstractC3293k.d(o10, null, null, function2, 3, null);
        b0D.u(new a(cancellationSignal));
        cancellationSignal.setOnCancelListener(new d(b0D));
        return b0D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(B0 b10) {
        B0.a.a(b10, null, 1, null);
    }
}
