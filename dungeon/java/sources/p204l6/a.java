package p204l6;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import p025b6.e;
import p025b6.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements p007a6.a {
    @Override // p007a6.a
    public boolean a(e image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof g;
    }

    @Override // p007a6.a
    public Drawable b(e image) {
        Intrinsics.checkNotNullParameter(image, "image");
        g gVar = image instanceof g ? (g) image : null;
        if (gVar != null) {
            return gVar.U2();
        }
        return null;
    }
}
