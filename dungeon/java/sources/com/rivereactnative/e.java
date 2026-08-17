package com.rivereactnative;

import app.rive.runtime.kotlin.core.Fit;
import java.util.NoSuchElementException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public enum e {
    Cover("cover"),
    Contain("contain"),
    Fill("fill"),
    FitWidth("fitWidth"),
    FitHeight("fitHeight"),
    None("none"),
    ScaleDown("scaleDown"),
    Layout("layout");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38700a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f38699l = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38689b = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: com.rivereactnative.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0424a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f38701a;

            static {
                int[] iArr = new int[e.values().length];
                try {
                    iArr[e.Cover.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.Contain.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.Fill.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[e.FitWidth.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[e.FitHeight.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[e.None.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[e.ScaleDown.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[e.Layout.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f38701a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(String fit) {
            Intrinsics.checkNotNullParameter(fit, "fit");
            for (e eVar : e.values()) {
                if (Intrinsics.b(eVar.toString(), fit)) {
                    return e.valueOf(eVar.name());
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public final Fit b(e rnFit) {
            Intrinsics.checkNotNullParameter(rnFit, "rnFit");
            switch (C0424a.f38701a[rnFit.ordinal()]) {
                case 1:
                    return Fit.COVER;
                case 2:
                    return Fit.CONTAIN;
                case 3:
                    return Fit.FILL;
                case 4:
                    return Fit.FIT_WIDTH;
                case 5:
                    return Fit.FIT_HEIGHT;
                case 6:
                    return Fit.NONE;
                case 7:
                    return Fit.SCALE_DOWN;
                case 8:
                    return Fit.LAYOUT;
                default:
                    throw new Ad.n();
            }
        }
    }

    e(String str) {
        this.f38700a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38700a;
    }
}
