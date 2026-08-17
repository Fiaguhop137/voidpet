package expo.modules.audio;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p103fc.b;
import p103fc.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0007\u0012\u0004\b\r\u0010\u000b\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lexpo/modules/audio/RecordOptions;", "Lfc/c;", "", "atTime", "forDuration", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "Ljava/lang/Double;", "getAtTime", "()Ljava/lang/Double;", "getAtTime$annotations", "()V", "getForDuration", "getForDuration$annotations", "expo-audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RecordOptions implements c {

    @Nullable
    private final Double atTime;

    @Nullable
    private final Double forDuration;

    public RecordOptions(@Nullable Double d10, @Nullable Double d11) {
        this.atTime = d10;
        this.forDuration = d11;
    }

    @b
    public static /* synthetic */ void getAtTime$annotations() {
    }

    @b
    public static /* synthetic */ void getForDuration$annotations() {
    }

    @Nullable
    public final Double getAtTime() {
        return this.atTime;
    }

    @Nullable
    public final Double getForDuration() {
        return this.forDuration;
    }
}
