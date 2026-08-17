package p088ef;

import Ed.b;
import java.util.Collection;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: ef.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3283f {
    public static final Object a(Collection collection, b bVar) {
        return collection.isEmpty() ? CollectionsKt.l() : new C3281e((W[]) collection.toArray(new W[0])).c(bVar);
    }
}
