package p119ga;

import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f42237a;

    public a(Field field) {
        Objects.requireNonNull(field);
        this.f42237a = field;
    }

    public String toString() {
        return this.f42237a.toString();
    }
}
