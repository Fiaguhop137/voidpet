package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: renamed from: kotlin.collections.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3945g extends AbstractCollection implements Collection, Nd.b {
    protected AbstractC3945g() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
