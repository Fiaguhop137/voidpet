package p123ge;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import p302qe.w;
import p302qe.x;

/* JADX INFO: loaded from: classes3.dex */
public final class D extends y implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f42350a;

    public D(Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        this.f42350a = recordComponent;
    }

    @Override // p123ge.y
    public Member R() throws IllegalAccessException, InvocationTargetException {
        Method methodC = C3437a.f42360a.c(this.f42350a);
        if (methodC != null) {
            return methodC;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // p302qe.w
    public boolean b() {
        return false;
    }

    @Override // p302qe.w
    public x getType() throws IllegalAccessException, InvocationTargetException {
        Class clsD = C3437a.f42360a.d(this.f42350a);
        if (clsD != null) {
            return new s(clsD);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
