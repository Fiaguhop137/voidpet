package expo.modules.audio;

import Ad.n;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0011"}, d2 = {"Lexpo/modules/audio/AndroidAudioEncoder;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DEFAULT", "AMR_NB", "AMR_WB", "AAC", "HE_AAC", "AAC_ELD", "toMediaEncoding", "", "expo-audio_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum AndroidAudioEncoder implements Enumerable {
    DEFAULT("default"),
    AMR_NB("amr_nb"),
    AMR_WB("amr_wb"),
    AAC("aac"),
    HE_AAC("he_aac"),
    AAC_ELD("aac_eld");

    private static final /* synthetic */ EnumEntries $ENTRIES = Gd.a.a(values());

    @NotNull
    private final String value;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40889a;

        static {
            int[] iArr = new int[AndroidAudioEncoder.values().length];
            try {
                iArr[AndroidAudioEncoder.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AndroidAudioEncoder.AMR_NB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AndroidAudioEncoder.AMR_WB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AndroidAudioEncoder.AAC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AndroidAudioEncoder.HE_AAC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AndroidAudioEncoder.AAC_ELD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f40889a = iArr;
        }
    }

    AndroidAudioEncoder(String str) {
        this.value = str;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final int toMediaEncoding() {
        switch (a.f40889a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new n();
        }
    }
}
