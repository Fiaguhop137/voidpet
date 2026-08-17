package Dd;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: Dd.a$a, reason: collision with other inner class name */
    public static final class C0048a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f2402a;

        C0048a(Function0 function0) {
            this.f2402a = function0;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f2402a.invoke();
        }
    }

    public static final Thread a(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C0048a c0048a = new C0048a(block);
        if (z11) {
            c0048a.setDaemon(true);
        }
        if (i10 > 0) {
            c0048a.setPriority(i10);
        }
        if (str != null) {
            c0048a.setName(str);
        }
        if (classLoader != null) {
            c0048a.setContextClassLoader(classLoader);
        }
        if (z10) {
            c0048a.start();
        }
        return c0048a;
    }

    public static /* synthetic */ Thread b(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            classLoader = null;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        String str2 = str;
        return a(z10, z11, classLoader, str2, i12, function0);
    }
}
