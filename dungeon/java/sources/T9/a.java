package T9;

import K9.C;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f12377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f12378b;

    public a(Class cls, Object obj) {
        this.f12377a = (Class) C.b(cls);
        this.f12378b = C.b(obj);
    }

    public Object a() {
        return this.f12378b;
    }

    public Class b() {
        return this.f12377a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f12377a, this.f12378b);
    }
}
