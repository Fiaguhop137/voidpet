package kotlin.coroutines;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements CoroutineContext.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f48277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineContext.b f48278b;

    public b(CoroutineContext.b baseKey, Function1 safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f48277a = safeCast;
        this.f48278b = baseKey instanceof b ? ((b) baseKey).f48278b : baseKey;
    }

    public final boolean a(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == this || this.f48278b == key;
    }

    public final CoroutineContext.Element b(CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (CoroutineContext.Element) this.f48277a.invoke(element);
    }
}
