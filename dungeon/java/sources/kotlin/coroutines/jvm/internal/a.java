package kotlin.coroutines.jvm.internal;

import Ad.q;
import Ad.r;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Ed.b, e, Serializable {

    @Nullable
    private final Ed.b completion;

    public a(Ed.b bVar) {
        this.completion = bVar;
    }

    @NotNull
    public Ed.b create(@NotNull Ed.b completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @NotNull
    public Ed.b create(@Nullable Object obj, @NotNull Ed.b completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Nullable
    public e getCallerFrame() {
        Ed.b bVar = this.completion;
        if (bVar instanceof e) {
            return (e) bVar;
        }
        return null;
    }

    @Nullable
    public final Ed.b getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // Ed.b
    public final void resumeWith(@NotNull Object obj) {
        Ed.b bVar = this;
        while (true) {
            h.b(bVar);
            a aVar = (a) bVar;
            Ed.b bVar2 = aVar.completion;
            Intrinsics.c(bVar2);
            try {
                Object objInvokeSuspend = aVar.invokeSuspend(obj);
                if (objInvokeSuspend == Fd.b.e()) {
                    return;
                } else {
                    obj = q.b(objInvokeSuspend);
                }
            } catch (Throwable th) {
                q.a aVar2 = q.f327b;
                obj = q.b(r.a(th));
            }
            aVar.releaseIntercepted();
            if (!(bVar2 instanceof a)) {
                bVar2.resumeWith(obj);
                return;
            }
            bVar = bVar2;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }
}
