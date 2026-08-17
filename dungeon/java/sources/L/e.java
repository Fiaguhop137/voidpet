package L;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface e extends c, b {

    public interface a extends List, Collection, Nd.b, Nd.d {
        e build();
    }

    e J0(int i10);

    e V2(Function1 function1);

    @Override // java.util.List
    e add(int i10, Object obj);

    @Override // java.util.List, java.util.Collection
    e add(Object obj);

    @Override // java.util.List, java.util.Collection
    e addAll(Collection collection);

    a builder();

    @Override // java.util.List, java.util.Collection
    e remove(Object obj);

    @Override // java.util.List, java.util.Collection
    e removeAll(Collection collection);

    @Override // java.util.List
    e set(int i10, Object obj);
}
