package kotlin.coroutines;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineContext f48279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineContext.Element f48280b;

    public c(CoroutineContext left, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f48279a = left;
        this.f48280b = element;
    }

    private final boolean j(CoroutineContext.Element element) {
        return Intrinsics.b(e(element.getKey()), element);
    }

    private final boolean l(c cVar) {
        while (j(cVar.f48280b)) {
            CoroutineContext coroutineContext = cVar.f48279a;
            if (!(coroutineContext instanceof c)) {
                Intrinsics.d(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return j((CoroutineContext.Element) coroutineContext);
            }
            cVar = (c) coroutineContext;
        }
        return false;
    }

    private final int n() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            CoroutineContext coroutineContext = cVar.f48279a;
            cVar = coroutineContext instanceof c ? (c) coroutineContext : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q(String acc, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(acc, "acc");
        Intrinsics.checkNotNullParameter(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext P(CoroutineContext coroutineContext) {
        return CoroutineContext.a.b(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext S(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f48280b.e(key) != null) {
            return this.f48279a;
        }
        CoroutineContext coroutineContextS = this.f48279a.S(key);
        if (coroutineContextS == this.f48279a) {
            return this;
        }
        return coroutineContextS == e.f48283a ? this.f48280b : new c(coroutineContextS, this.f48280b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object b0(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.f48279a.b0(obj, operation), this.f48280b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element e(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            CoroutineContext.Element elementE = cVar.f48280b.e(key);
            if (elementE != null) {
                return elementE;
            }
            CoroutineContext coroutineContext = cVar.f48279a;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.e(key);
            }
            cVar = (c) coroutineContext;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.n() == n() && cVar.l(this);
    }

    public int hashCode() {
        return this.f48279a.hashCode() + this.f48280b.hashCode();
    }

    public String toString() {
        return '[' + ((String) b0("", new Ed.a())) + ']';
    }
}
