package Vd;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f14300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f14301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f14302c;

    public static final class a extends k implements g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f14303d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Method unboxMethod, Object obj) {
            super(unboxMethod, CollectionsKt.l(), null);
            Intrinsics.checkNotNullParameter(unboxMethod, "unboxMethod");
            this.f14303d = obj;
        }

        @Override // Vd.h
        public Object call(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            e(args);
            return d(this.f14303d, args);
        }
    }

    public static final class b extends k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method unboxMethod) {
            super(unboxMethod, CollectionsKt.e(unboxMethod.getDeclaringClass()), null);
            Intrinsics.checkNotNullParameter(unboxMethod, "unboxMethod");
        }

        @Override // Vd.h
        public Object call(Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            e(args);
            Object obj = args[0];
            i.d dVar = i.f14285e;
            return d(obj, args.length <= 1 ? new Object[0] : AbstractC3952n.s(args, 1, args.length));
        }
    }

    private k(Method method, List list) {
        this.f14300a = method;
        this.f14301b = list;
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        this.f14302c = returnType;
    }

    public /* synthetic */ k(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }

    @Override // Vd.h
    public final List a() {
        return this.f14301b;
    }

    @Override // Vd.h
    public boolean c() {
        return h.a.b(this);
    }

    protected final Object d(Object obj, Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.f14300a.invoke(obj, Arrays.copyOf(args, args.length));
    }

    public void e(Object[] objArr) {
        h.a.a(this, objArr);
    }

    @Override // Vd.h
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Method b() {
        return null;
    }

    @Override // Vd.h
    public final Type getReturnType() {
        return this.f14302c;
    }
}
