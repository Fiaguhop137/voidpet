package app.rive.runtime.kotlin.fonts;

import Cd.a;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class FontHelper$Companion$processMatchingFamilies$$inlined$sortedByDescending$1<T> implements Comparator {
    final /* synthetic */ String $requestedLang$inlined;

    public FontHelper$Companion$processMatchingFamilies$$inlined$sortedByDescending$1(String str) {
        this.$requestedLang$inlined = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        return a.d(Boolean.valueOf(Intrinsics.b(((Fonts.Family) t11).getLang(), this.$requestedLang$inlined)), Boolean.valueOf(Intrinsics.b(((Fonts.Family) t10).getLang(), this.$requestedLang$inlined)));
    }
}
