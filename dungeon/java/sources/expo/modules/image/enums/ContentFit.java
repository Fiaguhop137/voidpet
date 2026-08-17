package expo.modules.image.enums;

import Ad.n;
import android.graphics.Matrix;
import android.graphics.RectF;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, d2 = {"Lexpo/modules/image/enums/ContentFit;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Contain", "Cover", "Fill", "None", "ScaleDown", "toMatrix", "Landroid/graphics/Matrix;", "imageRect", "Landroid/graphics/RectF;", "viewRect", "sourceWidth", "", "sourceHeight", "toMatrix$expo_image_release", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum ContentFit implements Enumerable {
    Contain("contain"),
    Cover("cover"),
    Fill("fill"),
    None("none"),
    ScaleDown("scale-down");

    private static final /* synthetic */ EnumEntries $ENTRIES = Gd.a.a(values());

    @NotNull
    private final String value;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40986a;

        static {
            int[] iArr = new int[ContentFit.values().length];
            try {
                iArr[ContentFit.Contain.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentFit.Cover.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContentFit.Fill.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContentFit.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ContentFit.ScaleDown.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f40986a = iArr;
        }
    }

    ContentFit(String str) {
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

    @NotNull
    public final Matrix toMatrix$expo_image_release(@NotNull RectF imageRect, @NotNull RectF viewRect, int sourceWidth, int sourceHeight) {
        Intrinsics.checkNotNullParameter(imageRect, "imageRect");
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        Matrix matrix = new Matrix();
        int i10 = a.f40986a[ordinal()];
        if (i10 == 1) {
            matrix.setRectToRect(imageRect, viewRect, Matrix.ScaleToFit.START);
            return matrix;
        }
        if (i10 == 2) {
            float fMax = Math.max(viewRect.width() / imageRect.width(), viewRect.height() / imageRect.height());
            matrix.setScale(fMax, fMax);
            return matrix;
        }
        if (i10 == 3) {
            matrix.setRectToRect(imageRect, viewRect, Matrix.ScaleToFit.FILL);
            return matrix;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                throw new n();
            }
            if (sourceWidth != -1 && sourceHeight != -1) {
                RectF rectF = new RectF(0.0f, 0.0f, sourceWidth, sourceHeight);
                if (rectF.width() >= viewRect.width() || rectF.height() >= viewRect.height()) {
                    matrix.setRectToRect(imageRect, viewRect, Matrix.ScaleToFit.START);
                    return matrix;
                }
                matrix.setRectToRect(imageRect, rectF, Matrix.ScaleToFit.START);
                return matrix;
            }
            if (imageRect.width() >= viewRect.width() || imageRect.height() >= viewRect.height()) {
                matrix.setRectToRect(imageRect, viewRect, Matrix.ScaleToFit.START);
                return matrix;
            }
        }
        return matrix;
    }
}
