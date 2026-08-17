package app.rive.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class RenderContextGL$Companion$createDisplay$5 extends o implements Function0<String> {
    final /* synthetic */ int[] $majorVersion;
    final /* synthetic */ int[] $minorVersion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RenderContextGL$Companion$createDisplay$5(int[] iArr, int[] iArr2) {
        super(0);
        this.$majorVersion = iArr;
        this.$minorVersion = iArr2;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        return "EGL initialized with version " + this.$majorVersion[0] + "." + this.$minorVersion[0];
    }
}
