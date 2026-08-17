package androidx.compose.ui.platform;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: androidx.compose.ui.platform.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1881t0 implements R.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ R.e f22174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f22175b;

    public C1881t0(R.e eVar, Function0 function0) {
        this.f22174a = eVar;
        this.f22175b = function0;
    }

    @Override // R.e
    public R.e.a a(String str, Function0 function0) {
        return this.f22174a.a(str, function0);
    }

    @Override // R.e
    public boolean b(Object obj) {
        return this.f22174a.b(obj);
    }

    @Override // R.e
    public Map c() {
        return this.f22174a.c();
    }

    @Override // R.e
    public Object d(String str) {
        return this.f22174a.d(str);
    }

    public final void e() {
        this.f22175b.invoke();
    }
}
