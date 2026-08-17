package kotlin.collections;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: kotlin.collections.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3946h extends AbstractList implements List, Nd.d {
    protected AbstractC3946h() {
    }

    public abstract int a();

    public abstract Object c(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return c(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
