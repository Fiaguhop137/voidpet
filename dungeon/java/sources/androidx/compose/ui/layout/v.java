package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function2 f21684a;

    private v(Function2 function2) {
        this.f21684a = function2;
    }

    public /* synthetic */ v(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    public abstract float a(float f10, p288q0.m mVar, p288q0.m mVar2);

    public final Function2 b() {
        return this.f21684a;
    }
}
