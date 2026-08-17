package kotlin.text;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f48544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f48545b;

    public /* synthetic */ v(List list, boolean z10) {
        this.f48544a = list;
        this.f48545b = z10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return StringsKt__StringsKt.y0(this.f48544a, this.f48545b, (CharSequence) obj, ((Integer) obj2).intValue());
    }
}
