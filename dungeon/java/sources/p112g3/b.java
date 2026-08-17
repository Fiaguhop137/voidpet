package p112g3;

import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.g;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import p088ef.W;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    static final class a extends o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f42159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ W f42160b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c.a aVar, W w10) {
            super(1);
            this.f42159a = aVar;
            this.f42160b = w10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f48228a;
        }

        public final void invoke(Throwable th) {
            if (th == null) {
                this.f42159a.b(this.f42160b.f());
            } else if (th instanceof CancellationException) {
                this.f42159a.c();
            } else {
                this.f42159a.e(th);
            }
        }
    }

    public static final g b(W w10, Object obj) {
        Intrinsics.checkNotNullParameter(w10, "<this>");
        g gVarA = c.a(new p112g3.a(w10, obj));
        Intrinsics.checkNotNullExpressionValue(gVarA, "getFuture { completer ->…      }\n        tag\n    }");
        return gVarA;
    }

    public static /* synthetic */ g c(W w10, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(w10, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(W this_asListenableFuture, Object obj, c.a completer) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.u(new a(completer, this_asListenableFuture));
        return obj;
    }
}
