package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class v implements WildcardType, Type {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f48416c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v f48417d = new v(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f48418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f48419b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a() {
            return v.f48417d;
        }
    }

    public v(Type type, Type type2) {
        this.f48418a = type;
        this.f48419b = type2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.f48419b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        if (this.f48419b != null) {
            return "? super " + u.h(this.f48419b);
        }
        Type type = this.f48418a;
        if (type == null || Intrinsics.b(type, Object.class)) {
            return "?";
        }
        return "? extends " + u.h(this.f48418a);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type type = this.f48418a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
