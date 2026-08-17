package p379v1;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: v1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4230d extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4230d(String message, Throwable th) {
        super(message, th);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public /* synthetic */ C4230d(String str, Throwable th, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th);
    }
}
