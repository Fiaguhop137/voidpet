package Xa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class F0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15571a;

        static {
            int[] iArr = new int[E0.values().length];
            try {
                iArr[E0.UnknownReplacementMode.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[E0.WithTimeProration.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[E0.ChargeProratedPrice.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[E0.WithoutProration.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[E0.ChargeFullPrice.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[E0.Deferred.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[E0.KeepExisting.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f15571a = iArr;
        }
    }

    public static final int a(E0 e10) {
        Intrinsics.checkNotNullParameter(e10, "<this>");
        switch (a.f15571a[e10.ordinal()]) {
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
            case 7:
                return 6;
            default:
                throw new Ad.n();
        }
    }
}
