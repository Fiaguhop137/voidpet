package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class I implements Iterable, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f48235a;

    public I(Function0 iteratorFactory) {
        Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.f48235a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new J((Iterator) this.f48235a.invoke());
    }
}
