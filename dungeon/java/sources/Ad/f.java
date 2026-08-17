package Ad;

import java.io.Serializable;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Lazy, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f313a;

    public f(Object obj) {
        this.f313a = obj;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        return this.f313a;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
