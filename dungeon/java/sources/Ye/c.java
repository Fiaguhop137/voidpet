package Ye;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Iterable, Nd.a {
    private c() {
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a();

    public abstract void c(int i10, Object obj);

    public abstract Object get(int i10);

    @Override // java.lang.Iterable
    public abstract Iterator iterator();
}
