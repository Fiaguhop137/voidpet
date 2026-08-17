package Sa;

import android.animation.FloatEvaluator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends FloatEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f11598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f11599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Number f11600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Number f11601d;

    public a(Function1 startValueProvider, Function1 endValueProvider) {
        Intrinsics.checkNotNullParameter(startValueProvider, "startValueProvider");
        Intrinsics.checkNotNullParameter(endValueProvider, "endValueProvider");
        this.f11598a = startValueProvider;
        this.f11599b = endValueProvider;
    }

    private final Number a(Number number) {
        if (this.f11601d == null) {
            this.f11601d = (Number) this.f11599b.invoke(number);
        }
        return this.f11601d;
    }

    private final Number b(Number number) {
        if (this.f11600c == null) {
            this.f11600c = (Number) this.f11598a.invoke(number);
        }
        return this.f11600c;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.TypeEvaluator
    public Float evaluate(float f10, Number number, Number number2) {
        Number numberB = b(number);
        Number numberA = a(number2);
        if (numberB == null || numberA == null) {
            return null;
        }
        return super.evaluate(f10, numberB, numberA);
    }
}
