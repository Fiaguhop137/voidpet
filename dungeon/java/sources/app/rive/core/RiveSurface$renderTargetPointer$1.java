package app.rive.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3975l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class RiveSurface$renderTargetPointer$1 extends AbstractC3975l implements Function1<Long, Unit> {
    RiveSurface$renderTargetPointer$1(Object obj) {
        super(1, obj, RiveSurface.class, "dispose", "dispose(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.f48228a;
    }

    public final void invoke(long j10) {
        ((RiveSurface) this.receiver).dispose(j10);
    }
}
