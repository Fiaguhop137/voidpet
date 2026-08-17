package p263ob;

import Ad.n;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public enum c {
    Trace("trace"),
    Timer("timer"),
    Stacktrace("stacktrace"),
    Debug("debug"),
    Info("info"),
    Warn("warn"),
    Error("error"),
    Fatal("fatal");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50524a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f50523l = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50513b = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: ob.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0600a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f50525a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.Trace.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.Timer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.Stacktrace.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.Debug.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[c.Info.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[c.Warn.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[c.Error.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[c.Fatal.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f50525a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(c type) {
            Intrinsics.checkNotNullParameter(type, "type");
            switch (C0600a.f50525a[type.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return 3;
                case 5:
                    return 4;
                case 6:
                    return 5;
                case 7:
                    return 6;
                case 8:
                    return 7;
                default:
                    throw new n();
            }
        }
    }

    c(String str) {
        this.f50524a = str;
    }

    public final String g() {
        return this.f50524a;
    }
}
