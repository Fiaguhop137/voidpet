package app.rive;

import Ed.b;
import app.rive.core.ArtboardHandle;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import app.rive.core.FileHandle;
import app.rive.core.RiveSurface;
import app.rive.core.SuspendLazy;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u000fR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00100$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Lapp/rive/Artboard;", "Ljava/lang/AutoCloseable;", "Lapp/rive/core/ArtboardHandle;", "artboardHandle", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "Lapp/rive/core/FileHandle;", "fileHandle", "", "name", "<init>", "(JLapp/rive/core/CommandQueue;JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "close", "()V", "", "getStateMachineNames", "(LEd/b;)Ljava/lang/Object;", "Lapp/rive/core/RiveSurface;", "surface", "", "scaleFactor", "resizeArtboard", "(Lapp/rive/core/RiveSurface;F)V", "resetArtboardSize", "J", "getArtboardHandle-nSTdbJo", "()J", "Lapp/rive/core/CommandQueue;", "getRiveWorker$kotlin_release", "()Lapp/rive/core/CommandQueue;", "getFileHandle-ENT3xMk$kotlin_release", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lapp/rive/core/SuspendLazy;", "stateMachineNamesCache", "Lapp/rive/core/SuspendLazy;", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Artboard implements AutoCloseable {
    private final /* synthetic */ CloseOnce $$delegate_0;
    private final long artboardHandle;
    private final long fileHandle;

    @Nullable
    private final String name;

    @NotNull
    private final CommandQueue riveWorker;

    @NotNull
    private final SuspendLazy<List<String>> stateMachineNamesCache;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: app.rive.Artboard$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass1 extends o implements Function0<Unit> {
        final /* synthetic */ long $artboardHandle;
        final /* synthetic */ long $fileHandle;
        final /* synthetic */ String $name;
        final /* synthetic */ CommandQueue $riveWorker;

        /* JADX INFO: renamed from: app.rive.Artboard$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        static final class C03281 extends o implements Function0<String> {
            final /* synthetic */ long $artboardHandle;
            final /* synthetic */ long $fileHandle;
            final /* synthetic */ String $nameLog;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03281(long j10, String str, long j11) {
                super(0);
                this.$artboardHandle = j10;
                this.$nameLog = str;
                this.$fileHandle = j11;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "Deleting " + ArtboardHandle.m121toStringimpl(this.$artboardHandle) + " " + this.$nameLog + " (" + FileHandle.m208toStringimpl(this.$fileHandle) + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, CommandQueue commandQueue, long j10, long j11) {
            super(0);
            this.$name = str;
            this.$riveWorker = commandQueue;
            this.$artboardHandle = j10;
            this.$fileHandle = j11;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m30invoke();
            return Unit.f48228a;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m30invoke() {
            String str;
            String str2 = this.$name;
            if (str2 != null) {
                str = "with name " + str2;
                if (str == null) {
                    str = "(default)";
                }
            } else {
                str = "(default)";
            }
            RiveLog.INSTANCE.getLogger().d("Rive/Artboard", new C03281(this.$artboardHandle, str, this.$fileHandle));
            this.$riveWorker.m146deleteArtboarduiJWFY8(this.$artboardHandle);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lapp/rive/Artboard$Companion;", "", "()V", "fromFile", "Lapp/rive/Artboard;", "file", "Lapp/rive/RiveFile;", "artboardName", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Artboard fromFile$default(Companion companion, RiveFile riveFile, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            return companion.fromFile(riveFile, str);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0037  */
        @NotNull
        public final Artboard fromFile(@NotNull RiveFile file, @Nullable String artboardName) {
            String str;
            Intrinsics.checkNotNullParameter(file, "file");
            long jM138createArtboardByName2ZIOzHc = artboardName != null ? file.getRiveWorker().m138createArtboardByName2ZIOzHc(file.getFileHandle(), artboardName) : file.getRiveWorker().m139createDefaultArtboard6NrLy0M(file.getFileHandle());
            if (artboardName != null) {
                str = "with name " + artboardName;
                if (str == null) {
                    str = "(default)";
                }
            } else {
                str = "(default)";
            }
            RiveLog.INSTANCE.getLogger().d("Rive/Artboard", new Artboard$Companion$fromFile$1(jM138createArtboardByName2ZIOzHc, str, file));
            return new Artboard(jM138createArtboardByName2ZIOzHc, file.getRiveWorker(), file.getFileHandle(), artboardName, null);
        }
    }

    private Artboard(long j10, CommandQueue riveWorker, long j11, String str) {
        Intrinsics.checkNotNullParameter(riveWorker, "riveWorker");
        this.artboardHandle = j10;
        this.riveWorker = riveWorker;
        this.fileHandle = j11;
        this.name = str;
        this.$$delegate_0 = new CloseOnce(ArtboardHandle.m121toStringimpl(j10), new AnonymousClass1(str, riveWorker, j10, j11));
        this.stateMachineNamesCache = new SuspendLazy<>(new Artboard$stateMachineNamesCache$1(this, null));
    }

    public /* synthetic */ Artboard(long j10, CommandQueue commandQueue, long j11, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, commandQueue, j11, str);
    }

    public static /* synthetic */ void resizeArtboard$default(Artboard artboard, RiveSurface riveSurface, float f10, int i10, Object obj) throws IllegalStateException {
        if ((i10 & 2) != 0) {
            f10 = 1.0f;
        }
        artboard.resizeArtboard(riveSurface, f10);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.$$delegate_0.close();
    }

    /* JADX INFO: renamed from: getArtboardHandle-nSTdbJo, reason: not valid java name and from getter */
    public final long getArtboardHandle() {
        return this.artboardHandle;
    }

    /* JADX INFO: renamed from: getFileHandle-ENT3xMk$kotlin_release, reason: not valid java name and from getter */
    public final long getFileHandle() {
        return this.fileHandle;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: getRiveWorker$kotlin_release, reason: from getter */
    public final CommandQueue getRiveWorker() {
        return this.riveWorker;
    }

    @Nullable
    public final Object getStateMachineNames(@NotNull b bVar) {
        return this.stateMachineNamesCache.await(bVar);
    }

    public final void resetArtboardSize() throws IllegalStateException {
        this.riveWorker.m179resetArtboardSizeuiJWFY8(this.artboardHandle);
    }

    public final void resizeArtboard(@NotNull RiveSurface surface, float scaleFactor) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.riveWorker.m180resizeArtboardVFK_cXo(this.artboardHandle, surface, scaleFactor);
    }
}
