package p014ad;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String path, String str) {
        super(StringsKt.f1("Could not open database " + path + ". " + (str == null ? "" : str)).toString(), null, 2, null);
        Intrinsics.checkNotNullParameter(path, "path");
    }

    public /* synthetic */ f(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}
