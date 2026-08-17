package p244na;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import p155ia.b;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f49944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f49945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49946c;

    protected a() {
        Type typeE = e();
        this.f49945b = typeE;
        this.f49944a = b.k(typeE);
        this.f49946c = typeE.hashCode();
    }

    private a(Type type) {
        Objects.requireNonNull(type);
        Type typeB = b.b(type);
        this.f49945b = typeB;
        this.f49944a = b.k(typeB);
        this.f49946c = typeB.hashCode();
    }

    public static a a(Class cls) {
        return new a(cls);
    }

    public static a b(Type type) {
        return new a(type);
    }

    private Type e() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                return b.b(parameterizedType.getActualTypeArguments()[0]);
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final Class c() {
        return this.f49944a;
    }

    public final Type d() {
        return this.f49945b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.f49945b, ((a) obj).f49945b);
    }

    public final int hashCode() {
        return this.f49946c;
    }

    public final String toString() {
        return b.t(this.f49945b);
    }
}
