package app.rive;

import Ed.b;
import Md.n;
import app.rive.core.ArtboardHandle;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import app.rive.core.FileHandle;
import app.rive.core.ImageHandle;
import app.rive.core.ViewModelInstanceHandle;
import app.rive.runtime.kotlin.core.ViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142hf.AbstractC3566e;
import p142hf.InterfaceC3564c;
import p142hf.s;
import p142hf.x;
import p142hf.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001aB%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u008d\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e2(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00112\u001c\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0016j\b\u0012\u0004\u0012\u00028\u0000`\u00170\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJE\u0010 \u001a\u00020\u001e\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00028\u00002\u001e\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e0\u0011H\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u000f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b'\u0010&J\u001b\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u000f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b)\u0010&J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b*\u0010&J\u001b\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u000f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b,\u0010&J\u001b\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b-\u0010&J\u001d\u0010.\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020$¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020(¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b4\u00101J\u001f\u00105\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u001d\u001a\u00020+¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u001d\u0010?\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0018\u0010A\u001a\u00020+2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\bA\u0010BJ%\u0010E\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020\u0000¢\u0006\u0004\bE\u0010FJ\u001d\u0010G\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010D\u001a\u00020\u0000¢\u0006\u0004\bG\u0010HJ\u001d\u0010I\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010C\u001a\u00020+¢\u0006\u0004\bI\u00106J\u001d\u0010J\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010D\u001a\u00020\u0000¢\u0006\u0004\bJ\u0010HJ%\u0010M\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010K\u001a\u00020+2\u0006\u0010L\u001a\u00020+¢\u0006\u0004\bM\u0010NR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010QR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010RR\u001a\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010OR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001e0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR \u0010V\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR&\u0010Z\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R&\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010[R&\u0010]\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010[R&\u0010^\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010[R&\u0010_\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010[R&\u0010`\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010[\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006b"}, d2 = {"Lapp/rive/ViewModelInstance;", "Ljava/lang/AutoCloseable;", "Lapp/rive/core/ViewModelInstanceHandle;", "instanceHandle", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "Lapp/rive/core/FileHandle;", "fileHandle", "<init>", "(JLapp/rive/core/CommandQueue;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "T", "", "propertyPath", "", "Lhf/c;", "cache", "Lkotlin/Function3;", "LEd/b;", "", "getter", "Lhf/x;", "Lapp/rive/core/CommandQueue$PropertyUpdate;", "Lapp/rive/core/RivePropertyUpdate;", "updateFlow", "Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", "propertyType", "getPropertyFlow", "(Ljava/lang/String;Ljava/util/Map;LMd/n;Lhf/x;Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;)Lhf/c;", "value", "", "setter", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;LMd/n;)V", "close", "()V", "", "getNumberFlow", "(Ljava/lang/String;)Lhf/c;", "getStringFlow", "", "getBooleanFlow", "getEnumFlow", "", "getColorFlow", "getTriggerFlow", "setNumber", "(Ljava/lang/String;F)V", "setString", "(Ljava/lang/String;Ljava/lang/String;)V", "setBoolean", "(Ljava/lang/String;Z)V", "setEnum", "setColor", "(Ljava/lang/String;I)V", "fireTrigger", "(Ljava/lang/String;)V", "Lapp/rive/ImageAsset;", "image", "setImage", "(Ljava/lang/String;Lapp/rive/ImageAsset;)V", "Lapp/rive/Artboard;", "artboard", "setArtboard", "(Ljava/lang/String;Lapp/rive/Artboard;)V", "getListSize", "(Ljava/lang/String;LEd/b;)Ljava/lang/Object;", "index", "item", "insertToListAtIndex", "(Ljava/lang/String;ILapp/rive/ViewModelInstance;)V", "appendToList", "(Ljava/lang/String;Lapp/rive/ViewModelInstance;)V", "removeFromListAtIndex", "removeFromList", "indexA", "indexB", "swapListItems", "(Ljava/lang/String;II)V", "J", "getInstanceHandle-VPLto4w", "()J", "Lapp/rive/core/CommandQueue;", "Lhf/s;", "_dirtyFlow", "Lhf/s;", "dirtyFlow", "Lhf/x;", "getDirtyFlow$kotlin_release", "()Lhf/x;", "numberFlows", "Ljava/util/Map;", "stringFlows", "booleanFlows", "enumFlows", "colorFlows", "triggerFlows", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewModelInstance implements AutoCloseable {
    private final /* synthetic */ CloseOnce $$delegate_0;

    @NotNull
    private final s _dirtyFlow;

    @NotNull
    private final Map<String, InterfaceC3564c> booleanFlows;

    @NotNull
    private final Map<String, InterfaceC3564c> colorFlows;

    @NotNull
    private final x dirtyFlow;

    @NotNull
    private final Map<String, InterfaceC3564c> enumFlows;
    private final long fileHandle;
    private final long instanceHandle;

    @NotNull
    private final Map<String, InterfaceC3564c> numberFlows;

    @NotNull
    private final CommandQueue riveWorker;

    @NotNull
    private final Map<String, InterfaceC3564c> stringFlows;

    @NotNull
    private final Map<String, InterfaceC3564c> triggerFlows;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass1 extends o implements Function0<Unit> {
        final /* synthetic */ long $fileHandle;
        final /* synthetic */ long $instanceHandle;
        final /* synthetic */ CommandQueue $riveWorker;

        /* JADX INFO: renamed from: app.rive.ViewModelInstance$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        static final class C03361 extends o implements Function0<String> {
            final /* synthetic */ long $fileHandle;
            final /* synthetic */ long $instanceHandle;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03361(long j10, long j11) {
                super(0);
                this.$instanceHandle = j10;
                this.$fileHandle = j11;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "Deleting " + ViewModelInstanceHandle.m240toStringimpl(this.$instanceHandle) + " (" + FileHandle.m208toStringimpl(this.$fileHandle) + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CommandQueue commandQueue, long j10, long j11) {
            super(0);
            this.$riveWorker = commandQueue;
            this.$instanceHandle = j10;
            this.$fileHandle = j11;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m69invoke();
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m69invoke() {
            RiveLog.INSTANCE.getLogger().d("Rive/VMI", new C03361(this.$instanceHandle, this.$fileHandle));
            this.$riveWorker.m152deleteViewModelInstancemBajs_U(this.$instanceHandle);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lapp/rive/ViewModelInstance$Companion;", "", "()V", "fromFile", "Lapp/rive/ViewModelInstance;", "file", "Lapp/rive/RiveFile;", "source", "Lapp/rive/ViewModelInstanceSource;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ViewModelInstance fromFile(@NotNull RiveFile file, @NotNull ViewModelInstanceSource source) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(source, "source");
            long jM142createViewModelInstancej73Dd8U = file.getRiveWorker().m142createViewModelInstancej73Dd8U(file.getFileHandle(), source);
            RiveLog.INSTANCE.getLogger().d("Rive/VMI", new ViewModelInstance$Companion$fromFile$1(jM142createViewModelInstancej73Dd8U, source, file));
            return new ViewModelInstance(jM142createViewModelInstancej73Dd8U, file.getRiveWorker(), file.getFileHandle(), null);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getBooleanFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C20201 extends AbstractC3975l implements n {
        C20201(Object obj) {
            super(3, obj, CommandQueue.class, "getBooleanProperty", "getBooleanProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // Md.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m70invokeiFQtAB8(((ViewModelInstanceHandle) obj).m241unboximpl(), (String) obj2, (b) obj3);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m70invokeiFQtAB8(long j10, @NotNull String str, @NotNull b bVar) {
            return ((CommandQueue) this.receiver).m157getBooleanPropertyiFQtAB8(j10, str, bVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getColorFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C20211 extends AbstractC3975l implements n {
        C20211(Object obj) {
            super(3, obj, CommandQueue.class, "getColorProperty", "getColorProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // Md.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m71invokeiFQtAB8(((ViewModelInstanceHandle) obj).m241unboximpl(), (String) obj2, (b) obj3);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m71invokeiFQtAB8(long j10, @NotNull String str, @NotNull b bVar) {
            return ((CommandQueue) this.receiver).m158getColorPropertyiFQtAB8(j10, str, bVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getEnumFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C20221 extends AbstractC3975l implements n {
        C20221(Object obj) {
            super(3, obj, CommandQueue.class, "getEnumProperty", "getEnumProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // Md.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m72invokeiFQtAB8(((ViewModelInstanceHandle) obj).m241unboximpl(), (String) obj2, (b) obj3);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m72invokeiFQtAB8(long j10, @NotNull String str, @NotNull b bVar) {
            return ((CommandQueue) this.receiver).m159getEnumPropertyiFQtAB8(j10, str, bVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getNumberFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C20231 extends AbstractC3975l implements n {
        C20231(Object obj) {
            super(3, obj, CommandQueue.class, "getNumberProperty", "getNumberProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // Md.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m73invokeiFQtAB8(((ViewModelInstanceHandle) obj).m241unboximpl(), (String) obj2, (b) obj3);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m73invokeiFQtAB8(long j10, @NotNull String str, @NotNull b bVar) {
            return ((CommandQueue) this.receiver).m162getNumberPropertyiFQtAB8(j10, str, bVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getStringFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C20241 extends AbstractC3975l implements n {
        C20241(Object obj) {
            super(3, obj, CommandQueue.class, "getStringProperty", "getStringProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // Md.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m74invokeiFQtAB8(((ViewModelInstanceHandle) obj).m241unboximpl(), (String) obj2, (b) obj3);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m74invokeiFQtAB8(long j10, @NotNull String str, @NotNull b bVar) {
            return ((CommandQueue) this.receiver).m164getStringPropertyiFQtAB8(j10, str, bVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setArtboard$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C20251 extends o implements Function0<String> {
        final /* synthetic */ Artboard $artboard;
        final /* synthetic */ String $propertyPath;
        final /* synthetic */ ViewModelInstance this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C20251(Artboard artboard, String str, ViewModelInstance viewModelInstance) {
            super(0);
            this.$artboard = artboard;
            this.$propertyPath = str;
            this.this$0 = viewModelInstance;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Assigning " + this.$artboard + " to " + this.$propertyPath + " (" + FileHandle.m208toStringimpl(this.this$0.fileHandle) + ")";
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setArtboard$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class AnonymousClass2 extends AbstractC3975l implements n {
        AnonymousClass2(Object obj) {
            super(3, obj, CommandQueue.class, "setArtboardProperty", "setArtboardProperty-d7r-qXY(JLjava/lang/String;J)V", 0);
        }

        @Override // Md.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m75invoked7rqXY(((ViewModelInstanceHandle) obj).m241unboximpl(), (String) obj2, ((ArtboardHandle) obj3).m122unboximpl());
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke-d7r-qXY, reason: not valid java name */
        public final void m75invoked7rqXY(long j10, @NotNull String p10, long j11) {
            Intrinsics.checkNotNullParameter(p10, "p1");
            ((CommandQueue) this.receiver).m181setArtboardPropertyd7rqXY(j10, p10, j11);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setBoolean$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C20261 extends AbstractC3975l implements n {
        C20261(Object obj) {
            super(3, obj, CommandQueue.class, "setBooleanProperty", "setBooleanProperty-iFQtAB8(JLjava/lang/String;Z)V", 0);
        }

        @Override // Md.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m76invokeiFQtAB8(((ViewModelInstanceHandle) obj).m241unboximpl(), (String) obj2, ((Boolean) obj3).booleanValue());
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m76invokeiFQtAB8(long j10, @NotNull String p10, boolean z10) {
            Intrinsics.checkNotNullParameter(p10, "p1");
            ((CommandQueue) this.receiver).m182setBooleanPropertyiFQtAB8(j10, p10, z10);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setColor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C20271 extends AbstractC3975l implements n {
        C20271(Object obj) {
            super(3, obj, CommandQueue.class, "setColorProperty", "setColorProperty-iFQtAB8(JLjava/lang/String;I)V", 0);
        }

        @Override // Md.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m77invokeiFQtAB8(((ViewModelInstanceHandle) obj).m241unboximpl(), (String) obj2, ((Number) obj3).intValue());
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m77invokeiFQtAB8(long j10, @NotNull String p10, int i10) {
            Intrinsics.checkNotNullParameter(p10, "p1");
            ((CommandQueue) this.receiver).m183setColorPropertyiFQtAB8(j10, p10, i10);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setEnum$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C20281 extends AbstractC3975l implements n {
        C20281(Object obj) {
            super(3, obj, CommandQueue.class, "setEnumProperty", "setEnumProperty-iFQtAB8(JLjava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // Md.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m78invokeiFQtAB8(((ViewModelInstanceHandle) obj).m241unboximpl(), (String) obj2, (String) obj3);
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m78invokeiFQtAB8(long j10, @NotNull String p10, @NotNull String p11) {
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            ((CommandQueue) this.receiver).m184setEnumPropertyiFQtAB8(j10, p10, p11);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setImage$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C20291 extends o implements Function0<String> {
        final /* synthetic */ ImageAsset $image;
        final /* synthetic */ String $propertyPath;
        final /* synthetic */ ViewModelInstance this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C20291(ImageAsset imageAsset, String str, ViewModelInstance viewModelInstance) {
            super(0);
            this.$image = imageAsset;
            this.$propertyPath = str;
            this.this$0 = viewModelInstance;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Assigning " + this.$image + " to " + this.$propertyPath + " (" + FileHandle.m208toStringimpl(this.this$0.fileHandle) + ")";
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setImage$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C20302 extends AbstractC3975l implements n {
        C20302(Object obj) {
            super(3, obj, CommandQueue.class, "setImageProperty", "setImageProperty-ugE2Goo(JLjava/lang/String;J)V", 0);
        }

        @Override // Md.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m79invokeugE2Goo(((ViewModelInstanceHandle) obj).m241unboximpl(), (String) obj2, ((ImageHandle) obj3).m223unboximpl());
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke-ugE2Goo, reason: not valid java name */
        public final void m79invokeugE2Goo(long j10, @NotNull String p10, long j11) {
            Intrinsics.checkNotNullParameter(p10, "p1");
            ((CommandQueue) this.receiver).m185setImagePropertyugE2Goo(j10, p10, j11);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setNumber$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C20311 extends AbstractC3975l implements n {
        C20311(Object obj) {
            super(3, obj, CommandQueue.class, "setNumberProperty", "setNumberProperty-iFQtAB8(JLjava/lang/String;F)V", 0);
        }

        @Override // Md.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m80invokeiFQtAB8(((ViewModelInstanceHandle) obj).m241unboximpl(), (String) obj2, ((Number) obj3).floatValue());
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m80invokeiFQtAB8(long j10, @NotNull String p10, float f10) {
            Intrinsics.checkNotNullParameter(p10, "p1");
            ((CommandQueue) this.receiver).m186setNumberPropertyiFQtAB8(j10, p10, f10);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setString$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C20321 extends AbstractC3975l implements n {
        C20321(Object obj) {
            super(3, obj, CommandQueue.class, "setStringProperty", "setStringProperty-iFQtAB8(JLjava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // Md.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m81invokeiFQtAB8(((ViewModelInstanceHandle) obj).m241unboximpl(), (String) obj2, (String) obj3);
            return Unit.f48228a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m81invokeiFQtAB8(long j10, @NotNull String p10, @NotNull String p11) {
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            ((CommandQueue) this.receiver).m187setStringPropertyiFQtAB8(j10, p10, p11);
        }
    }

    private ViewModelInstance(long j10, CommandQueue riveWorker, long j11) {
        Intrinsics.checkNotNullParameter(riveWorker, "riveWorker");
        this.instanceHandle = j10;
        this.riveWorker = riveWorker;
        this.fileHandle = j11;
        this.$$delegate_0 = new CloseOnce(ViewModelInstanceHandle.m240toStringimpl(j10), new AnonymousClass1(riveWorker, j10, j11));
        s sVarA = z.a(1, 1, p124gf.a.DROP_OLDEST);
        this._dirtyFlow = sVarA;
        this.dirtyFlow = sVarA;
        this.numberFlows = new LinkedHashMap();
        this.stringFlows = new LinkedHashMap();
        this.booleanFlows = new LinkedHashMap();
        this.enumFlows = new LinkedHashMap();
        this.colorFlows = new LinkedHashMap();
        this.triggerFlows = new LinkedHashMap();
    }

    public /* synthetic */ ViewModelInstance(long j10, CommandQueue commandQueue, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, commandQueue, j11);
    }

    private final <T> InterfaceC3564c getPropertyFlow(String propertyPath, Map<String, InterfaceC3564c> cache, n getter, x updateFlow, ViewModel.PropertyDataType propertyType) {
        InterfaceC3564c interfaceC3564cH = cache.get(propertyPath);
        if (interfaceC3564cH == null) {
            interfaceC3564cH = AbstractC3566e.h(new ViewModelInstance$getPropertyFlow$lambda$2$$inlined$map$1(new ViewModelInstance$getPropertyFlow$lambda$2$$inlined$filter$1(AbstractC3566e.w(updateFlow, new ViewModelInstance$getPropertyFlow$1$1(this, propertyPath, propertyType, getter, null)), this, propertyPath)));
            cache.put(propertyPath, interfaceC3564cH);
        }
        return interfaceC3564cH;
    }

    private final <T> void setProperty(String propertyPath, T value, n setter) {
        setter.invoke(ViewModelInstanceHandle.m235boximpl(this.instanceHandle), propertyPath, value);
        this._dirtyFlow.b(Unit.f48228a);
    }

    public final void appendToList(@NotNull String propertyPath, @NotNull ViewModelInstance item) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Intrinsics.checkNotNullParameter(item, "item");
        this.riveWorker.m136appendToListY8k3COA(this.instanceHandle, propertyPath, item.instanceHandle);
        this._dirtyFlow.b(Unit.f48228a);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.$$delegate_0.close();
    }

    public final void fireTrigger(@NotNull String propertyPath) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        this.riveWorker.m155fireTriggerPropertyippgHXQ(this.instanceHandle, propertyPath);
    }

    @NotNull
    public final InterfaceC3564c getBooleanFlow(@NotNull String propertyPath) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        return getPropertyFlow(propertyPath, this.booleanFlows, new C20201(this.riveWorker), this.riveWorker.getBooleanPropertyFlow(), ViewModel.PropertyDataType.BOOLEAN);
    }

    @NotNull
    public final InterfaceC3564c getColorFlow(@NotNull String propertyPath) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        return getPropertyFlow(propertyPath, this.colorFlows, new C20211(this.riveWorker), this.riveWorker.getColorPropertyFlow(), ViewModel.PropertyDataType.COLOR);
    }

    @NotNull
    /* JADX INFO: renamed from: getDirtyFlow$kotlin_release, reason: from getter */
    public final x getDirtyFlow() {
        return this.dirtyFlow;
    }

    @NotNull
    public final InterfaceC3564c getEnumFlow(@NotNull String propertyPath) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        return getPropertyFlow(propertyPath, this.enumFlows, new C20221(this.riveWorker), this.riveWorker.getEnumPropertyFlow(), ViewModel.PropertyDataType.ENUM);
    }

    /* JADX INFO: renamed from: getInstanceHandle-VPLto4w, reason: not valid java name and from getter */
    public final long getInstanceHandle() {
        return this.instanceHandle;
    }

    @Nullable
    public final Object getListSize(@NotNull String str, @NotNull b bVar) {
        return this.riveWorker.m161getListSizeiFQtAB8(this.instanceHandle, str, bVar);
    }

    @NotNull
    public final InterfaceC3564c getNumberFlow(@NotNull String propertyPath) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        return getPropertyFlow(propertyPath, this.numberFlows, new C20231(this.riveWorker), this.riveWorker.getNumberPropertyFlow(), ViewModel.PropertyDataType.NUMBER);
    }

    @NotNull
    public final InterfaceC3564c getStringFlow(@NotNull String propertyPath) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        return getPropertyFlow(propertyPath, this.stringFlows, new C20241(this.riveWorker), this.riveWorker.getStringPropertyFlow(), ViewModel.PropertyDataType.STRING);
    }

    @NotNull
    public final InterfaceC3564c getTriggerFlow(@NotNull String propertyPath) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Map<String, InterfaceC3564c> map = this.triggerFlows;
        InterfaceC3564c interfaceC3564cC = map.get(propertyPath);
        if (interfaceC3564cC == null) {
            interfaceC3564cC = AbstractC3566e.c(new ViewModelInstance$getTriggerFlow$lambda$5$$inlined$map$1(new ViewModelInstance$getTriggerFlow$lambda$5$$inlined$filter$1(AbstractC3566e.w(this.riveWorker.getTriggerPropertyFlow(), new ViewModelInstance$getTriggerFlow$1$1(this, propertyPath, null)), this, propertyPath)), 32, p124gf.a.DROP_OLDEST);
            map.put(propertyPath, interfaceC3564cC);
        }
        return interfaceC3564cC;
    }

    public final void insertToListAtIndex(@NotNull String propertyPath, int index, @NotNull ViewModelInstance item) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Intrinsics.checkNotNullParameter(item, "item");
        this.riveWorker.m168insertToListAtIndex4ua1WBo(this.instanceHandle, propertyPath, index, item.instanceHandle);
        this._dirtyFlow.b(Unit.f48228a);
    }

    public final void removeFromList(@NotNull String propertyPath, @NotNull ViewModelInstance item) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Intrinsics.checkNotNullParameter(item, "item");
        this.riveWorker.m177removeFromListY8k3COA(this.instanceHandle, propertyPath, item.instanceHandle);
        this._dirtyFlow.b(Unit.f48228a);
    }

    public final void removeFromListAtIndex(@NotNull String propertyPath, int index) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        this.riveWorker.m178removeFromListAtIndexiFQtAB8(this.instanceHandle, propertyPath, index);
        this._dirtyFlow.b(Unit.f48228a);
    }

    public final void setArtboard(@NotNull String propertyPath, @NotNull Artboard artboard) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Intrinsics.checkNotNullParameter(artboard, "artboard");
        RiveLog.INSTANCE.getLogger().d("Rive/VMI", new C20251(artboard, propertyPath, this));
        setProperty(propertyPath, ArtboardHandle.m116boximpl(artboard.getArtboardHandle()), new AnonymousClass2(this.riveWorker));
    }

    public final void setBoolean(@NotNull String propertyPath, boolean value) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        setProperty(propertyPath, Boolean.valueOf(value), new C20261(this.riveWorker));
    }

    public final void setColor(@NotNull String propertyPath, int value) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        setProperty(propertyPath, Integer.valueOf(value), new C20271(this.riveWorker));
    }

    public final void setEnum(@NotNull String propertyPath, @NotNull String value) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Intrinsics.checkNotNullParameter(value, "value");
        setProperty(propertyPath, value, new C20281(this.riveWorker));
    }

    public final void setImage(@NotNull String propertyPath, @NotNull ImageAsset image) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Intrinsics.checkNotNullParameter(image, "image");
        RiveLog.INSTANCE.getLogger().d("Rive/VMI", new C20291(image, propertyPath, this));
        setProperty(propertyPath, image.getHandle(), new C20302(this.riveWorker));
    }

    public final void setNumber(@NotNull String propertyPath, float value) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        setProperty(propertyPath, Float.valueOf(value), new C20311(this.riveWorker));
    }

    public final void setString(@NotNull String propertyPath, @NotNull String value) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        Intrinsics.checkNotNullParameter(value, "value");
        setProperty(propertyPath, value, new C20321(this.riveWorker));
    }

    public final void swapListItems(@NotNull String propertyPath, int indexA, int indexB) {
        Intrinsics.checkNotNullParameter(propertyPath, "propertyPath");
        this.riveWorker.m189swapListItemsC5vwGj0(this.instanceHandle, propertyPath, indexA, indexB);
        this._dirtyFlow.b(Unit.f48228a);
    }
}
