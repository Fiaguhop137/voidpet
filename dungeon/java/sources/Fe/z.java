package Fe;

import Re.S;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p015ae.H;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends C0976b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S f3090c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(List value, S type) {
        super(value, new y(type));
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f3090c = type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S c(S s10, H it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return s10;
    }

    public final S e() {
        return this.f3090c;
    }
}
