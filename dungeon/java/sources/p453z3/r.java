package p453z3;

import If.InterfaceC1108j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f58443a = a.f58447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f58444b = new C4383o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f58445c = new C4384p();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f58446d = new C4385q();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f58447a = new a();

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static boolean d(String str, InterfaceC1108j interfaceC1108j) {
        if (str != null) {
            return Intrinsics.b(str, "image/jpeg") || Intrinsics.b(str, "image/webp") || Intrinsics.b(str, "image/heic") || Intrinsics.b(str, "image/heif");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static boolean e(String str, InterfaceC1108j interfaceC1108j) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static boolean f(String str, InterfaceC1108j interfaceC1108j) {
        return true;
    }

    boolean c(String str, InterfaceC1108j interfaceC1108j);
}
