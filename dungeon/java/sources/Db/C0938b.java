package Db;

import expo.modules.image.enums.ContentFit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Db.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0938b extends AbstractC0939c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final r f2264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ContentFit f2265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f2266l;

    /* JADX INFO: renamed from: Db.b$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2267a;

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
                iArr[ContentFit.ScaleDown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2267a = iArr;
        }
    }

    public C0938b(r target, ContentFit contentFit) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(contentFit, "contentFit");
        this.f2264j = target;
        this.f2265k = contentFit;
    }

    private final float c(float f10, float f11, float f12, float f13) {
        int i10 = a.f2267a[this.f2265k.ordinal()];
        if (i10 == 1) {
            return Math.min(f12 / f10, f13 / f11);
        }
        if (i10 == 2) {
            return Float.max(f12 / f10, f13 / f11);
        }
        if (i10 != 3) {
            return 1.0f;
        }
        if (f12 < f10 || f13 < f11) {
            return Math.min(f12 / f10, f13 / f11);
        }
        return 1.0f;
    }

    @Override // p436y4.l
    public y4.l.g a(int i10, int i11, int i12, int i13) {
        return y4.l.g.QUALITY;
    }

    @Override // p436y4.l
    public float b(int i10, int i11, int i12, int i13) {
        if (!this.f2266l) {
            this.f2264j.B(i10);
            this.f2264j.A(i11);
            this.f2266l = true;
        }
        if (i12 == Integer.MIN_VALUE || i13 == Integer.MIN_VALUE) {
            return 1.0f;
        }
        return Math.min(1.0f, c(i10, i11, i12, i13));
    }
}
