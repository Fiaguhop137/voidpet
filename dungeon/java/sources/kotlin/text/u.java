package kotlin.text;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ char[] f48542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f48543b;

    public /* synthetic */ u(char[] cArr, boolean z10) {
        this.f48542a = cArr;
        this.f48543b = z10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return StringsKt__StringsKt.x0(this.f48542a, this.f48543b, (CharSequence) obj, ((Integer) obj2).intValue());
    }
}
