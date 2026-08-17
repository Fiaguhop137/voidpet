package p323s;

import Nd.a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class A implements Map.Entry, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f52596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f52597b;

    public A(Object obj, Object obj2) {
        this.f52596a = obj;
        this.f52597b = obj2;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f52596a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f52597b;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
