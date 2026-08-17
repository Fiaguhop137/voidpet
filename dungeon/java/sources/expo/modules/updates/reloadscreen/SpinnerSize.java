package expo.modules.updates.reloadscreen;

import Ad.n;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Lexpo/modules/updates/reloadscreen/SpinnerSize;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SMALL", "MEDIUM", "LARGE", "getSize", "", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum SpinnerSize implements Enumerable {
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large");

    private static final /* synthetic */ EnumEntries $ENTRIES = Gd.a.a(values());

    @NotNull
    private final String value;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41507a;

        static {
            int[] iArr = new int[SpinnerSize.values().length];
            try {
                iArr[SpinnerSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpinnerSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SpinnerSize.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41507a = iArr;
        }
    }

    SpinnerSize(String str) {
        this.value = str;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public final int getSize() {
        int i10 = a.f41507a[ordinal()];
        if (i10 == 1) {
            return 24;
        }
        if (i10 == 2) {
            return 48;
        }
        if (i10 == 3) {
            return 72;
        }
        throw new n();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
