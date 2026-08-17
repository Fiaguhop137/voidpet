package expo.modules.kotlin.types;

import Ad.n;
import Ad.w;
import Rb.g;
import com.facebook.react.bridge.Dynamic;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p157ic.AbstractC3613v;
import p157ic.C3606n;
import p157ic.I;
import p157ic.k0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u0019\u001a\u00028\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0007¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lexpo/modules/kotlin/types/Either;", "", "FirstType", "SecondType", "bareValue", "", "Lic/v;", "deferredValue", "", "Lkotlin/reflect/o;", "types", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V", "", "index", "", "d", "(I)Z", "a", "(I)Ljava/lang/Object;", "Lkotlin/reflect/d;", "type", "e", "(Lkotlin/reflect/d;)Z", "f", "b", "(Lkotlin/reflect/d;)Ljava/lang/Object;", "c", "Ljava/lang/Object;", "Ljava/util/List;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class Either<FirstType, SecondType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object bareValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List deferredValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List types;

    public Either(Object bareValue, List deferredValue, List types) {
        Intrinsics.checkNotNullParameter(bareValue, "bareValue");
        Intrinsics.checkNotNullParameter(deferredValue, "deferredValue");
        Intrinsics.checkNotNullParameter(types, "types");
        this.bareValue = bareValue;
        this.deferredValue = deferredValue;
        this.types = types;
    }

    public final Object a(int index) {
        AbstractC3613v abstractC3613v = (AbstractC3613v) this.deferredValue.get(index);
        if (abstractC3613v instanceof C3606n) {
            return ((C3606n) abstractC3613v).a();
        }
        if (Intrinsics.b(abstractC3613v, I.f43870a)) {
            throw new w("Cannot cast '" + this.bareValue + "' to '" + this.types.get(index) + "'");
        }
        if (!(abstractC3613v instanceof k0)) {
            throw new n();
        }
        try {
            Object objA = ((k0) abstractC3613v).a();
            this.deferredValue.set(index, new C3606n(objA));
            return objA;
        } catch (Throwable th) {
            this.deferredValue.set(index, I.f43870a);
            if (!(this.bareValue instanceof Dynamic)) {
                throw new w("Cannot cast '" + this.bareValue + "' to '" + this.types.get(index) + "' - " + th.getMessage());
            }
            Object obj = this.bareValue;
            throw new w("Cannot cast '[" + obj + "] " + g.a((Dynamic) obj) + "' to '" + this.types.get(index) + "' - " + th.getMessage());
        }
    }

    public final Object b(kotlin.reflect.d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Object objA = a(0);
        Intrinsics.d(objA, "null cannot be cast to non-null type FirstType of expo.modules.kotlin.types.Either");
        return objA;
    }

    public final Object c(kotlin.reflect.d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Object objA = a(1);
        Intrinsics.d(objA, "null cannot be cast to non-null type SecondType of expo.modules.kotlin.types.Either");
        return objA;
    }

    public final boolean d(int index) {
        AbstractC3613v abstractC3613v = (AbstractC3613v) this.deferredValue.get(index);
        if (abstractC3613v instanceof C3606n) {
            return true;
        }
        if (Intrinsics.b(abstractC3613v, I.f43870a)) {
            return false;
        }
        if (!(abstractC3613v instanceof k0)) {
            throw new n();
        }
        try {
            this.deferredValue.set(index, new C3606n(((k0) abstractC3613v).a()));
            return true;
        } catch (Throwable unused) {
            this.deferredValue.set(index, I.f43870a);
            return false;
        }
    }

    public final boolean e(kotlin.reflect.d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return d(0);
    }

    public final boolean f(kotlin.reflect.d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return d(1);
    }
}
