package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends a {

    @Nullable
    private final CoroutineContext _context;

    @Nullable
    private transient Ed.b intercepted;

    public d(Ed.b bVar) {
        this(bVar, bVar != null ? bVar.getContext() : null);
    }

    public d(Ed.b bVar, CoroutineContext coroutineContext) {
        super(bVar);
        this._context = coroutineContext;
    }

    @Override // Ed.b
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.c(coroutineContext);
        return coroutineContext;
    }

    @NotNull
    public final Ed.b intercepted() {
        Ed.b bVarH = this.intercepted;
        if (bVarH == null) {
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) getContext().e(kotlin.coroutines.d.f48281C1);
            if (dVar == null || (bVarH = dVar.h(this)) == null) {
                bVarH = this;
            }
            this.intercepted = bVarH;
        }
        return bVarH;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        Ed.b bVar = this.intercepted;
        if (bVar != null && bVar != this) {
            CoroutineContext.Element elementE = getContext().e(kotlin.coroutines.d.f48281C1);
            Intrinsics.c(elementE);
            ((kotlin.coroutines.d) elementE).r(bVar);
        }
        this.intercepted = c.f48284a;
    }
}
