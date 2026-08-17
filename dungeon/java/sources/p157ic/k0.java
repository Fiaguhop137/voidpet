package p157ic;

import Rb.d;
import expo.modules.kotlin.types.b;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends AbstractC3613v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f43930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f43931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f43932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f43933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Object unconvertedValue, b typeConverter, d dVar) {
        super(null);
        Intrinsics.checkNotNullParameter(unconvertedValue, "unconvertedValue");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        this.f43930a = unconvertedValue;
        this.f43931b = typeConverter;
        this.f43932c = new WeakReference(dVar);
    }

    public final Object a() {
        if (this.f43933d == null) {
            this.f43933d = this.f43931b.a(this.f43930a, (d) this.f43932c.get(), true);
        }
        Object obj = this.f43933d;
        Intrinsics.c(obj);
        return obj;
    }
}
