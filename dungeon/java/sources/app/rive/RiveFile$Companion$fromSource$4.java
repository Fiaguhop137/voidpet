package app.rive;

import app.rive.core.FileHandle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class RiveFile$Companion$fromSource$4 extends o implements Function0<String> {
    final /* synthetic */ long $fileHandle;
    final /* synthetic */ RiveFileSource $source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RiveFile$Companion$fromSource$4(RiveFileSource riveFileSource, long j10) {
        super(0);
        this.$source = riveFileSource;
        this.$fileHandle = j10;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        return "Loaded Rive file from source: " + this.$source + "; " + FileHandle.m208toStringimpl(this.$fileHandle);
    }
}
