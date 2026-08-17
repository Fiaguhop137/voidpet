package Cb;

import Rb.u;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m {
    public static final void a(u uVar, String code, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(code, "code");
        try {
            uVar.reject(code, str, th);
        } catch (RuntimeException e10) {
            Log.d("IapPromises", "Already consumed " + e10.getMessage());
        }
    }

    public static final void b(u uVar, Object obj) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        try {
            uVar.resolve(obj);
        } catch (RuntimeException e10) {
            Log.d("IapPromises", "Already consumed " + e10.getMessage());
        }
    }
}
