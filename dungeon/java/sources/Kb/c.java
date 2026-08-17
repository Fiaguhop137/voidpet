package Kb;

import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends PictureDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6167b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Picture picture, int i10, int i11) {
        super(picture);
        Intrinsics.checkNotNullParameter(picture, "picture");
        this.f6166a = i10;
        this.f6167b = i11;
    }

    public final int a() {
        return this.f6167b;
    }

    public final int b() {
        return this.f6166a;
    }
}
