package Wb;

import Ad.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14998a;

        static {
            int[] iArr = new int[p263ob.c.values().length];
            try {
                iArr[p263ob.c.Trace.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p263ob.c.Timer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p263ob.c.Stacktrace.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p263ob.c.Debug.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p263ob.c.Info.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p263ob.c.Warn.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p263ob.c.Error.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[p263ob.c.Fatal.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f14998a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(p263ob.c cVar) {
        switch (a.f14998a[cVar.ordinal()]) {
            case 1:
                return "ExpoModulesCoreJSLogger.onNewTrace";
            case 2:
                return "ExpoModulesCoreJSLogger.onNewDebug";
            case 3:
                return "ExpoModulesCoreJSLogger.onNewTrace";
            case 4:
                return "ExpoModulesCoreJSLogger.onNewDebug";
            case 5:
                return "ExpoModulesCoreJSLogger.onNewInfo";
            case 6:
                return "ExpoModulesCoreJSLogger.onNewWarning";
            case 7:
            case 8:
                return "ExpoModulesCoreJSLogger.onNewError";
            default:
                throw new n();
        }
    }
}
