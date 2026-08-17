package Rb;

import com.facebook.react.bridge.Promise;
import expo.modules.kotlin.exception.CodedException;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p157ic.M;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Promise f10949a;

    public o(Promise bridgePromise) {
        Intrinsics.checkNotNullParameter(bridgePromise, "bridgePromise");
        this.f10949a = bridgePromise;
    }

    @Override // Rb.u
    public void c() {
        u.a.b(this);
    }

    @Override // Rb.u
    public void d(boolean z10) {
        u.a.i(this, z10);
    }

    @Override // Rb.u
    public void e(int i10) {
        u.a.e(this, i10);
    }

    @Override // Rb.u
    public void f(double d10) {
        u.a.c(this, d10);
    }

    @Override // Rb.u
    public void g(float f10) {
        u.a.d(this, f10);
    }

    @Override // Rb.u
    public void h(Map map) {
        u.a.h(this, map);
    }

    @Override // Rb.u
    public void i(Collection collection) {
        u.a.g(this, collection);
    }

    @Override // Rb.u
    public void j(CodedException codedException) {
        u.a.a(this, codedException);
    }

    @Override // Rb.u
    public void reject(String code, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f10949a.reject(code, str, th);
    }

    @Override // Rb.u
    public void resolve(Object obj) {
        this.f10949a.resolve(M.b(M.f43874a, obj, null, false, 6, null));
    }

    @Override // Rb.u
    public void resolve(String str) {
        u.a.f(this, str);
    }
}
