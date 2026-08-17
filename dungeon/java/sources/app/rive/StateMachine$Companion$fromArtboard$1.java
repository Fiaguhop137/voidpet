package app.rive;

import app.rive.core.ArtboardHandle;
import app.rive.core.FileHandle;
import app.rive.core.StateMachineHandle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class StateMachine$Companion$fromArtboard$1 extends o implements Function0<String> {
    final /* synthetic */ Artboard $artboard;
    final /* synthetic */ long $handle;
    final /* synthetic */ String $nameLog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StateMachine$Companion$fromArtboard$1(long j10, String str, Artboard artboard) {
        super(0);
        this.$handle = j10;
        this.$nameLog = str;
        this.$artboard = artboard;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        return "Created " + StateMachineHandle.m232toStringimpl(this.$handle) + " " + this.$nameLog + " (" + ArtboardHandle.m121toStringimpl(this.$artboard.getArtboardHandle()) + "; " + FileHandle.m208toStringimpl(this.$artboard.getFileHandle()) + ")";
    }
}
