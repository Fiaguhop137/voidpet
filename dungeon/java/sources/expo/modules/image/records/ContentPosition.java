package expo.modules.image.records;

import Db.q;
import Md.p;
import android.graphics.Matrix;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u0000 (2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u000f\u001a\u0004\u0018\u00010\f*\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2.\u0010\u000e\u001a*\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u001a\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\u001dR(\u0010\"\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\u001dR(\u0010%\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001b\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\u001d¨\u0006*"}, d2 = {"Lexpo/modules/image/records/ContentPosition;", "Lfc/c;", "<init>", "()V", "", "Lexpo/modules/image/records/ContentPositionValue;", "", "isReverse", "Landroid/graphics/RectF;", "imageRect", "viewRect", "Lkotlin/Function5;", "", "Lexpo/modules/image/records/CalcAxisOffset;", "calcAxisOffset", "calcOffset", "(Ljava/lang/Object;ZLandroid/graphics/RectF;Landroid/graphics/RectF;LMd/p;)Ljava/lang/Float;", "offsetX", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)F", "offsetY", "Landroid/graphics/Matrix;", "to", "", "apply$expo_image_release", "(Landroid/graphics/Matrix;Landroid/graphics/RectF;Landroid/graphics/RectF;)V", "apply", "top", "Ljava/lang/Object;", "getTop", "()Ljava/lang/Object;", "getTop$annotations", "bottom", "getBottom", "getBottom$annotations", "right", "getRight", "getRight$annotations", "left", "getLeft", "getLeft$annotations", "Companion", "a", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContentPosition implements p103fc.c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ContentPosition center = new ContentPosition();

    @Nullable
    private final Object bottom;

    @Nullable
    private final Object left;

    @Nullable
    private final Object right;

    @Nullable
    private final Object top;

    /* JADX INFO: renamed from: expo.modules.image.records.ContentPosition$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ContentPosition a() {
            return ContentPosition.center;
        }
    }

    /* synthetic */ class b extends AbstractC3975l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f40990a = new b();

        b() {
            super(5, q.class, "calcXTranslation", "calcXTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F", 1);
        }

        public final Float m(float f10, RectF p10, RectF p11, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            return Float.valueOf(q.b(f10, p10, p11, z10, z11));
        }

        @Override // Md.p
        public /* bridge */ /* synthetic */ Object r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return m(((Number) obj).floatValue(), (RectF) obj2, (RectF) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue());
        }
    }

    /* synthetic */ class c extends AbstractC3975l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f40991a = new c();

        c() {
            super(5, q.class, "calcXTranslation", "calcXTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F", 1);
        }

        public final Float m(float f10, RectF p10, RectF p11, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            return Float.valueOf(q.b(f10, p10, p11, z10, z11));
        }

        @Override // Md.p
        public /* bridge */ /* synthetic */ Object r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return m(((Number) obj).floatValue(), (RectF) obj2, (RectF) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue());
        }
    }

    /* synthetic */ class d extends AbstractC3975l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f40992a = new d();

        d() {
            super(5, q.class, "calcYTranslation", "calcYTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F", 1);
        }

        public final Float m(float f10, RectF p10, RectF p11, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            return Float.valueOf(q.d(f10, p10, p11, z10, z11));
        }

        @Override // Md.p
        public /* bridge */ /* synthetic */ Object r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return m(((Number) obj).floatValue(), (RectF) obj2, (RectF) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue());
        }
    }

    /* synthetic */ class e extends AbstractC3975l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f40993a = new e();

        e() {
            super(5, q.class, "calcYTranslation", "calcYTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F", 1);
        }

        public final Float m(float f10, RectF p10, RectF p11, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            return Float.valueOf(q.d(f10, p10, p11, z10, z11));
        }

        @Override // Md.p
        public /* bridge */ /* synthetic */ Object r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return m(((Number) obj).floatValue(), (RectF) obj2, (RectF) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue());
        }
    }

    private final Float calcOffset(Object obj, boolean z10, RectF rectF, RectF rectF2, p pVar) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return (Float) pVar.r(Float.valueOf((float) ((Number) obj).doubleValue()), rectF, rectF2, Boolean.FALSE, Boolean.valueOf(z10));
        }
        String str = (String) obj;
        return Float.valueOf(Intrinsics.b(str, "center") ? ((Number) pVar.r(Float.valueOf(50.0f), rectF, rectF2, Boolean.TRUE, Boolean.valueOf(z10))).floatValue() : ((Number) pVar.r(Float.valueOf(Float.parseFloat(StringsKt.B0(str, "%"))), rectF, rectF2, Boolean.TRUE, Boolean.valueOf(z10))).floatValue());
    }

    @p103fc.b
    public static /* synthetic */ void getBottom$annotations() {
    }

    @p103fc.b
    public static /* synthetic */ void getLeft$annotations() {
    }

    @p103fc.b
    public static /* synthetic */ void getRight$annotations() {
    }

    @p103fc.b
    public static /* synthetic */ void getTop$annotations() {
    }

    private final float offsetX(RectF imageRect, RectF viewRect) {
        Float fCalcOffset = calcOffset(this.left, false, imageRect, viewRect, b.f40990a);
        if (fCalcOffset != null) {
            return fCalcOffset.floatValue();
        }
        Float fCalcOffset2 = calcOffset(this.right, true, imageRect, viewRect, c.f40991a);
        return fCalcOffset2 != null ? fCalcOffset2.floatValue() : q.c(50.0f, imageRect, viewRect, true, false, 16, null);
    }

    private final float offsetY(RectF imageRect, RectF viewRect) {
        Float fCalcOffset = calcOffset(this.top, false, imageRect, viewRect, d.f40992a);
        if (fCalcOffset != null) {
            return fCalcOffset.floatValue();
        }
        Float fCalcOffset2 = calcOffset(this.bottom, true, imageRect, viewRect, e.f40993a);
        return fCalcOffset2 != null ? fCalcOffset2.floatValue() : q.e(50.0f, imageRect, viewRect, true, false, 16, null);
    }

    public final void apply$expo_image_release(@NotNull Matrix to, @NotNull RectF imageRect, @NotNull RectF viewRect) {
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(imageRect, "imageRect");
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        to.postTranslate(offsetX(imageRect, viewRect), offsetY(imageRect, viewRect));
    }

    @Nullable
    public final Object getBottom() {
        return this.bottom;
    }

    @Nullable
    public final Object getLeft() {
        return this.left;
    }

    @Nullable
    public final Object getRight() {
        return this.right;
    }

    @Nullable
    public final Object getTop() {
        return this.top;
    }
}
