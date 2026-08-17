package p442ya;

import O8.AbstractC1263l;
import O8.L;
import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import p388va.a;

/* JADX INFO: loaded from: classes2.dex */
final class h implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC1263l f57994c = AbstractC1263l.j("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f57995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f57996b;

    h(Context context, a aVar, L l10) {
        this.f57995a = context;
        this.f57996b = l10;
    }

    static boolean a(Context context) {
        return DynamiteModule.a(context, "com.google.mlkit.dynamite.barcode") > 0;
    }
}
