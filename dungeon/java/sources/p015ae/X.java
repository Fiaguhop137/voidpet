package p015ae;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1795i f19704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f19705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X f19706c;

    public X(InterfaceC1795i classifierDescriptor, List arguments, X x10) {
        Intrinsics.checkNotNullParameter(classifierDescriptor, "classifierDescriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f19704a = classifierDescriptor;
        this.f19705b = arguments;
        this.f19706c = x10;
    }

    public final List a() {
        return this.f19705b;
    }

    public final InterfaceC1795i b() {
        return this.f19704a;
    }

    public final X c() {
        return this.f19706c;
    }
}
