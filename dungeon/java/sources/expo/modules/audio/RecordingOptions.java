package expo.modules.audio;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103fc.b;
import p103fc.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jx\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0015J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b5\u00100\u001a\u0004\b4\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b7\u00100\u001a\u0004\b6\u0010\u0017R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\b:\u00100\u001a\u0004\b9\u0010\u001bR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010;\u0012\u0004\b=\u00100\u001a\u0004\b<\u0010\u001dR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\b@\u00100\u001a\u0004\b?\u0010\u001fR \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010A\u0012\u0004\bB\u00100\u001a\u0004\b\u000f\u0010!R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010C\u0012\u0004\bE\u00100\u001a\u0004\bD\u0010#¨\u0006F"}, d2 = {"Lexpo/modules/audio/RecordingOptions;", "Lfc/c;", "", "extension", "", "sampleRate", "numberOfChannels", "bitRate", "Lexpo/modules/audio/AndroidOutputFormat;", "outputFormat", "Lexpo/modules/audio/AndroidAudioEncoder;", "audioEncoder", "", "maxFileSize", "", "isMeteringEnabled", "Lexpo/modules/audio/RecordingSource;", "audioSource", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lexpo/modules/audio/AndroidOutputFormat;Lexpo/modules/audio/AndroidAudioEncoder;Ljava/lang/Integer;ZLexpo/modules/audio/RecordingSource;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Double;", "component3", "component4", "component5", "()Lexpo/modules/audio/AndroidOutputFormat;", "component6", "()Lexpo/modules/audio/AndroidAudioEncoder;", "component7", "()Ljava/lang/Integer;", "component8", "()Z", "component9", "()Lexpo/modules/audio/RecordingSource;", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lexpo/modules/audio/AndroidOutputFormat;Lexpo/modules/audio/AndroidAudioEncoder;Ljava/lang/Integer;ZLexpo/modules/audio/RecordingSource;)Lexpo/modules/audio/RecordingOptions;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExtension", "getExtension$annotations", "()V", "Ljava/lang/Double;", "getSampleRate", "getSampleRate$annotations", "getNumberOfChannels", "getNumberOfChannels$annotations", "getBitRate", "getBitRate$annotations", "Lexpo/modules/audio/AndroidOutputFormat;", "getOutputFormat", "getOutputFormat$annotations", "Lexpo/modules/audio/AndroidAudioEncoder;", "getAudioEncoder", "getAudioEncoder$annotations", "Ljava/lang/Integer;", "getMaxFileSize", "getMaxFileSize$annotations", "Z", "isMeteringEnabled$annotations", "Lexpo/modules/audio/RecordingSource;", "getAudioSource", "getAudioSource$annotations", "expo-audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RecordingOptions implements c {

    @Nullable
    private final AndroidAudioEncoder audioEncoder;

    @Nullable
    private final RecordingSource audioSource;

    @Nullable
    private final Double bitRate;

    @NotNull
    private final String extension;
    private final boolean isMeteringEnabled;

    @Nullable
    private final Integer maxFileSize;

    @Nullable
    private final Double numberOfChannels;

    @Nullable
    private final AndroidOutputFormat outputFormat;

    @Nullable
    private final Double sampleRate;

    public RecordingOptions(@NotNull String extension, @Nullable Double d10, @Nullable Double d11, @Nullable Double d12, @Nullable AndroidOutputFormat androidOutputFormat, @Nullable AndroidAudioEncoder androidAudioEncoder, @Nullable Integer num, boolean z10, @Nullable RecordingSource recordingSource) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.extension = extension;
        this.sampleRate = d10;
        this.numberOfChannels = d11;
        this.bitRate = d12;
        this.outputFormat = androidOutputFormat;
        this.audioEncoder = androidAudioEncoder;
        this.maxFileSize = num;
        this.isMeteringEnabled = z10;
        this.audioSource = recordingSource;
    }

    public /* synthetic */ RecordingOptions(String str, Double d10, Double d11, Double d12, AndroidOutputFormat androidOutputFormat, AndroidAudioEncoder androidAudioEncoder, Integer num, boolean z10, RecordingSource recordingSource, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d10, d11, d12, androidOutputFormat, androidAudioEncoder, num, (i10 & 128) != 0 ? false : z10, recordingSource);
    }

    public static /* synthetic */ RecordingOptions copy$default(RecordingOptions recordingOptions, String str, Double d10, Double d11, Double d12, AndroidOutputFormat androidOutputFormat, AndroidAudioEncoder androidAudioEncoder, Integer num, boolean z10, RecordingSource recordingSource, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = recordingOptions.extension;
        }
        if ((i10 & 2) != 0) {
            d10 = recordingOptions.sampleRate;
        }
        if ((i10 & 4) != 0) {
            d11 = recordingOptions.numberOfChannels;
        }
        if ((i10 & 8) != 0) {
            d12 = recordingOptions.bitRate;
        }
        if ((i10 & 16) != 0) {
            androidOutputFormat = recordingOptions.outputFormat;
        }
        if ((i10 & 32) != 0) {
            androidAudioEncoder = recordingOptions.audioEncoder;
        }
        if ((i10 & 64) != 0) {
            num = recordingOptions.maxFileSize;
        }
        if ((i10 & 128) != 0) {
            z10 = recordingOptions.isMeteringEnabled;
        }
        if ((i10 & 256) != 0) {
            recordingSource = recordingOptions.audioSource;
        }
        boolean z11 = z10;
        RecordingSource recordingSource2 = recordingSource;
        AndroidAudioEncoder androidAudioEncoder2 = androidAudioEncoder;
        Integer num2 = num;
        AndroidOutputFormat androidOutputFormat2 = androidOutputFormat;
        Double d13 = d11;
        return recordingOptions.copy(str, d10, d13, d12, androidOutputFormat2, androidAudioEncoder2, num2, z11, recordingSource2);
    }

    @b
    public static /* synthetic */ void getAudioEncoder$annotations() {
    }

    @b
    public static /* synthetic */ void getAudioSource$annotations() {
    }

    @b
    public static /* synthetic */ void getBitRate$annotations() {
    }

    @b
    public static /* synthetic */ void getExtension$annotations() {
    }

    @b
    public static /* synthetic */ void getMaxFileSize$annotations() {
    }

    @b
    public static /* synthetic */ void getNumberOfChannels$annotations() {
    }

    @b
    public static /* synthetic */ void getOutputFormat$annotations() {
    }

    @b
    public static /* synthetic */ void getSampleRate$annotations() {
    }

    @b
    public static /* synthetic */ void isMeteringEnabled$annotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExtension() {
        return this.extension;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getSampleRate() {
        return this.sampleRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getNumberOfChannels() {
        return this.numberOfChannels;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getBitRate() {
        return this.bitRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AndroidOutputFormat getOutputFormat() {
        return this.outputFormat;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AndroidAudioEncoder getAudioEncoder() {
        return this.audioEncoder;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getMaxFileSize() {
        return this.maxFileSize;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsMeteringEnabled() {
        return this.isMeteringEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final RecordingSource getAudioSource() {
        return this.audioSource;
    }

    @NotNull
    public final RecordingOptions copy(@NotNull String extension, @Nullable Double sampleRate, @Nullable Double numberOfChannels, @Nullable Double bitRate, @Nullable AndroidOutputFormat outputFormat, @Nullable AndroidAudioEncoder audioEncoder, @Nullable Integer maxFileSize, boolean isMeteringEnabled, @Nullable RecordingSource audioSource) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        return new RecordingOptions(extension, sampleRate, numberOfChannels, bitRate, outputFormat, audioEncoder, maxFileSize, isMeteringEnabled, audioSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordingOptions)) {
            return false;
        }
        RecordingOptions recordingOptions = (RecordingOptions) other;
        return Intrinsics.b(this.extension, recordingOptions.extension) && Intrinsics.b(this.sampleRate, recordingOptions.sampleRate) && Intrinsics.b(this.numberOfChannels, recordingOptions.numberOfChannels) && Intrinsics.b(this.bitRate, recordingOptions.bitRate) && this.outputFormat == recordingOptions.outputFormat && this.audioEncoder == recordingOptions.audioEncoder && Intrinsics.b(this.maxFileSize, recordingOptions.maxFileSize) && this.isMeteringEnabled == recordingOptions.isMeteringEnabled && this.audioSource == recordingOptions.audioSource;
    }

    @Nullable
    public final AndroidAudioEncoder getAudioEncoder() {
        return this.audioEncoder;
    }

    @Nullable
    public final RecordingSource getAudioSource() {
        return this.audioSource;
    }

    @Nullable
    public final Double getBitRate() {
        return this.bitRate;
    }

    @NotNull
    public final String getExtension() {
        return this.extension;
    }

    @Nullable
    public final Integer getMaxFileSize() {
        return this.maxFileSize;
    }

    @Nullable
    public final Double getNumberOfChannels() {
        return this.numberOfChannels;
    }

    @Nullable
    public final AndroidOutputFormat getOutputFormat() {
        return this.outputFormat;
    }

    @Nullable
    public final Double getSampleRate() {
        return this.sampleRate;
    }

    public int hashCode() {
        int iHashCode = this.extension.hashCode() * 31;
        Double d10 = this.sampleRate;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.numberOfChannels;
        int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.bitRate;
        int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
        AndroidOutputFormat androidOutputFormat = this.outputFormat;
        int iHashCode5 = (iHashCode4 + (androidOutputFormat == null ? 0 : androidOutputFormat.hashCode())) * 31;
        AndroidAudioEncoder androidAudioEncoder = this.audioEncoder;
        int iHashCode6 = (iHashCode5 + (androidAudioEncoder == null ? 0 : androidAudioEncoder.hashCode())) * 31;
        Integer num = this.maxFileSize;
        int iHashCode7 = (((iHashCode6 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isMeteringEnabled)) * 31;
        RecordingSource recordingSource = this.audioSource;
        return iHashCode7 + (recordingSource != null ? recordingSource.hashCode() : 0);
    }

    public final boolean isMeteringEnabled() {
        return this.isMeteringEnabled;
    }

    @NotNull
    public String toString() {
        return "RecordingOptions(extension=" + this.extension + ", sampleRate=" + this.sampleRate + ", numberOfChannels=" + this.numberOfChannels + ", bitRate=" + this.bitRate + ", outputFormat=" + this.outputFormat + ", audioEncoder=" + this.audioEncoder + ", maxFileSize=" + this.maxFileSize + ", isMeteringEnabled=" + this.isMeteringEnabled + ", audioSource=" + this.audioSource + ")";
    }
}
