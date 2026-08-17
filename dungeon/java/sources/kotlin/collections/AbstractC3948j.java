package kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: renamed from: kotlin.collections.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3948j extends AbstractSet implements Set, Nd.f {
    protected AbstractC3948j() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
