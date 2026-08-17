package expo.modules.audio;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;
import p103fc.b;
import p103fc.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u000e\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u0012\u0004\b\u0015\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lexpo/modules/audio/AudioMode;", "Lfc/c;", "", "shouldPlayInBackground", "shouldRouteThroughEarpiece", "Lexpo/modules/audio/InterruptionMode;", "interruptionMode", "<init>", "(ZLjava/lang/Boolean;Lexpo/modules/audio/InterruptionMode;)V", "Z", "getShouldPlayInBackground", "()Z", "getShouldPlayInBackground$annotations", "()V", "Ljava/lang/Boolean;", "getShouldRouteThroughEarpiece", "()Ljava/lang/Boolean;", "getShouldRouteThroughEarpiece$annotations", "Lexpo/modules/audio/InterruptionMode;", "getInterruptionMode", "()Lexpo/modules/audio/InterruptionMode;", "getInterruptionMode$annotations", "expo-audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AudioMode implements c {

    @Nullable
    private final InterruptionMode interruptionMode;
    private final boolean shouldPlayInBackground;

    @Nullable
    private final Boolean shouldRouteThroughEarpiece;

    public AudioMode(boolean z10, @Nullable Boolean bool, @Nullable InterruptionMode interruptionMode) {
        this.shouldPlayInBackground = z10;
        this.shouldRouteThroughEarpiece = bool;
        this.interruptionMode = interruptionMode;
    }

    public /* synthetic */ AudioMode(boolean z10, Boolean bool, InterruptionMode interruptionMode, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, bool, interruptionMode);
    }

    @b
    public static /* synthetic */ void getInterruptionMode$annotations() {
    }

    @b
    public static /* synthetic */ void getShouldPlayInBackground$annotations() {
    }

    @b
    public static /* synthetic */ void getShouldRouteThroughEarpiece$annotations() {
    }

    @Nullable
    public final InterruptionMode getInterruptionMode() {
        return this.interruptionMode;
    }

    public final boolean getShouldPlayInBackground() {
        return this.shouldPlayInBackground;
    }

    @Nullable
    public final Boolean getShouldRouteThroughEarpiece() {
        return this.shouldRouteThroughEarpiece;
    }
}
